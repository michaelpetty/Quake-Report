/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /** Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
        earthquakes.add(new Earthquake("San Francisco", parseStringDate("02/02/2016"), Double.valueOf("7.2")));
        earthquakes.add(new Earthquake("London", parseStringDate("8/29/1994"), Double.valueOf("6.5")));
        earthquakes.add(new Earthquake("Tokyo", parseStringDate("12/25/2004"), Double.valueOf("4.8")));
        earthquakes.add(new Earthquake("Mexico City", parseStringDate("5/14/2012"), Double.valueOf("4.3")));
        earthquakes.add(new Earthquake("Moscow", parseStringDate("3/26/1968"), Double.valueOf("8.5")));
        earthquakes.add(new Earthquake("Rio de Janeiro", parseStringDate("6/12/2000"), Double.valueOf("2.3")));
        earthquakes.add(new Earthquake("Paris", parseStringDate("7/15/2010"), Double.valueOf("6.9")));
         */

        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();


        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeArrayAdapter eAdapter = new EarthquakeArrayAdapter(
                this, earthquakes);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_earthquake);
        listView.setAdapter(eAdapter);
    }

    private Date parseStringDate(String stDate) {
            //formatter for date
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date dDate = new Date();

            try {
                dDate = sdf.parse(stDate);
            } catch(ParseException e) {
            }
            return dDate;
        }
}
