package sinhadroid.citylist_mvp.networking.converter;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by deepanshu on 17/11/16.
 */
public class Utils {

    static void closeQuietly(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
        } catch (IOException ignored) {
        }
    }
}
