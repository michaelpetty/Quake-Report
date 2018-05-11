package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private String mEventCity;
    private Date mEventDate;
    private Float mEventMag;

    public Earthquake(String eventCity, Date eventDate, Float eventMag) {
        mEventCity = eventCity;
        mEventDate = eventDate;
        mEventMag = eventMag;
    }

    public String getEventCity() {
        return mEventCity;
    }

    public Date getEventDate() {
        return mEventDate;
    }

    public Float getEventMag() {
        return mEventMag;
    }
}
