public class QueueArray {
    int front = 0, rear = 0;
    int[] q = new int[5];

    void enqueue(int val) {
        if (rear == 5)
            System.out.println("Queue Full");
        else
            q[rear++] = val;
    }

    void dequeue() {
        if (front == rear)
            System.out.println("Queue Empty");
        else
            front++;
    }

    void display() {
        for (int i = front; i < rear; i++)
            System.out.print(q[i] + " ");
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(5);
        q.enqueue(10);
        q.dequeue();
        q.display();
    }
}
