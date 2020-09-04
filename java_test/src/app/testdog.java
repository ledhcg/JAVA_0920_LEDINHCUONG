package app;
import java.lang.System;
public class testdog {
    public static void main(final String[] args) {
        final dog d2 = new dog("Ga", "ThanhHoa", "Alex", "Black", 4);
        final dog d1 = new dog("Cho", "Moscow", "Truong", "White", 2);
        final dog d3 = new dog("Meo", "HaNoi", "Cuong", "Red", 1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
