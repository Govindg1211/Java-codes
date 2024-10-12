import java.util.PriorityQueue;

public class heap1{
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);

        System.out.println("Priority Queue: " + priorityQueue);

        System.out.println("Removed Element: " + priorityQueue.poll());

        System.out.println("Priority Queue after removal: " + priorityQueue);

        System.out.println("Top Element: " + priorityQueue.peek());

        System.out.println("Does the queue contain 3? " + priorityQueue.contains(3));
    }
}