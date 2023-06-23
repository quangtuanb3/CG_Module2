import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String PATH = "DSA/recordStudents/src/Students.txt";
        Object listStudents = SerializableUtil.deserialize(PATH);
        System.out.println(listStudents);

        Student m1 = new Student("Tuan", LocalDate.of(1998, 10, 10), "Male", "0989989968");
        Student m2 = new Student("Khanh", LocalDate.of(1999, 9, 12), "Male", "0989989968");
        Student m3 = new Student("Duy", LocalDate.of(1996, 8, 11), "Male", "0989989968");
        Student f1 = new Student("Thu", LocalDate.of(2000, 2, 13), "Female", "0989989968");
        Student f2 = new Student("Tuyet", LocalDate.of(2000, 11, 15), "Female", "0989989968");
        Student f3 = new Student("Dieu", LocalDate.of(1998, 3, 31), "Female", "0989989968");
        List<Student> students = Arrays.asList(m1, m2, m3, f1, f2, f3);

        Comparator<Student> customComparator = Comparator.comparing(Student::getDateOfBirth);
        Queue<Student> fStudents = new PriorityQueue<>(customComparator);
        Queue<Student> mStudents = new PriorityQueue<>(customComparator);
        Queue<Student> allStudents = new PriorityQueue<>(Comparator.comparing(Student::getGender).thenComparing(Student::getDateOfBirth));
        for (Student s : students) {
            if (s.getGender().equals("Male")) {
                mStudents.offer(s);
            } else {
                fStudents.offer(s);
            }
        }
        for (Student s : students) {
            allStudents.offer(s);
        }
//        System.out.println("all");
//        for (var s : allStudents) {
//            System.out.println(s.toString());
//        }
//        System.out.println("Female");
//        for (var s : fStudents) {
//            System.out.println(s.toString());
//
//        }
//        System.out.println("Male");
//        for (var s : mStudents) {
//            System.out.println(s.toString());
//        }
//
//        while (fStudents.peek() != null) {
//            SerializableUtil.serialize(fStudents.poll(), PATH);
//        }
//        while (fStudents.peek() != null) {
//            SerializableUtil.serialize(fStudents.poll(), PATH);
        }


    }


}