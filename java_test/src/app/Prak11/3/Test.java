package ru.mirea.pr11.zd3;

import java.util.Scanner;

public class Test {
    public static void evaluate(){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        Operation function = new Add(
                new Subtract(
                        new Multiply(
                                new Variable("x"),
                                new Variable("x")
                        ),
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        )
                ),
                new Const(1)
        );
        System.out.println("Result: "+function.evaluate(x));
    }
    public static void main(String[] args) {
        System.out.println("Function: x^2-2*x+1");
        System.out.print("x= ");
        evaluate();
    }
}
