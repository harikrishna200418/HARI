import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter price of item " + (i + 1) + ": ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            total += price * qty;
        }

        double tax = total * 0.18;
        System.out.println("Total = " + total);
        System.out.println("Tax (18%) = " + tax);
        System.out.println("Final Bill = " + (total + tax));
    }
}
