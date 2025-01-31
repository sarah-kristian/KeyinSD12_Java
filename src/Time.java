public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    };

    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour: " + hour);
        }
    }
    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute: " + minute);
        }
    }
    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second: " + second);
        }
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public Time nextSecond() {
        int newHour = this.hour;
        int newMinute = this.minute;
        int newSecond = this.second + 1;

        if (newSecond == 60) {
            newSecond = 0;
            newMinute += 1;
            if (newMinute == 60) {
                newMinute = 0;
                newHour += 1;
                if (newHour == 24) {
                    newHour = 0;
                }
            }
        }
        return new Time(newHour, newMinute, newSecond);
    }

    public Time previousSecond() {
        if (this.second == 0 && this.minute == 0) {
            if (this.hour == 0) {
                return new Time(23, 59, 59);
            } else {
                return new Time(this.hour - 1, 59, 59);
            }
        }
        if (this.second == 0) {
            return new Time(this.hour, this.minute - 1, this.second);
        }
        ;
        return new Time(this.hour, this.minute, this.second - 1);
    }
}

