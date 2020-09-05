package app.Prak1;
import java.lang.System;
public class TestBook {
    public static void main(final String[] args) {
        final Book b1 = new Book("Иду", "Тиана", 49, 4.0, "Russian", 170);
        final Book b2 = new Book("Go To Sleep", "Jone", 52, 4.3, "English", 210);
        final Book b3 = new Book("Meo Cua Em", "Le Dinh Cuong", 79, 3.5, "Vietnamese", 110);
        System.out.println(b1);
        b1.top3OfWeek();
        b2.top3OfWeek();
        b3.top3OfWeek();
    }
}
