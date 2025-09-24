// import _student;

import java.util.ArrayList;
import java.util.Scanner;

public class TestingStudent {
    public void highestAvg(ArrayList<_student> students) {
        Student topstudent = students.get(0)
        for ( _student x : students) {
            if (x.getAvg() > highest);
            highest = x.getAvg();
            name = x.name;
        }
        return name;
    }
    public static void main(String[] args) {
        ArrayList<_student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.printf("How many students? ");
        int num_students = input.nextInt();

        for (int i = 0; i < num_students; i++) {
            System.out.println("Enter Student Name: ");
            String name = input.nextLine();
        
            System.out.println("Enter number of scores: ");
            int n = input.nextInt();

            _student student = new _student(name, n);

            for (int f = 0; f < n; f++) {
                System.out.printf("Enter %s score %d%n: ", student.name, f + 1);
                student.scores_d.add(input.nextFloat());
            }
            students.add(student);
        }

        for (_student x : students){
            x.PrintReport();
        }
        input.close();
    }
}
