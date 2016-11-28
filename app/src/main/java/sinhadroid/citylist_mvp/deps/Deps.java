package sinhadroid.citylist_mvp.deps;

import javax.inject.Singleton;

import dagger.Component;
import sinhadroid.citylist_mvp.home.HomeActivity;
import sinhadroid.citylist_mvp.networking.NetworkModule;

/**
 * Created by deepanshu on 26/10/16.
 */

@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    void inject(HomeActivity homeActivity);
}
