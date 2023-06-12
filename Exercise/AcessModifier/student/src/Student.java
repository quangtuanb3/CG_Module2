public class Student {
    Student() {
    }

    private String name;
    private String classes;

    public void setClasses(String classes) {
        this.classes = classes;
    }

    protected void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " " + classes);
    }
}
