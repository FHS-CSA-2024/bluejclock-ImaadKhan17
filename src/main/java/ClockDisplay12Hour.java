package main.java.src.main.java;


public class ClockDisplay12Hour extends ClockDisplay
{
  private boolean am;
    public ClockDisplay12Hour(){
        super();
        am = true;
    }

    public void setTime(int hour, int minute, boolean isAm) {
        super.setTime(hour, minute);
        am = isAm;
    }

    @Override
    public void timeTick() {
        minutes.increment();

        if (minutes.getValue() == 0){
            hours.increment();
            if (hours.getValue() == 0){
                am = !am;
            }
        }

        updateDisplay();
    }

    public String checkAMPM(){
        if (am){
            return "AM";
        }
        else{
            return "PM";
        }
    }

    @Override
    public void  updateDisplay(){
        String output = "";

        output = hours.getDisplayValue();
        output = output + ":";
        output = output + minutes.getValue();
        output = output + checkAMPM();


        display = output;
    }
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
    //Update all methods and parameters to accomodate this change
}
