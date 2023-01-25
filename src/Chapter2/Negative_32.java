package Chapter2;

import java.util.Scanner;

public class Negative_32 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int number1;
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
int number2;
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        int number3;
                System.out.print("Enter third integer: ");
                        number3 = input.nextInt();
        int number4;
        System.out.print("Enter forth integer: ");
        number4 = input.nextInt();
        int number5;
        System.out.print("Enter fifth integer: ");
        number5 = input.nextInt();

        int negativeInput =0;
        int positiveInput =0;
        int zeroInput =0;

        if(number1 <0) negativeInput +=1;
        if (number2 <0) negativeInput +=1;
        if (number3 <0) negativeInput +=1;
        if (number4 <0) negativeInput +=1;
        if (number5 <0) negativeInput +=1;

        if (number1 >0) positiveInput +=1;
        if (number2 >0) positiveInput +=1;
        if (number3 >0) positiveInput +=1;
        if (number4 >0) positiveInput +=1;
        if (number5 >0) positiveInput +=1;

        if (number1 ==0) zeroInput +=1;
        if (number2 ==0) zeroInput +=1;
        if (number3 ==0)zeroInput +=1;
        if (number4 ==0) zeroInput +=1;
        if( number5 ==0) zeroInput +=1;

        System.out.println("The numbers of negative numbers input are "+ negativeInput);
        System.out.println("The numbers of positive numbers input are "+ positiveInput);
        System.out.println("The numbers of zero inputs are  "+ zeroInput);

    }
}
