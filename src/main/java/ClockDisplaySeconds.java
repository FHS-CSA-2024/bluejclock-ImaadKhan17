package main.java.src.main.java;


public class ClockDisplaySeconds
{
    private NumberDisplay seconds;
    private NumberDisplay minutes;
    private NumberDisplay hours;
    public String display;

    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(hour);
        minutes = new NumberDisplay(minute);
        seconds = new NumberDisplay(second);
        updateDisplay();
    }

    public void timeTick() {
        seconds.increment();

        if (seconds.getValue() == 0){
            minutes.increment();
            if (minutes.getValue() == 0){
                hours.increment();
            }
        }

        updateDisplay();
    }


    public void setTime(int hour, int minute, int second) {
        minutes.setValue(minute);
        hours.setValue(hour);
        seconds.setValue(second);

        updateDisplay();
    }
    public String getTime() {
        return display;
    }

    public void  updateDisplay(){
        String output = "";

        output = hours.getDisplayValue();
        output = output + ":";
        output = output + minutes.getValue();
        output = output + ":";
        output = output + seconds.getValue();

        display = output;
    }
}
