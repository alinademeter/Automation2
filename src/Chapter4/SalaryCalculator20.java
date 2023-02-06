package Chapter4;

import java.util.Scanner;

public class SalaryCalculator20 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double workedHours;
        double pay;
        double rate;
        System.out.print("Enter the worked hours: ");
        workedHours = input.nextDouble();
        System.out.print("Enter the hourly rate : ");
         rate = input.nextDouble();
        if (workedHours > 40) {
            pay = 40 * rate +(workedHours -40)* 1.5 * rate;

        } else {
            pay = workedHours * rate;
        }
        System.out.println("Gross pay for Employee is  "+ pay);
    }
}
