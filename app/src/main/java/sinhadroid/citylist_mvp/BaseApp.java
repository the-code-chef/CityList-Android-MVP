package sinhadroid.citylist_mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

import sinhadroid.citylist_mvp.deps.DaggerDeps;
import sinhadroid.citylist_mvp.deps.Deps;
import sinhadroid.citylist_mvp.networking.NetworkModule;

/**
 * Created by deepanshu on 25/10/16.
 */

public class BaseApp extends AppCompatActivity {

    Deps deps;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        deps = DaggerDeps.builder().networkModule(new NetworkModule(cacheFile)).build();
    }

    public Deps getDeps() {
        return deps;
    }
}
