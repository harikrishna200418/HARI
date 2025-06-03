public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 18, b = 2;
        boolean x = true, y = false;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println("\nAssignment Operators:");
        int c = a;
        System.out.println("c = " + c);
        c += b;
        System.out.println("c += b => " + c);
        c *= b;
        System.out.println("c *= b => " + c);

        System.out.println("\nUnary Operators:");
        int d = +a;
        int e = -b;
        System.out.println("+a = " + d);
        System.out.println("-b = " + e);
        System.out.println("++a = " + (++a));
        System.out.println("b-- = " + (b--));
        System.out.println("b after b-- = " + b);
    }
}
