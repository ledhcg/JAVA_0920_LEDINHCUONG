package app.Prak5;

import java.util.Scanner;

public class Exercise11 {
    public static int recursion() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1) {
            int m = input.nextInt();
            if (m == 1) {
                return recursion() + n + m;
            } else {
                int k = input.nextInt();
                if (k == 1) {
                    return recursion() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = input.nextInt();
            if (m == 1) {
                return recursion() + n + m;
            } else {
                return n + m;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Result: " + recursion()); 
    }
}
