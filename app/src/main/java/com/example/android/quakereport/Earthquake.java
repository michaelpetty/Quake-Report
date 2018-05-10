package com.example.android.quakereport;

public class Earthquake {

    private String mEventCity;
    private String mEventDate;
    private String mEventMag;

    public Earthquake(String eventCity, String eventDate, String eventMag) {
        mEventCity = eventCity;
        mEventDate = eventDate;
        mEventMag = eventMag;
    }

    public String getEventCity() {
        return mEventCity;
    }

    public String getEventDate() {
        return mEventDate;
    }

    public String getEventMag() {
        return mEventMag;
    }
}
