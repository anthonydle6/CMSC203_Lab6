package Lab6;

public class SavingsAccount extends BankAccount 
{
    private static final double RATE = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialBalance) 
    {
        super(name, initialBalance);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount originalAccount, double initialBalance) 
    {
        super(originalAccount, initialBalance);
        this.savingsNumber = originalAccount.savingsNumber + 1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() 
    {
        double monthlyInterest = getBalance() * RATE / 12;
        deposit(monthlyInterest);
    }

    @Override
    public String getAccountNumber() 
    {
        return accountNumber;
    }
}

