package Chapter3;

public class Date {
    private int month;
    private  int day;
    private int year;
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void displayDate() {
       System.out.printf("%02d/%02d/%04d%n",month,day,year);
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        if (month > 0){
            this.month = month;
        }
    }
    public int getDay(){
        return day;
    }
    public void setDay( int day){
        if (day > 0){
            this.day=day;
        }
    }
    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

