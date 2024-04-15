package com.telran.prof.hometask.hashMap27032024.docSerpent;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Termin {

    public Date terminPick(int num) {
        GregorianCalendar calendar = new GregorianCalendar(2024, 03, 18);

        calendar.set(Calendar.HOUR_OF_DAY, 8);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.add(Calendar.MINUTE, 30 * (num - 1));

        return calendar.getTime();
    }
}
