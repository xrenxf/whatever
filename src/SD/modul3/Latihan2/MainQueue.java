package SD.modul3.Latihan2;
import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");

        System.out.println("remove : " + queue.remove());
        System.out.println("Element : " + queue.element());
        System.out.println("Poll : " + queue.poll());
        System.out.println("Peek : " + queue.peek());
    }

    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
}