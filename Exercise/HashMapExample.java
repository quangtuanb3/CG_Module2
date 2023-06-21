import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student grades
        Map<String, Integer> studentGrades = new HashMap<>();

        // Add student grades to the map
        studentGrades.put("John", 85);
        studentGrades.put("Mike", 92);
        studentGrades.put("Sarah", 78);
        studentGrades.put("Emily", 90);
        studentGrades.put("David", 88);
        System.out.println("abc: "+ studentGrades.entrySet());

        // Retrieve and display grades
        System.out.println("Student Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue();
            System.out.println(studentName + ": " + grade);
        }

        // Check if a student's grade exists
        String searchStudent = "Sarah";
        if (studentGrades.containsKey(searchStudent)) {
            int grade = studentGrades.get(searchStudent);
            System.out.println(searchStudent + "'s grade: " + grade);
        } else {
            System.out.println(searchStudent + "'s grade not found.");
        }

        // Update a student's grade
        String updateStudent = "Mike";
        int newGrade = 95;
        studentGrades.put(updateStudent, newGrade);
        System.out.println("Updated " + updateStudent + "'s grade: " + newGrade);

        // Remove a student's grade
        String removeStudent = "David";
        studentGrades.remove(removeStudent);
        System.out.println("Removed " + removeStudent + "'s grade.");

        // Display the updated grades
        System.out.println("\nUpdated Student Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue();
            System.out.println(studentName + ": " + grade);
        }
    }
}
