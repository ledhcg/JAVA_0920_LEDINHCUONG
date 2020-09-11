package app.Prak1;
import java.lang.System;
public class TestAuthor {
    public static void main(final String[] args) {
        final Author a1 = new Author("Anatia", "anatia@moutlook.com", "W");
        final Author a2 = new Author("Kando", "kado@gmail.com", "M");
        final Author a3 = new Author("Solac", "solac@yandex.ru", "M");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
