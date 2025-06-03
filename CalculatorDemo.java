interface MyOperation {
    int calculate(int a, int b);
}

public class CalculatorDemo {
    public static void main(String[] args) {
        MyOperation add = (a, b) -> a + b;
        MyOperation subtract = (a, b) -> a - b;
        MyOperation multiply = (a, b) -> a * b;
        MyOperation divide = (a, b) -> b != 0 ? a / b : 0;

        int x = 18, y = 9;

        System.out.println("Add: " + add.calculate(x, y));
        System.out.println("Subtract: " + subtract.calculate(x, y));
        System.out.println("Multiply: " + multiply.calculate(x, y));
        System.out.println("Divide: " + divide.calculate(x, y));
    }
}
