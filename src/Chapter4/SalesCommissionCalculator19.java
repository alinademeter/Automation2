package Chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator19 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int itemPrice=0;
        int value = 0;
        System.out.print("Enter numbers of items :");
        itemPrice= input.nextInt();
        System.out.print("Enter value  of the item :");
        value= input.nextInt();
        if(itemPrice>0)
            System.out.println((itemPrice*value)/9 +200);

    }
}
