package SD.modul3.Latihan2;

public class MainQueue2 {
    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;
    private int numItems;

    public MainQueue2(int size) {
        maxSize = size;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
        numItems = 0;
    }

    public void insert(String value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = value;
        numItems++;
    }

    public String remove() {
        String temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        numItems--;
        return temp;
    }

    public String peek() {
        return queueArray[front];
    }

    public String element() {
        return queueArray[front];
    }

    public String poll() {
        if (numItems == 0) {
            return String.valueOf(-1);
        }
        String temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        numItems--;
        return temp;
    }

    public static void main(String[] args) {
        MainQueue2 queue = new MainQueue2(5);
        queue.insert("Java");
        queue.insert("DotNet");
        queue.insert("PHP");
        queue.insert("HTML");

        System.out.println("remove : " + queue.remove());
        System.out.println("Element : " + queue.element());
        System.out.println("Poll : " + queue.poll());
        System.out.println("Peek : " + queue.peek());
    }
}