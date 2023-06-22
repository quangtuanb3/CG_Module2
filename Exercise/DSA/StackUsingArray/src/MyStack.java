public class MyStack {
    int[] arr;
    int size;
    int index;

    MyStack(int size) {
        this.size = size;
        arr = new int[size];
        index = 0;
    }

    void push(int num) {

        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[index] = num;
            index++;
        }
    }

    int pop() {
        int result = 0;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            index--;
            result = arr[index];

        }
        return result;
    }

    boolean isEmpty() {
        return (index == 0);
    }

    boolean isFull() {
        return (index == size);
    }
    void print(){
        for (int i = index - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

}

