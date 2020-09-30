package app.Prak5;

import java.util.Scanner;

public class Exercise10 {
    public static int recursion(int n, int i) {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value n: ");
        int n = input.nextInt();
        System.out.println("Result: "+ recursion(n, 0));
        input.close();
    }
}
