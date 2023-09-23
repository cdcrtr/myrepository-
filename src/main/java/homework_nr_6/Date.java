package homework_nr_6;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        if (1<=day&&day<=31){
            this.day = day;
        }   else {
            System.out.println("ERROR! -> Wrong day has been entered!");
        }
    }
    public void setMonth(int month) {
        if (1<=month&&month<=12){
            this.month = month;
        }   else {
            System.out.println("ERROR! -> Wrong month has been entered!");
        }
    }

    public void setYear(int year) {
        if (year==2023){
            this.year = year;
        }   else {
            System.out.println("ERROR! -> Wrong year has been entered!");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}