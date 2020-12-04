package ru.mirea.pr10.zd2;
import java.util.Scanner;
public class Client {
    public Chair chair;
    public void sit(){
        if(chair instanceof VictorianChair){
            System.out.println("This chair is "+((VictorianChair) chair).getAge()+" years old");
        }
        else if(chair instanceof MagicChair){
            System.out.println("Let's do some magic!");
            ((MagicChair) chair).doMagic();
        }
        else{
            int a,b,sum;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Output sum of a and b: ");
            System.out.print("Enter a: ");
            a = scanner.nextInt();
            System.out.print("Enter b: ");
            b = scanner.nextInt();
            sum = ((FunctionalChair) chair).sum(a, b);
            System.out.println("Sum of "+a+" and "+b+ ": "+sum);
        }
    }
    public void setChair(Chair chair){
        this.chair=chair;
    }
}
