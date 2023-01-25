package Chapter2;

import java.util.Scanner;

public class Separating_the_digits_30 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number1 = input.nextInt();

        if( number1 >=10000 && number1 <=99999){
            int firstNumber = number1/10000;
            int secondNumber = number1/1000 % 10;
            int thirdNumber = number1/100 % 10;
            int forthNumber = number1/10 % 10;
            int fifthNumber = number1 % 10;

            System.out.printf("%d   %d   %d   %d   %d, firstNumber, secondNumber, thirdNumber, forthNumber, fifthNumber");
        } else{
            System.out.println("Incorrect number");
        }
    }
}
