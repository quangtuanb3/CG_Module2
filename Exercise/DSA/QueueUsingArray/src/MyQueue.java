public class MyQueue {
    int capacity;
    int[] queueArr;
    int head = -1;
    int tail = -1;
    int currentSize;

    MyQueue(int size) {
        capacity = size;
        queueArr = new int[capacity];
        currentSize = 0;
    }

    boolean isQueueFull() {
        return (currentSize == capacity);
    }

    boolean isQueueEmpty() {
        return (currentSize == 0);
    }

    void enqueue(int num) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
        } else {
            if (isQueueEmpty()) {
                head = 0;
            }
            tail = (tail + 1) % capacity;
            queueArr[tail] = num;
            currentSize++;
        }
    }



    void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else {
            head = (head + 1) % capacity;
            currentSize--;
        }
    }


    void print() {
        for (int i = 0; i < currentSize; i++) {
            int index = (head + i) % capacity;
            System.out.println(queueArr[index]);
        }
    }

}