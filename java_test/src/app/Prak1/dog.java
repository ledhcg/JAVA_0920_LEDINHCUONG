package app.Prak1;
import java.lang.System;
public class Dog {

    private String name;
    private String city;
    private String boss;
    private String color;
    private int age;

    public Dog (String name, String city, String boss, String color, int age){
        this.name = name;
        this.city = city;
        this.boss = boss;
        this.color = color;
        this.age = age;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setCity (String city){
        this.city = city;
    }

    public void setBoss (String boss){
        this.boss = boss;
    }

    public void setColor (String color){
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public String getBoss(){
        return boss;
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return this.name+", City: "+this.city+", Boss: "+this.boss+", Color: "+this.color+", Age: "+this.age;
    }

    public void infoBoss(){
        System.out.println(name+"'s boss is "+boss+" and they live in "+city+".");
    }

    public Dog(){
        name = "Ga";
        city = "Moscow";
        boss = "Alex";
        color = "white";
        age = 4;
    }
}
