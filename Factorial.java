public class Factorial {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        System.out.println("Factorial: " + result);
        scanner.close();
    }

}
