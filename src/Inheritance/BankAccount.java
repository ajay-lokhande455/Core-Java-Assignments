package Inheritance;
//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the
// account balance falls below one hundred.
public class BankAccount {
    public double Balance;

    public BankAccount(double initialBalance){
        this.Balance = initialBalance;
    }

    public void deposit(double amount){
        if (amount > 0){
            Balance += amount;
            System.out.println("Deposit amount : "+ amount + "Balance after deposit: "+ Balance);
        }
        System.out.println("invalid deposit amount..!");
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= Balance){
            Balance -= amount;
            System.out.println("Withdraw amount : "+ amount + "Balance after withdraw : "+Balance);
        }
    }
    public double getBalance(){
        return Balance;
    }
}
class SavingAccount extends BankAccount {
    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (Balance - amount >= 100) {
            super.deposit(amount);
        } else {
            System.out.println("Withdrawal denied. Balance cannot fall below $100.");
        }
    }

}

 class AccountTest {
    public static void main(String[] args) {
        BankAccount regularAccount = new BankAccount(500);
        SavingAccount savingsAccount = new SavingAccount(500 );

        System.out.println("Regular Account:");
        regularAccount.deposit(100);
        regularAccount.withdraw(550);

        System.out.println("\nSavings Account:");
        savingsAccount.deposit(100);
        savingsAccount.withdraw(550);
    }
}