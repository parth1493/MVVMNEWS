package com.example.mvvmnews.models;

import android.os.Parcel;
import android.os.Parcelable;

public class DataSubModel {

    private String subrediit;
    private String author_fullname;
    private String domain;
    private String title;

    public DataSubModel() {
    }

    public DataSubModel(String subrediit, String author_fullname, String domain, String title) {
        this.subrediit = subrediit;
        this.author_fullname = author_fullname;
        this.domain = domain;
        this.title = title;
    }

    public String getSubrediit() {
        return subrediit;
    }

    public void setSubrediit(String subrediit) {
        this.subrediit = subrediit;
    }

    public String getAuthor_fullname() {
        return author_fullname;
    }

    public void setAuthor_fullname(String author_fullname) {
        this.author_fullname = author_fullname;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DataSubModel{" +
                "subrediit='" + subrediit + '\'' +
                ", author_fullname='" + author_fullname + '\'' +
                ", domain='" + domain + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
