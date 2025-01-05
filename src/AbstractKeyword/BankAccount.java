package AbstractKeyword;
//Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
// Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the
// respective methods to handle deposits and withdrawals for each account type.
public abstract class BankAccount {
    protected double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    public double getBalance(){
        return balance;
    }
}
class SavingAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(double balance,double interestRate){
        super(balance);
        this.interestRate= interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount * interestRate / 100;
        System.out.println("Deposited " + amount + " into SavingsAccount. Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("withdraw  " + amount + " into SavingsAccount. Balance: " + balance);
    }
}
class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into CurrentAccount. Balance: " + balance);
    }
    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from CurrentAccount. Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded in CurrentAccount.");
        }
    }
}
class testAccount{
    public static void main(String[] args) {
        BankAccount bankAccount = new SavingAccount(20000,5);
        bankAccount.deposit(2000);
        bankAccount.withdraw(500);

        BankAccount bankAccount1 = new CurrentAccount(20000, 2000);
        bankAccount1.deposit(2000);
        bankAccount1.withdraw(800);

    }
}
