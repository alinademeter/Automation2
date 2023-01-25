package Chapter2;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int radius;
        System.out.println("Enter radius of circle :");
        radius = input.nextInt();
        System.out.printf("%s%d%n", "The diameter is ", 2 * radius);
        System.out.printf("%s%f%n", "The circumference is ", 2 * Math.PI * radius);
        System.out.printf("%s%f%n", "The area is ", Math.PI * radius * radius);
    }
}
