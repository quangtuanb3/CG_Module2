import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class  Student  implements Serializable {
    @Serial
    private static final long serialVersionUID = 123456789L;
    String name;
    LocalDate dateOfBirth;
    String gender;
    String phone;

    Student() {
    }

    Student(String name, LocalDate dob, String gender, String phone) {
        this.name = name;
        this.dateOfBirth = dob;
        this.phone = phone;
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
