package app.Prak2;
public class Ball {
    private double x = 0.00;
    private double y = 0.00;
    
    public Ball() {
        x = 3.5;
        y = 5.5;
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXYSpeed(double speed) {
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
        setXYSpeed((x+y)/2);
    }

    public void move(double xDisplay, double yDisplay){
        x += xDisplay;
        y += yDisplay;
    }

    @Override
     public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}

