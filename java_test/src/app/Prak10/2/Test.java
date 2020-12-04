package ru.mirea.pr10.zd2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        AbstractChairFactory cf=new ChairFactory();
        Client client=new Client();

        Chair chair1= cf.createVictorianChair();
        Chair chair2= cf.createMagicChair();
        Chair chair3= cf.createFunctionalChair();

        client.setChair(chair1);
        client.sit();

        client.setChair(chair2);
        client.sit();

        client.setChair(chair3);
        client.sit();

    }
}
