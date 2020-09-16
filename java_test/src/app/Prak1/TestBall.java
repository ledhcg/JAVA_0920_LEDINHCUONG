package app.Prak1;
import java.lang.System;

public class TestBall {
    public static void main(final String[] args) {
        final Ball b1 = new Ball("BC67S", "red", 5, "Football", "US");
        final Ball b2 = new Ball("Fc546", "black", 4, "Volleyball", "Russia");
        final Ball b3 = new Ball("Bd677", "yellow", 3, "Table Tennis", "Vietnam");
        System.out.println(b1);
        b1.textInfo();
        b2.textInfo();
        b3.textInfo();
    }
}

