package Chapter4;

public class CreditLimitCalculatorTest {
    public static void main(String [] args){
        CreditLimitCalculator account = new CreditLimitCalculator(12345,500,200,70,250);
        System.out.printf("account number is  %s balance: $ %n and the balance ", account.getAccountNumber(),account.getBalance());
    }
}
