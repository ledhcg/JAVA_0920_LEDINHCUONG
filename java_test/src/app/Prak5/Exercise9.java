package app.Prak5;

import java.util.Scanner;

public class Exercise9 {

    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = input.nextInt();
        System.out.print("Enter value b: ");
        int b = input.nextInt();
        System.out.println("Result: " + recursion(a, b));
        input.close();
    }
}
