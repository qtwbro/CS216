import java.util.Random;

public class Student {
    public String first_name;
    private String last_name;
    private String student_id;
    private float grade1;
    private float grade2;
    private float grade3;

    public Student() {
        student_id = generateID();
    }

    private static String generateID() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

    public void setInfo(String first_name, String last_name, float grade1, float grade2, float grade3) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public float getGPA() {
        return (grade1 + grade2 + grade3)/3;
    }

    public static void main(String[] agrs){
        Student student1  = new Student();
        student1.setInfo("Timothy", "Boyd", 3.1, 3.5, 4);
        System.err.println(student1.first_name);
    }
}
