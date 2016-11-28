package sinhadroid.citylist_mvp.networking.converter;

import com.google.gson.Gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * Created by deepanshu on 17/11/16.
 */

public class JsonpGsonConverterFactory extends Converter.Factory {

    public static JsonpGsonConverterFactory create() {
        return create(new Gson());
    }

    private static JsonpGsonConverterFactory create(Gson gson) {
        return new JsonpGsonConverterFactory(gson);
    }

    private final Gson gson;

    private JsonpGsonConverterFactory(Gson gson) {
        if (gson == null) throw new NullPointerException("gson == null");
        this.gson = gson;
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return new GsonRequestBodyConverter<>(gson, type);
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return new JsonpGsonResponseBodyConverter<>(gson, type);
    }
}
