package sinhadroid.citylist_mvp.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import javax.inject.Inject;

import sinhadroid.citylist_mvp.BaseApp;
import sinhadroid.citylist_mvp.R;
import sinhadroid.citylist_mvp.models.CityListData;
import sinhadroid.citylist_mvp.models.CityListResponse;
import sinhadroid.citylist_mvp.networking.Service;

public class HomeActivity extends BaseApp implements HomeView {

    private RecyclerView mRecyclerView;
    @Inject
    public Service service;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDeps().inject(this);

        renderView();
        init();

        HomePresenter mHomePresenter = new HomePresenter(service, this);
        mHomePresenter.getCityList();
    }

    private void renderView() {
        setContentView(R.layout.activity_home);
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
    }

    private void init() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showWait() {
       progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void removeWait() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void getCityListSuccess(CityListResponse cityListResponse) {

        HomeAdapter adapter = new HomeAdapter(getApplicationContext(),
                cityListResponse.getData(),
                new HomeAdapter.OnItemClickListener() {
                    @Override
                    public void onClick(CityListData item) {

                    }
                });

        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailure(String getAppErrorMessage) {

    }
}
