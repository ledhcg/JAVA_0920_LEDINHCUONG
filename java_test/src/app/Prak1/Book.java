package app.Prak1;
import java.lang.System;
public class Book {
    private String name;
    private String author;
    private int price;
    private double ratings;
    private String language;
    private int paperback;

    public Book (String name, String author, int price, double ratings, String language, int paperback){
        this.name = name;
        this.author = author;
        this.price = price;
        this.ratings = ratings;
        this.language = language;
        this.paperback = paperback;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setRatings(double ratings){
        this.ratings = ratings;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public void setPaperback(int paperback){
        this.paperback = paperback;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getPrice(){
        return price;
    }

    public double getRatings(){
        return ratings;
    }

    public String getLanguage(){
        return language;
    }

    public int getPaperback(){
        return paperback;
    }

    public String toString(){
        return name+"("+language+") by "+author+", Price: "+price+"$"+", Ratings on Amazon: "+ratings+", Paperback: "+paperback;
    }
    public void top3OfWeek(){
        System.out.println(name+" on TOP3 of this week with "+ratings+" ratings on Amazon.");
    }

    public Book(){
        name = "ABC";
        author = "Alex";
        price = 50;
        ratings = 4.5;
        language = "English";
        paperback = 169;
    }
}