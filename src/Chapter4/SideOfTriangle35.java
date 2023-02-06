package Chapter4;

import java.util.Scanner;

public class SideOfTriangle35 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        if (number1 <1 || number2 <1 || number3 <1)
        {
            System.err.println("The entered number should not be less than 1");
        }else if (number1 > 1 || number2 > 1 || number3 >1)
        {
            System.out.println("The numbers could represent the sides of a triangle");
        }

    }

}
