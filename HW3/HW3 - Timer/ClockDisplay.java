package com.company;

/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before
 * midnight).
 *
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 *
 * @author Michael Kolling and David J. Barnes and Abtin Zandi
 * @version 2008.03.30
 */
public class ClockDisplay
{
    private NumberDisplay hours;     // clock hours
    private NumberDisplay minutes;   // clock minutes
    private NumberDisplay seconds;   // clock seconds
    private String displayString;    // simulates the actual display
    private Timer timer; // clock timer

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        timer = new Timer();
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the
     * parameters.
     */
    public ClockDisplay(int hour, int minute,int second)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute,second);
    }



    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        seconds.increment();
        if(seconds.getValue() == 0){
            minutes.increment();
            if(minutes.getValue() == 0) {  // it just rolled over!
                hours.increment();
            }
        }
        updateDisplay();

    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute,int second)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }
    /**
     * This method will check the limitations of timer
     */
    public Boolean checkTimer(){
        if(timer.getHour() == hours.getValue() &&  timer.getMinutes() == minutes.getValue() && timer.getSeconds() == seconds.getValue()){
            System.out.println("Time is up !");
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * This method will set the limitations of timer
     * @param secondLimit
     * @param minuteLimit
     * @param hourLimit
     */
    public void setTimer(int secondLimit,int minuteLimit,int hourLimit){
        timer.setHours(hourLimit);
        timer.setMinutes(minuteLimit);
        timer.setSeconds(secondLimit);
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }

    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" +
                minutes.getDisplayValue()+":"+seconds.getDisplayValue();
    }
}