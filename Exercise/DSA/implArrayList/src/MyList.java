import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        ensureCapacity();
        for (int i = size + 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    void add(E element) {
        ensureCapacity();
        elements[size] = element;
        size++;
    }

    public E remove(int index) {
        E result = (E) elements[index];
        for (int j = index; j < size; j++) {
            elements[j] = elements[j + 1];
        }
        size--;
        return result;
    }

    void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }

    int size() {
        return size;
    }

    public Object clone() {
        MyList<E> result = new MyList<>(size);
        for (int i = 0; i <= size; i++) {
            result.add((E) elements[i]);
        }
        return result;
    }

    public void clear() {
        elements = null;
    }

    public int indexOf(E ele) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(ele)) {
                result = i;
            }
        }
        return result;
    }

    public boolean contains(E ele) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(ele)) {
                result = true;
                break;
            }
        }
        return result;
    }
    public void print(){
        for (int i = 0; i < size; i ++){
            System.out.print(elements[i]+ " ");
        }
    }

}
