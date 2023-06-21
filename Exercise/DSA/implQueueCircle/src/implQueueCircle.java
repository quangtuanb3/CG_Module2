import java.util.Queue;

public class implQueueCircle {
    class Node {
        int data;
        Node link;

        Node(int num) {
            data = num;
            link = null;
        }
    }

    static class Queue {
        public static Node front;
        public static Node rear;

        public Queue() {
            front = null;
            rear = null;
        }

    }

    class Solution {
        public void enQueue(int num) {
            Node newNode = new Node(num);
            if (Queue.front == null && Queue.rear == null) {
                Queue.front = Queue.rear = newNode;
            } else {
                newNode.link = Queue.front;
                Queue.rear.link = newNode;
                Queue.rear = newNode;

            }
        }

        public void deQueue() {
            if (Queue.front == null) {
                System.out.println("Queue is empty.");
            } else {
                if (Queue.front == Queue.rear) {
                    Queue.front = Queue.rear = null;
                } else {
                    Queue.front = Queue.front.link;
                    Queue.rear.link = Queue.front;
                }
            }
        }

        public void displayQueue() {
            if (Queue.front == null) {
                System.out.println("Queue is empty.");
            } else {
                Node temp = Queue.front;
                System.out.print("Queue: ");
                while (temp.link != Queue.front) {
                    System.out.print(temp.data + " ");
                    temp = temp.link;
                }
                System.out.println(temp.data);
            }
        }
    }
}
