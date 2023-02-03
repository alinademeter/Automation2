package Chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest1 = 0;
        int largest2 = 0;
        int numbers =0;

        while (counter <= 10) {
            System.out.print("Enter a number: ");
             numbers = input.nextInt();

            if (numbers > largest1) {
                largest2 = largest1;
                largest1 = numbers;
            } else if (numbers > largest2) {
                largest2 = numbers;

            }
            counter++;


        }

        System.out.printf("First largest number is  %d%n", largest1);
        System.out.printf("Second largest number is  %d%n", largest2);
    }
}

