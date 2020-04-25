package com.example.mvvmnews.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmnews.models.Children;
import com.example.mvvmnews.repositories.NewsRepository;

import java.util.List;

public class NewsListViewModel extends ViewModel {

    private NewsRepository newsRepository;
    public NewsListViewModel() {
        newsRepository = NewsRepository.getInstance();
    }

    public LiveData<List<Children>> getNews(){
        return newsRepository.getNews();
    }
}
