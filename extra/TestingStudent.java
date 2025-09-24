import _student;
import java.util.Scanner;

public class TestingStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = input.nextLine();
        
        System.out.println("Enter number of scores: ");
        int n = input.nextInt();

        _student student = new _student(name, n);

        for (int i = 0; i < n; i++) {
            System.out.println(String.format("Enter score %d", i + 1));
            float score = input.nextFloat();
            student.scores[i] = score;
        }

        student.PrintReport();
    }
}
