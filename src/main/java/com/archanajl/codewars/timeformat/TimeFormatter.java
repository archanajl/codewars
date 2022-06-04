package com.archanajl.codewars.timeformat;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        int years =0;
        int days = 0;
        int hours = 0;
        int minutes = 0;

        if (seconds == 0) return "now";

        String result = "";
        List<String> timeMessage = new ArrayList<String>();

        if (seconds >= 31536000){
            years = seconds/31536000;
            seconds = seconds % 31536000;
        }
        if (seconds >= 86400){
            days = seconds/86400;
            seconds = seconds % 86400;
        }
        if (seconds >= 3600){
            hours = seconds/3600;
            seconds = seconds % 3600;
        }
        if (seconds >= 60){
            minutes = seconds/60;
            seconds = seconds % 60;
        }

        if (seconds > 1) timeMessage.add(seconds + " seconds");
        else if(seconds == 1) timeMessage.add(seconds + " second");

        if (minutes > 1) timeMessage.add(minutes + " minutes");
        else if(minutes ==1) timeMessage.add(minutes + " minute");

        if (hours > 1) timeMessage.add(hours + " hours");
        else if(hours ==1) timeMessage.add(hours + " hour");

        if (days > 1) timeMessage.add(days + " days");
        else if(days ==1) timeMessage.add(days + " day");

        if (years > 1) timeMessage.add(years + " years");
        else if(years == 1) timeMessage.add(years + " year");

        if (timeMessage.size() == 1)
            result = timeMessage.get(0);
        else if(timeMessage.size() == 2)
            result = timeMessage.get(1) + " and " + timeMessage.get(0);
        else if(timeMessage.size() > 2 ){
            for (int i=timeMessage.size() - 1 ; i>=2; i --){
                result += timeMessage.get(i) + ", ";
            }
            result += timeMessage.get(1) + " and " + timeMessage.get(0);
        }

        return result;
    }
}
