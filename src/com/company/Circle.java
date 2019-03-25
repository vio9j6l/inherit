package com.company;

public class Circle extends Shape {
    int radius;

    public Circle() {
        p1 = new Point(2, 3);
        radius = 5;
        System.out.println("Circle Point: X:" + p1.getX() + " Y:" + p1.getY());
        System.out.println("Circle Radius: " + radius);
    }

    public Circle(Point p1) {
        radius = 5;
        System.out.println("Circle Point: X:" + p1.getX() + " Y:" + p1.getY());
        System.out.println("Circle Radius: " + radius);
    }
}
