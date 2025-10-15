// import _student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class TestingStudent {
    public ArrayList<_student> highStudents = new ArrayList<>();

    public String highestAvg(ArrayList<_student> students) {
        float highest = students.get(0).getAvg();
        String name = students.get(0).name;
        for (_student x : students) {
            if (x.getAvg() >= highest) {
                highest = x.getAvg();
                name = x.name;
            }
        }
        return name;
    }

    // public static void main(String[] args) {
    //     ArrayList<_student> students = new ArrayList<>();
    //     Scanner input = new Scanner(System.in);

    //     System.out.printf("How many students? ");
    //     int num_students = input.nextInt();

    //     for (int i = 0; i < num_students; i++) {
    //         System.out.println("Enter Student Name: ");
    //         String name = input.nextLine();
        
    //         System.out.println("Enter number of scores: ");
    //         int n = input.nextInt();

    //         _students.add(student);
    //     }
    //     TestingStudent tester = new TestingStudent();
    //     System.err.printf("%s Has the highest GPA", tester.highestAvg(students));
    //     input.close();
    // } student = new _student(name, n);

    //         for (int f = 0; f < n; f++) {
    //             System.out.printf("Enter %s score %d%n: ", student.name, f + 1);
    //             student.scores_d.add(input.nextFloat());
    //         }
    //         student

    public static void main(String[] args) {

        _student s1 = new _student("T", 2);
        _student s2 = new _student("I", 2);
        _student s3 = new _student("M", 2);

        s1.scores_d.add(0, 76.0f);
        s1.scores_d.add(1, 80.0f);

        s2.scores_d.add(0, 75.0f);
        s2.scores_d.add(1, 50.0f);

        s3.scores_d.add(0, 99.0f);
        s3.scores_d.add(1, 100.0f);


        _student[] students = {s1, s2, s3};
            
        // java.util.Arrays.sort(students);
        for (_student student: students) {
            System.out.print(student + " "); 
            System.out.println();
        }
    }
}
