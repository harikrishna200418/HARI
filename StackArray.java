public class StackArray {
    int top = -1;
    int[] stack = new int[5];

    void push(int val) {
        if (top == 4)
            System.out.println("Stack Overflow");
        else
            stack[++top] = val;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            top--;
    }

    void display() {
        for (int i = 0; i <= top; i++)
            System.out.print(stack[i] + " ");
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.display();
    }
}
