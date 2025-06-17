import java.util.Scanner;

public class Banking {
    static double balance = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    balance += sc.nextDouble();
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    if (amt <= balance)
                        balance -= amt;
                    else
                        System.out.println("Insufficient funds!");
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    break;
                case 4:
                    return;
            }
        }
    }
}
