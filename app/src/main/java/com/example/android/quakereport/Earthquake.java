package com.example.android.quakereport;

public class Earthquake {

    private String mEventCity;
    private Long mEventDate;
    private Double mEventMag;

    public Earthquake(String eventCity, Long eventDate, Double eventMag) {
        mEventCity = eventCity;
        mEventDate = eventDate;
        mEventMag = eventMag;
    }

    public String getEventCity() {
        return mEventCity;
    }

    public Long getEventDate() {
        return mEventDate;
    }

    public Double getEventMag() {
        return mEventMag;
    }
}
