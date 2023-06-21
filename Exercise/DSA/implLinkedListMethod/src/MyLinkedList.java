
import java.util.LinkedList;

public class MyLinkedList<E> {
    Node head;
    int numNodes = 0;

    MyLinkedList() {
    }

    public void add(int index, E ele) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (index == 0) {
            addFirst(ele);
            return;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            Node newNode = new Node(ele);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        numNodes++;
    }


    public void addFirst(E ele) {
        Node temp = head;
        head = new Node(ele);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E ele) {
        Node last = new Node(ele);
        if (head == null) {
            head = last;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = last;
        }
        numNodes++;
    }

    public E remove(int index) {
        validateIndex(index);
        Node result;
        if (index == 0) {
            result = head;
            head = head.next;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            result = prev.next;
            prev.next = prev.next.next;
        }

        numNodes--;
        return (E) result;
    }

    public boolean remove(E ele) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            if (current.data.equals(ele)) {
                if (prev == null) {
                    // Special case: removing the head node
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                numNodes--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }


    void validateIndex(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }


    public static void main(String[] args) {
        LinkedList<String> ns = new LinkedList<>();
        ns.addLast("a");
        ns.remove("a");
        MyLinkedList<Integer> numbers = new MyLinkedList<>();
        numbers.addFirst(4);
        numbers.addFirst(3);
        numbers.addFirst(2);
        numbers.add(3, 5);
        numbers.addLast(6);
        numbers.remove(1);

        numbers.printList();
    }
}
