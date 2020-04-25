package com.example.mvvmnews;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmnews.models.Children;
import com.example.mvvmnews.models.Default;
import com.example.mvvmnews.request.NewsApi;
import com.example.mvvmnews.request.ServiceGenerator;
import com.example.mvvmnews.viewmodel.NewsListViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsListActivity extends BaseActivity {

    private NewsListViewModel newsListViewModel;

    private static final String TAG = "NewsListActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);

        newsListViewModel = new ViewModelProvider(this).get(NewsListViewModel.class);

        findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mProgressBar.getVisibility() == View.VISIBLE){
                    showProgressBar(false);
                    Log.d("Hello", "onClick:1 ");
                }
                else{
                    testRetrofitRequest();
                }
            }
        });
        subscribeObserver();
    }

    private void subscribeObserver(){
        newsListViewModel.getNews().observe(this, new Observer<List<Children>>() {
            @Override
            public void onChanged(List<Children> children) {

            }
        });
    }

    private void testRetrofitRequest(){
        NewsApi newsApi = ServiceGenerator.getRecipeApi();

        Call<Default> responseNews = newsApi.getNews();

        responseNews.enqueue(new Callback<Default>() {
            @Override
            public void onResponse(Call<Default> call, Response<Default> response) {
                Log.d(TAG, "onResponse: "+ response.body());
                if(response.code() == 200){
                    Log.i(TAG, "onResponse: "+response.body().getData().getChildren());
                    List<Children> children = response.body().getData().getChildren();
                    for(Children children1: children){
                        Log.i(TAG, "onResponse: "+ children1.getData().getTitle());
                    }
                }else {
                    Log.d(TAG, "onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<Default> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t);
            }
        });
    }
}
