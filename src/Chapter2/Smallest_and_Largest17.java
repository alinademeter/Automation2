package Chapter2;

import java.util.Scanner;

public class Smallest_and_Largest17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1;//first number
        int number2;//second number
        int number3;// third number
        int sum; //sum of number1, number2 and number3
        int average;
        int product;
        int smallest;
        int largest;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        sum=number2+number2+number3;
        System.out.printf("Sum is %d%n",sum);

        average = (number1+number2+number3)/3;
        System.out.printf("Average is %d%n",average);

        product = number1*number2*number3;
        System.out.printf("Product is %d%n", product);
largest = number1;
if(number2 >number1)largest = number2;
if(number3 > largest) largest = number3;
System.out.println("largest number is "+ largest);
smallest = number1;
if (number2 < number1) smallest = number2;
if (number3 < smallest) smallest = number3;
System.out.println("smallest number is "+ smallest);




    }
}
