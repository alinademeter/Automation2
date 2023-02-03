package Chapter4;

import java.util.Scanner;

public class SalaryCalculator20 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double workedHours;
        System.out.print("Enter the worked hours: ");
        workedHours = input.nextInt();
        if( workedHours > 40)
            System.out.println(workedHours/20);
    }
}
