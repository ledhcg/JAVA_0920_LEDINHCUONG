package ru.mirea.pr10.zd1;

public class Complex {
    private int real;
    private int image;

    public Complex() {
    }

    public Complex(int real, int  image) {
        this.real = real;
        this. image =  image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return  image;
    }

    public void setImage(int image) {
        this. image = image;
    }
    public Complex addComplex(Complex a){
        return new Complex(real+a.real,image+a.image);
    }
    public Complex subComplex(Complex a){
        return new Complex(real-a.real,image-a.image);
    }
    public Complex mulComplex(Complex a){
        return new Complex(real*a.real-image*a.image,real*a.image+image*a.real);
    }
    public Complex divComplex(Complex a){
        return new Complex((real*a.real+image*a.image)/(a.real*a.real+a.image*a.image),(-real*a.image+image*a.real)/(a.real*a.real+a.image*a.image));
    }

    @Override
    public String toString() {
        return real + " + " + image + "i";
    }
}
