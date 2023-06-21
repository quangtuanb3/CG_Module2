public class Main {
    public static void main(String[] args) {
        implQueueCircle.Solution queueSolution = new implQueueCircle().new Solution();

        // Enqueue some elements
        queueSolution.enQueue(10);
        queueSolution.enQueue(20);
        queueSolution.enQueue(30);

        // Display the queue
        queueSolution.displayQueue(); // Output: Queue: 10 20 30

        // Dequeue an element
        queueSolution.deQueue();

        // Display the queue after dequeuing
        queueSolution.displayQueue(); // Output: Queue: 20 30

    }
}