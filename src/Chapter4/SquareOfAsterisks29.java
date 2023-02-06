package Chapter4;

import java.util.Scanner;

public class SquareOfAsterisks29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row =1;
        int col = 1;
        System.out.print("Enter the size of the square ");
        int size = input.nextInt();
        while (size < 1 || size > 20) {
            System.out.print("Enter a size between 1 and 20: ");
            size = input.nextInt();

        }
        while (row <=size)
        {
            while (col <= size){
                if (row ==1|| row == size || col >= 1 || col == size)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }

    }

}


