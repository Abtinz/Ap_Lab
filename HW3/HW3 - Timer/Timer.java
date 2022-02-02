package com.company;

/**
 * Timer class for checking the limited time for alert
 *
 */
public class Timer {
    private NumberDisplay hours;     // clock hours
    private NumberDisplay minutes;   // clock minutes
    private NumberDisplay seconds;   // clock seconds
    private String displayString;    // simulates the actual display

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at 00:00.
     */
    public Timer()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
    }

    /***
     * This method will set the limitation of Timer Hours
     * @param hours
     */
    public void setHours(int hours) {
        this.hours.setValue(hours);
    }

    /***
     * This method will set the limitation of Timer minutes
     * @param minutes
     */
    public void setMinutes(int minutes) {
        this.minutes.setValue(minutes);
    }

    /***
     * This method will set the limitation of Timer seconds
     * @param seconds
     */
    public void setSeconds(int seconds) {
        this.seconds.setValue(seconds);
    }

    /**
     * This method will return the limitation of Timer hours
     * @return hours
     */
    public int getHour() {
        return hours.getValue();
    }

    /**
     * This method will return the limitation of Timer minutes
     * @return seconds
     */
    public int getMinutes() {
        return minutes.getValue();
    }

    /**
     * This method will return the limitation of Timer Seconds
     * @return seconds
     */
    public int getSeconds() {
        return seconds.getValue();
    }


}
