package BANK;

public class BankAccountTesting {

    public static void main(String[] args) {

        BankAccount a = new BankAccount("Anna", 1000, 123456789);

        System.out.println(a);

        //deposit
        a.deposit(200);
        System.out.println("\nDeposit:");
        System.out.println(a);

        //withdraw
        a.withdraw(500);
        System.out.println("\nWithdraw:");
        System.out.println(a);
        
        System.out.println("\nHigh withdraw:");
        a.withdraw(10000);


        //interest
        a.addInterest();
        System.out.println("\nInterest:");
        System.out.println(a);
    }
}
