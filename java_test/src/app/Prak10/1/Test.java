package ru.mirea.pr10.zd1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory caf=new ConcreteFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input real and image of complex 1: ");
        Complex complex1=caf.CreateComplex(scanner.nextInt(),scanner.nextInt());
        System.out.print("Input real and image of complex 2: ");
        Complex complex2=caf.CreateComplex(scanner.nextInt(),scanner.nextInt());
        System.out.println("Complex 1: "+complex1);
        System.out.println("Complex 2: "+complex2);
        System.out.println("Sum of complex 1 and complex 2: "+complex1.addComplex(complex2));
        System.out.println("Sub of complex 1 and complex 2: "+complex1.subComplex(complex2));
        System.out.println("Mul of complex 1 and complex 2: "+complex1.mulComplex(complex2));
        System.out.println("Div of complex 1 and complex 2: "+complex1.divComplex(complex2));
        System.out.println("Div of complex 2 and complex 1: "+complex2.divComplex(complex1));
    }
}
