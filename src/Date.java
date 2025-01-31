public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    };

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    public void setDay(int day){
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day: " + day);
        }
    }
    public void setMonth(int month){
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
    public void setYear(int year) {
        if (year >= 1900 && year <= 1999) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year: " + year);
        }
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        }

    public String toString(){
        return String.format("%02d/%02d/%d", this.day, this.month, this.year);
    }

}

