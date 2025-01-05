package Encapsulation.BankAccount;
//Write a Java program to create a class called Account with private instance variables accountNumber,
// accountHolder, and balance. Provide public getter and setter methods to access and modify these variables.
// Add a method called deposit() that takes an amount and increases the balance by that amount, and a method
// called withdraw() that takes an amount and decreases the balance by that amount.
public class Account {
    private String accountNumber;
    private String accHolderName;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit amount successfully : " + amount +"\t "+ "Balance after deposit: " + balance);
        } else {
            System.out.println("invalid deposit amount..!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw amount successfully : " + amount + "\t "+ "Balance after withdraw : "+balance);
        }
    }
}
class AccInfo{
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber("32233223");
        account.setAccHolderName("alice parker");
        account.setBalance(50000.00);

        System.out.println("Account info: ");
        System.out.println("Account number : "+ account.getAccountNumber());
        System.out.println("Account Holder name : "+ account.getAccHolderName());
        System.out.println("Balance :" +account.getBalance());
        System.out.println("---------------------------------------");

        System.out.println("Deposit money into account ");
        account.deposit(35000.50);
        System.out.println("-------------------------------------");

        System.out.println("Withdraw money into account ");
        account.withdraw(45000.30);
    }
}
