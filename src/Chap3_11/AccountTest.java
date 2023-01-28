package Chap3_11;

import java.util.Scanner;

public class AccountTest {
    public static void main(String [] args){
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", 100.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("Withdraw deposit amount for account1: ");
        double withdrawlAmount = input.nextDouble();
        System.out.printf("%ndecreasing %.2f to account1 balance%n%n", withdrawlAmount);
        account1.deposit(withdrawlAmount);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(),account2.getBalance());

        System.out.print("Enter deposit amount for account2:");
        withdrawlAmount = input.nextDouble();
        System.out.printf("%nsubtracting %2f to account2 balance%n%n",withdrawlAmount);
        account2.deposit(withdrawlAmount);


        System.out.printf("%s balance: $ %n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $ %n", account2.getName(),account2.getBalance());


    }
}
