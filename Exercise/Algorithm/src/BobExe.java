import java.util.Objects;
import java.util.Stack;

public class BobExe {
    public static void main(String[] args) {
//        Stack<Integer> stackOne = new Stack<Integer>();
//        Stack<Integer> stackTwo = new Stack<Integer>();
//        for (int i = 0; i < 5; i++)
//            stackOne.push(i);
//        stackTwo.push(stackOne.pop());
//        stackTwo.push(stackOne.pop());
//        stackTwo.push(stackOne.pop());
//        System.out.println(stackOne.peek() + stackTwo.peek());
        int myVariable = 5; // Example int variable
        int hashCode = Objects.hash(myVariable); // or simply use myVariable as the hash code
        System.out.println(hashCode);

    }

    public static String encodeString(String str) {
        String[] arr = str.split("");
        String[][] string;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < arr.length; i ++){

        }
        return stringBuilder.toString();
    }


}
