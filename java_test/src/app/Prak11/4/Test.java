package ru.mirea.pr11.zd4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);
    public static void evaluate1() {
        System.out.print("This program calculates the input:" +
                "\nFunction: x * (y-2) * z + 1\n" +
                "Enter x, y, z: ");
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            ExpressionParser function = new Add(
                    new Multiply(
                            new Variable("x"),
                            new Multiply(
                                    new Subtract(
                                            new Variable("y"),
                                            new Const(2)
                                    ),
                                    new Variable("z")
                            )
                    ),
                    new Const(1)
            );
            System.out.println(function.evaluate(x, y, z));
            System.out.println();

        }
        catch (InputMismatchException ime) {
            System.out.print("Wrong input! Please try again.");
            sc.next(); System.out.println(); System.out.println();
            evaluate1();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }
    public static void evaluate2() {
        System.out.print("This program calculates the input:" +
                "\nFunction 1000000*x*x*x*x*x/(x-1)\n" +
                "Enter x: ");
        try {
            int x = sc.nextInt();
            ExpressionParser function = new Divide(
                    new Multiply(
                            new Const(1000000),
                            new Multiply(
                                    new Variable("x"),
                                    new Multiply(
                                            new Variable("x"),
                                            new Multiply(
                                                    new Variable("x"),
                                                    new Multiply(
                                                            new Variable("x"),
                                                            new Variable("x")
                                                    )
                                            )
                                    )
                            )
                    ),
                    new Subtract(
                            new Variable("x"),
                            new Const(1)
                    )
            );
            System.out.println(function.evaluate(x, 0, 0));
            System.out.println();
        }
        catch (InputMismatchException ime) {
            System.out.print("Wrong input! Please try again.");
            sc.next(); System.out.println(); System.out.println();
            evaluate2();
        }
        catch (Exception oe) {
            System.out.println(oe.getMessage());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean flag = true;
        do {
            try {
                System.out.println("1. Function: x * (y-2) * z + 1");
                System.out.println("2. Function: 1000000*x*x*x*x*x/(x-1)");
                System.out.println("Enter another number to exit.");
                System.out.print("Please choose: ");
                int choose = sc.nextInt();
                switch (choose) {
                    case 1:

                        evaluate1();
                        break;
                    case 2:

                        evaluate2();
                        break;
                    default:
                        flag = false;
                        System.out.print("Goodbye.");
                        break;
                }
            }
            catch (InputMismatchException ime) {
                System.out.print("Wrong input! Please try again.");
                sc.next(); System.out.println(); System.out.println();
            }
        } while (flag);
    }
}
