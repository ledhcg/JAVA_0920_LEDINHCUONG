package ru.mirea.pr10.zd2;

import java.util.Random;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("Thinking about a random number from 1 to 10 and i will tell you exactly what number you think");
        Random generator=new Random();
        System.out.println("You're thinking about number "+generator.nextInt(10));
    }
}
