package sinhadroid.citylist_mvp.home;

import sinhadroid.citylist_mvp.models.CityListResponse;

/**
 * Created by deepanshu on 25/10/16.
 */

public interface HomeView {
    void showWait();

    void removeWait();

    void getCityListSuccess(CityListResponse cityListResponse);

    void onFailure(String getAppErrorMessage);
}
