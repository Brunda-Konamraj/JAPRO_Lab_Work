/*Write a java program to create a class called Shape with a method called getArea(). 
Create a subclass called Rectangle that overrides the getArea() method. 
to calculate the area of a rectangle.*/
public class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}