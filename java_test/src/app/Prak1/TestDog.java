package app.Prak1;
import java.lang.System;
public class TestDog {
    public static void main(final String[] args) {
        final Dog d2 = new Dog("BosTe", "ThanhHoa", "Alex", "Black", 4);
        final Dog d1 = new Dog("Yafe", "Moscow", "Truong", "White", 2);
        final Dog d3 = new Dog("Solac", "HaNoi", "Cuong", "Red", 1);
        System.out.println(d1);
        d1.infoBoss();
        d2.infoBoss();
        d3.infoBoss();
    }
}
