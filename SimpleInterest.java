public class SimpleInterest {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Principal: ");
        double p = sc.nextDouble();

        System.out.print("Rate (%): ");
        double r = sc.nextDouble();

        System.out.print("Time (years): ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest: " + si);

        sc.close();
    }

}
