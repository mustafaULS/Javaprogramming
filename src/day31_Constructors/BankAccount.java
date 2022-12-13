package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance() {
        System.out.println("You available balance is : $" + balance);
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("deposit amount can NOT be 0 or negative");
            return; // exits method.
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount>balance){ // withdraw  greater then balance;
            System.out.println("Insufficient balance");
            return;
        }
        if (amount<=0){
            System.out.println("withdraw amount can NOT be 0 or negative");
            return;
        }
        balance-=amount;
    }





}
