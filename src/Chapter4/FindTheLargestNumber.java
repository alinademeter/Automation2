package Chapter4;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = 0;

        while (counter <=10)
        {
            System.out.print("Enter a number: ");
            int numbers = input.nextInt();
            if( counter ==1)
                largest = numbers;
            else if (numbers > largest)
                largest = numbers;
         counter++;

        }
        System.out.printf("Largest number is %d%n", largest);
    }
}

