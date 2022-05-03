import java.util.Scanner;

// Fibonacci series -> 0, 1, 1, 2, 3, 5, 8, 13 ...

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'N': ");
        int n = sc.nextInt();
        System.out.println(new Main().genFibonacci(n));
    }

    public int genFibonacci(int number) {
        if (number == 0 || number == 1) return number;
        return genFibonacci((number - 1)) + genFibonacci((number - 2));
    }
}