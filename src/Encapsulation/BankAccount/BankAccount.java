package Encapsulation.BankAccount;
//Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
// Provide public getter and setter methods to access and modify these variables.
public class BankAccount {
    private String  AccountNumber;
    private double balance;

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
        else {
            System.out.println("Balance cannot be negative.");
        }
    }
}
class Test{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("1234567890");
        bankAccount.setBalance(1000.50);

        System.out.println("Account Number : "+bankAccount.getAccountNumber());
        System.out.println("Account Balance : "+bankAccount.getBalance());
    }
}
