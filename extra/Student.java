import java.util.Random;
import java.util.Scanner;

public class Student {
    public String first_name;
    private String last_name;
    private String student_id;
    private float grade1;
    private float grade2;
    private float grade3;

    private float[] scores;

    public Student(String name, int num_score) {
        this.first_name = name;
        this.scores = new float[num_score];

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

    public float getAvg(){
        float total = 0;
        for (int i = 0; i < this.scores.length; i++) {
            total += this.scores[i];
        }
        return (float)total/this.scores.length;
    }

    public float highestScore(){
        float total = 0;
        for (int i = 0; i < this.scores.length; i++) {
            if (total < this.scores[i]) {
                total = this.scores[i];
            }
        }
        return total;
    }

    public float lowestScore(){
        float total = 100;
        for (int i = 0; i < this.scores.length; i++) {
            if (total > this.scores[i]) {
                total = this.scores[i];
            }
        }
        return total;
    }

    public boolean pass_fail() {
        return this.getAvg() > 60;
    }


    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student's name: ");

        String name = input.nextLine();

        System.out.println("How many test scores?: ");
        int num_score = input.nextInt();

        Student student1  = new Student(name, num_score);
        
        for (int i = 0; i < num_score; i++) {
            System.out.println("What is score " + (i + 1) + "?: ");
            float nextscore = input.nextFloat();
            student1.scores[i] = nextscore;
        }
        
        System.out.println("Highest Grade: " + student1.highestScore() + " \n Lowest Grade: " + student1.lowestScore() + "\n Average Grade: " + student1.getAvg() + " \n Pass/Fail: " + student1.pass_fail());
        input.close();
    }
}

