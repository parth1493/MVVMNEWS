package com.example.mvvmnews.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.List;

public class Data {
    private String modhash;
    private int dist;
    private List<Children> children;

    public Data(String modhash, int dist, List<Children> children) {
        this.modhash = modhash;
        this.dist = dist;
        this.children = children;
    }

    public String getModhash() {
        return modhash;
    }

    public int getDist() {
        return dist;
    }

    public List<Children> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Data{" +
                "modhash='" + modhash + '\'' +
                ", dist=" + dist +
                ", children=" + children +
                '}';
    }
}
