package Chapter2;

import java.util.Scanner;

public class Arithmetic15 {
    public static void main(String[] args) {

        //scanner for input from the command window
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        int product;
        int difference;
        int division;
        System.out.print("Enter first integer:");
        number1 = input.nextInt();

        System.out.print("Enter second integer:");
        number2 = input.nextInt();

        sum = number1+number2;
        System.out.printf("Sum is %d%n",sum);
        product = number1 * number2;
        System.out.printf("Product is %d%n", product);
        difference = number1 - number2;
        System.out.printf("Difference is %d%n", difference);
        division = number1 / number2;
        System.out.printf("Division is %d%n", division);

    }
}
