package com.example.mvvmnews.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Children implements Parcelable {
    private String kind;
    private DataSubModel data;

    public Children(String kind, DataSubModel data) {
        this.kind = kind;
        this.data = data;
    }

    public Children() {
    }

    protected Children(Parcel in) {
        kind = in.readString();
    }

    public static final Creator<Children> CREATOR = new Creator<Children>() {
        @Override
        public Children createFromParcel(Parcel in) {
            return new Children(in);
        }

        @Override
        public Children[] newArray(int size) {
            return new Children[size];
        }
    };

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DataSubModel getData() {
        return data;
    }

    public void setData(DataSubModel data) {
        this.data = data;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(kind);
    }
}
