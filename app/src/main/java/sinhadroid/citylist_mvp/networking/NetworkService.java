package sinhadroid.citylist_mvp.networking;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;
import sinhadroid.citylist_mvp.models.CityListResponse;

/**
 * Created by deepanshu on 25/10/16.
 */

public interface NetworkService {

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @GET("services/feeds/photos_public.gne?format=json")
    Observable<CityListResponse> getCityList();
}
