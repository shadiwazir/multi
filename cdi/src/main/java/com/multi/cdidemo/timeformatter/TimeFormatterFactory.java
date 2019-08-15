package com.multi.cdidemo.timeformatter;

import javax.enterprise.inject.Produces;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeFormatterFactory {

    @Produces
    public TimeFormatter getTimeFormatter() {
        return new TimeFormatter(new SimpleDateFormat("HH:mm"), Calendar.getInstance());
    }

}
