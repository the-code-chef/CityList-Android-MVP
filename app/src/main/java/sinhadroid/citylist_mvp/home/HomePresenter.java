package sinhadroid.citylist_mvp.home;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
import sinhadroid.citylist_mvp.models.CityListResponse;
import sinhadroid.citylist_mvp.networking.NetworkError;
import sinhadroid.citylist_mvp.networking.Service;

/**
 * Created by deepanshu on 25/10/16.
 */

public class HomePresenter {

    private final Service service;
    private HomeView homeView;
    private CompositeSubscription compositeSubscription;

    public HomePresenter(Service service, HomeView homeView) {
        this.service = service;
        this.homeView = homeView;
        this.compositeSubscription = new CompositeSubscription();
    }

    public void getCityList() {
        homeView.showWait();

        Subscription subscription = service.getCityList(new Service.GetCityListCallback() {
            @Override
            public void onSuccess(CityListResponse cityListResponse) {
                homeView.removeWait();
                homeView.getCityListSuccess(cityListResponse);
            }

            @Override
            public void onError(NetworkError networkError) {
                homeView.removeWait();
                homeView.onFailure(networkError.getAppErrorMessage());
            }
        });
    }
}
