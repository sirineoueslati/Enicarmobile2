package com.example.oueslatisirine.enicarmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class evenementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evenement);

         /*MaterialCalendarView calendrier = (MaterialCalendarView) findViewById(R.id.calendarView);
         calendrier.state().edit()
                .setFirstDayOfWeek(Calendar.MONDAY)
                .setMinimumDate(CalendarDay.from(1980, 1, 1))
                .setMaximumDate(CalendarDay.from(2100, 12, 31))
                .setCalendarDisplayMode(CalendarMode.MONTHS)
                .commit();*/
    }
}
