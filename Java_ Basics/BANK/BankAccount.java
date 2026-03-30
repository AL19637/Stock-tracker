package BANK;

public class BankAccount {

    private String customerName;
    private double balance;
    private long acNum;


    public static final double intrest = 0.035;

    
    public BankAccount() {
        customerName = "";
        balance = 0.0;
        acNum = 0;
    }


    public BankAccount(String customerName, double balance, long acNum) {
        this.customerName = customerName;
        this.balance = balance;
        this.acNum = acNum;
    }

    //withdraw 
    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Cannot withdraw more than balance.");
        }
        else {
            balance = balance - amount;
        }
        return balance;
    }

    //deposit
    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    //add interest
    public double addInterest() {
        balance = balance + (balance * intrest);
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Name: " + customerName +
               "\nAccount Number: " + acNum +
               "\nBalance: $" + balance;
    }
}