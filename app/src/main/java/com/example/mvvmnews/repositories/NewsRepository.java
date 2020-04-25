package com.example.mvvmnews.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvmnews.models.Children;

import java.util.List;

public class NewsRepository {

    private static NewsRepository instance;
    private MutableLiveData<List<Children>> mNews;

    public static NewsRepository getInstance(){
        if (instance == null){
            instance = new NewsRepository();
        }
        return instance;
    }

    private NewsRepository(){
        mNews = new MutableLiveData<>();
    }

    public LiveData<List<Children>> getNews(){
        return mNews;
    }
}
