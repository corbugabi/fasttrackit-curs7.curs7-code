package ro.fasttrackit.curs7;

public class Clock {
    //class fields
    public static String TIP = "MANA";

    //state - fields
    private int hour;
    private int minutes;

    public Clock() {
        this(0, 0);
        this.hour = 0;
        this.minutes = 0;
    }

    public Clock(int hour) {
        this(hour, 0);
        this.hour = hour;
        this.minutes = 0;
    }

    public Clock(int hour, int minutes) {
        setHour(hour);
        setMinutes(minutes);
    }

    //behavior
    String readTime() {
        return printTimeElement(hour) + ":" + printTimeElement(minutes);
    }

    private String printTimeElement(int number) {
        //operator ternar <condition>?:<if-true>:<else>
        return number < 10 ? "0" + number : "" + number;
        //echivalent cu:
        //      if(number < 10){
        //         return "0" +number;
        //       }else{
        //           return "" + number;
        //       }
    }

    public void addMinutes(int minutes) {
        if (minutes > 0) {
            int newMinutes = this.minutes + minutes;

            this.hour =this.hour  + newMinutes / 60;
     //       this.hour = (this.hour + newMinutes / 60)%24;
            this.minutes = newMinutes % 60;
        }
    }

    int getHour() {
        return hour;
    }

    int getMinutes() {
        return minutes;
    }

    void setHour(int newHour) {
        if (newHour < 0) {
            hour = 0;
        } else if (newHour > 23) {
            hour = 23;
        } else {
            hour = newHour;
        }
    }

    void setMinutes(int minutes) {
        if (minutes < 0) {
            this.minutes = 0;
        } else if (minutes >= 60) {
            this.minutes = 59;
        } else {
            this.minutes = minutes;
        }
    }

    public  static void present(){
        System.out.println(TIP);
    }
}
