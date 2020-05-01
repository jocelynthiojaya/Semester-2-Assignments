import java.lang.Math.*;

public class Circle extends Shape{
    double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double getPerimeter(){
        return Math.PI*2*this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + this.radius + ", which is a subclass of "
                + super.toString();
    }
}
