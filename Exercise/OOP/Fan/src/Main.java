public class Main {
    public static void main(String[] args) {
       Fan fan1 = new Fan("fast",10,"yellow", "on");
        String fan1Info = fan1.toString();
        System.out.println(fan1Info);
        Fan fan2 = new Fan();
        fan2.setSpeed("medium");
        String fan2Info = fan2.toString();
        System.out.println(fan2Info);
    }
}