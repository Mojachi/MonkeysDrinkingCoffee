/**
 * Created by benjamindavidpinter on 2/28/16.
 */
public class MonkeyTimer {
    double minutes;
    double hours;
    double days;
    double years;

    public MonkeyTimer(){
        resetCounter();
    }

    public void resetCounter(){
        minutes = 0;
        hours = 0;
        days = 0;
        years = 0;
    }

    public void addMinute() {
        minutes = minutes + 1;
        if(minutes == 60){
            addHour();
            minutes = 0;
        }
    }

    private void addHour() {
        hours = hours + 1;
        if(hours == 24){
            addDay();
            hours = 0;
        }
    }

    private void addDay() {
        days = days + 1;
        if(days == 365){
            addYear();
            days = 0;
        }
    }

    private void addYear() {
        years = years + 1;
    }
}
