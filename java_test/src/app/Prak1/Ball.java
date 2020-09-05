package app.Prak1;
import java.lang.System;
public class Ball {
    private String name;
    private String color;
    private int size;
    private String type;
    private String madeIn;

    public Ball (String name, String color, int size, String type, String madeIn){
        this.name = name;
        this.color = color;
        this.size = size;
        this.type = type;
        this.madeIn = madeIn;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setMadeIn(String madeIn){
        this.madeIn = madeIn;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getSize(){
        return size;
    }

    public String getType(){
        return type;
    }

    public String getMadeIn(){
        return madeIn;
    }

    public String toString(){
        return name+" is a ball of "+type+". It is a(an) "+color+" ball, and ball's size is "+size+". Made in "+madeIn;
    }
    public void textInfo(){
        System.out.println(name+", size: "+size+", color: "+color+", type: "+type+", Made in "+madeIn);
    }

    public Ball(){
        name = "A34TP";
        color = "white";
        size = 5;
        type = "Football";
        madeIn = "China";
    }
}
