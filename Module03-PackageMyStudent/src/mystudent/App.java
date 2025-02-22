package mystudent;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20);
        System.out.println("Student Name: " + student1.getName() + ", Age: " + student1.getAge());

        student1.setAge(21);
        student1.setName("Jane Doe");
        System.out.println("Updated Student Name: " + student1.getName() + ", Age: " + student1.getAge());
    }
}
