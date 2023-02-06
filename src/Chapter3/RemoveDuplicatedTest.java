package Chapter3;

import java.util.Scanner;

public class RemoveDuplicatedTest {
   public static void main(String [] args){
       RemoveDuplicated removeDuplicated1 = new RemoveDuplicated("Alina", 50.00);
       RemoveDuplicated removeDuplicated2 = new RemoveDuplicated("Alina2", -7.53);

       displayAccount(removeDuplicated1);
       displayAccount(removeDuplicated2);
       System.out.println();
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter deposit amount for account1: "); // prompt
       double depositAmount = input.nextDouble(); // obtain user input
       System.out.printf("adding %.2f to account1 balance%n%n", depositAmount);
       removeDuplicated1.deposit(depositAmount); // add to account1's balance

       displayAccount(removeDuplicated1);
       displayAccount(removeDuplicated2);
       System.out.println();

       System.out.print("Please enter deposit amount for account2: "); // prompt
       depositAmount = input.nextDouble(); // obtain user input
       System.out.printf("adding %.2f to account2 balance%n%n", depositAmount);
       removeDuplicated2.deposit(depositAmount); // add to account2 balance

       displayAccount(removeDuplicated1);
       displayAccount(removeDuplicated2);


   }
    public static void displayAccount( RemoveDuplicated removeDuplicated1) {
        System.out.printf("%s balance: $%.2f%n", removeDuplicated1.getName(),removeDuplicated1.getBalance());
    }
}
