package com.company;
/*
 * Author: Chris V
 * Last edited: 6/1/2020
 *
 * This is a simple program that uses method overloading to
 * convert (minutes and seconds) or (seconds) to hours, minutes, and seconds.
 */
public class Main {

    public static void main(String[] args) {
        // test method calls
        String result = getDurationString(61, 52);
        System.out.println(result);

        result = getDurationString(61);
        System.out.println(result);
    }

    // convert minutes and seconds to hours, minutes, seconds
    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0) {
            return "Invalid value";
        }

        if(seconds < 0 || seconds > 60) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String result = hours + "h " + remainingMinutes + "m " + seconds + "s";
        return result;
    }

    // convert seconds to hours, minutes, seconds
    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }

        // calculate minutes and remaining seconds then call
        // getDurationString(minutes, seconds)
        int minutes = seconds / 60;
        int remaningSeconds = minutes % 60;

        String result = getDurationString(minutes, remaningSeconds);
        return result;
    }
}
