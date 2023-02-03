package Chapter3;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private  int year;
    private double height;
private double weight;
public HealthProfile(  String firstName, String lastName, String gender, int month, int day, int year, double height, double weight ){
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
this.month = month;
this.day = day;
this.year = year;
this.height = height;
this.weight = weight;
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
public String getGender(){
    return gender;
}
public void setGender( String gender){
    this.gender = gender;
}
public  int getMonth(){
    return month;
}
public void setMonth( int month){
    this.month = month;
}
public int getDay(){
    return day;
}
public void setDay( int day){
    this.day = day;

}
}
