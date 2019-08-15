package com.multi.cdidemo.timeformatter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeFormatter {

    private SimpleDateFormat dateFormat;
    private Calendar calendar;

    public TimeFormatter(SimpleDateFormat simpleDateFormat, Calendar instance) {
        this.dateFormat = simpleDateFormat;
        this.calendar = instance;
    }

    public String getTime() {
        return dateFormat.format(calendar.getTime());
    }
}
