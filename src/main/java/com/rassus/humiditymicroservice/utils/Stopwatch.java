package com.rassus.humiditymicroservice.utils;

public class Stopwatch {
    private static long startTime;

    private static long getTimeElapsedMillis() {
        return System.currentTimeMillis();
    }

    public static int getTimeElapsedSeconds() {
        return (int) (getTimeElapsedMillis() / 1000.0);
    }

    public static void setStartTime(long startTime) {
        Stopwatch.startTime = startTime;
    }
}