package com.company;

public class Triangle extends Shape {
    public Triangle() {
        p1 = new Point(1,1);
        System.out.println("Triangle Rightmost Point: X: " + p1.getX() + " Y: " + p1.getY());
        p2 = new Point(4,1);
        System.out.println("Triangle LeftMost Point: X: " + p2.getX() + " Y: " + p2.getY());
        p3 = new Point(2,6);
        System.out.println("Triangle Top Point: X: " + p3.getX() + " Y: " + p3.getY());
    }

    public Triangle(Point p1, Point p2, Point p3) {
        System.out.println("Triangle Point: X: " + p1.getX() + ", " + p2.getX() + ", " + p3.getX());
        System.out.println("Triangle Point: Y: " + p1.getY() + ", " + p2.getY() + ", " + p3.getY());
    }
}
