package Chapter3;

import java.util.Calendar;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDate;
    private  int birthYear;

    public HeartRates(String firstName, String lastName, int birthMonth, int birthDate, int birthYear){
 this.lastName = lastName;
 this.firstName = firstName;
 this.birthMonth = birthMonth;
 this.birthDate = birthDate;
 this.birthYear = birthYear;
    }
    public int getMaximumHeartRate(){
        return 220 - getAge();
    }
    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR)- birthYear;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getBirthMonth(){
        return birthMonth;
    }
    public void setBirthMonth( int birthMonth){
        this.birthMonth = birthMonth;
    }
    public  int getBirthDate(){
        return birthDate;
    }
    public void setBirthDate( int birthDate){
        this.birthDate = birthDate;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setBirthYear( int birthYear){
        this.birthYear = birthYear;
    }

}


