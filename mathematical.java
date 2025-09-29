import java.util.Scanner;
public class mathematical {
    

    public static int fib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return fib(n -1) + fib(n - 2);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number to receive the Fibonacci sequence and factorial: ");
        int n = input.nextInt();

        System.out.printf("Fib: %d%n Factorial: %d%n", fib(n), fact(n));
    }
}
