import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of salespeople: ");
        int salespeople = scan.nextInt();

        double[] sales = new double[salespeople];

        double total = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextDouble();
        }

        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("------------------ ");
        double average = total / sales.length;
        System.out.println("\nTotal sales: " + total);
        System.out.println("Average sales: " + average);
        System.out.println();
        for (int i = 0; i < sales.length; i++) {
            System.out.println("ID " + (i + 1) + " Sales: " + sales[i]);
        }

    }
}