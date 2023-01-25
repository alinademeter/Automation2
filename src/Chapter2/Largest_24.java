package Chapter2;

import java.util.Scanner;

public class Largest_24 {
    public static void main(String[]args)

    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int largest;
        int smallest;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        System.out.print("Enter forth integer: ");
        number4 = input.nextInt();

        System.out.print("Enter fifth integer: ");
        number5 = input.nextInt();
       largest = number1;
       if( number2 > number1) largest = number2;
       if(number3 > largest) largest = number3;
       if( number4 >largest) largest = number4;
       if (number5 > largest) largest = number5;

       System.out.println("largest number is "+ largest);
       smallest= number1;
       if (number2 < number1) smallest =number2;
       if (number3 < smallest) smallest =number3;
       if (number4 < smallest) smallest = number4;
       if (number5 < smallest) smallest = number5;
       System.out.println("smallest number is "+ smallest);
    }
}
