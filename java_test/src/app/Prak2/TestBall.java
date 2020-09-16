package app.Prak2;
import java.lang.System;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(70, 35);
        Ball b2 = new Ball(50.5, 40.5);
        Ball b3 = new Ball(20, 31);
        Ball b4 = new Ball();
        b4.setXY(5, 10);
        System.out.println("BEFORE:");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println("AFTER:");
        b1.move(21, 11);
        b2.move(54, 150);
        b3.move(43, 50);
        b4.move(75, 110);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}

