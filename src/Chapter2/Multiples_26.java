package Chapter2;

import java.util.Scanner;

public class Multiples_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        if(number1 % number2 ==0)
            System.out.print("Number2 is multiple of number1");
        if (number2 % number1 ==0)
            System.out.print("Number1 is a multiple of number2");
    }
}
