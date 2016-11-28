package sinhadroid.citylist_mvp.networking.converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by deepanshu on 17/11/16.
 */
public class JsonpParser {

    private static final Pattern JSONP = Pattern.compile("(?s)\\w+\\((.*)\\).*");

    public static String jsonpToJson(String jsonStr) {
        Matcher matcher = JSONP.matcher(jsonStr);
        if(matcher.find()) {
            return matcher.group(1);
        } else {
            throw new IllegalArgumentException("Unknown jsonp format");
        }
    }
}
