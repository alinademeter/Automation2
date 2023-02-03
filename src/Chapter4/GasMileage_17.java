package Chapter4;

import java.util.Scanner;

public class GasMileage_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gallons = 0;
        int totalmiles = 0;


        System.out.print("Enter miles per trip(-1 to quit): ");
        int miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter the gallons used or -1 to quit: ");
             miles = input.nextInt();
            totalmiles = totalmiles + miles;
            gallons = gallons + 1;


        }
        if( totalmiles != 0) {
         double average =(double) gallons / miles;
            System.out.printf("%nTotal   %d   is %d%n",
                    gallons, totalmiles);

            System.out.printf(" average for trip  is %.2f%n");


        } else
            System.out.println("No miles were entered");
    }
}
