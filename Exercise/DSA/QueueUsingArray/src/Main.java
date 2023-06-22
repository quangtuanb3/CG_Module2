public class Main {
    public  static  void main(String[] args) {
        MyQueue queue = new MyQueue(10);
//        queue.enqueue(0);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.print();
    }


}