package ru.mirea.lab4_12;

public class Circle extends Shape{
    protected double radius;


    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimiter() {
        return 2 * Math.PI * radius ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + this.getRadius()+
                " perimeter="+this.getPerimiter()+'}';
    }
}
