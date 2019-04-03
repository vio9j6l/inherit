package com.company;

public class Circle extends Shape {
    int radius;

    public int getRadius(){return radius;}
    public void setRadius(int _radius){this.radius = _radius;}

    public Circle() {
        super.addPoints(p1);
        setRadius(5);

        System.out.println("Circle Point: X : " + super.getPointX(0) + " Y : " + super.getPointY(0));
        System.out.println("Circle Radius: " + getRadius());
    }

    public Circle(Point p1, int radius) {
        super(p1);
        System.out.println("\nCircle Point: X: " + super.getPointX(0));
        System.out.println("Circle Point: Y: " + super.getPointY(0));
        System.out.println("Circle Radius: " + radius);
    }
}
