package Chapter4;

public class CreditLimitCalculator {
    private int accountNumber;
    private int balance;
    private int totalItemsCharged;
    private int totalCreditsApplied;
    private int creditLimit;

    public CreditLimitCalculator(int accountNumber, int balance, int totalItemsCharged, int totalCreditsApplied, int creditLimit) {
        this.accountNumber = accountNumber;
       if (balance > 0)
           this.balance = balance;
        this.totalItemsCharged = totalItemsCharged;
        this.totalCreditsApplied = totalCreditsApplied;
        this.creditLimit = creditLimit;
    }
public void widrawl(int  widrawlAccount)
{
    if (widrawlAccount > 0.0)
        balance = balance - widrawlAccount;
}
public int getBalance ()
{
    return balance;
}
public int getAccountNumber()
{
      return accountNumber;
}
public void setAccountNumber(int accountNumber)
{
    this.accountNumber = accountNumber;
}
}
