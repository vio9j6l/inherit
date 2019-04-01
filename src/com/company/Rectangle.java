package com.company;

public class Rectangle extends Shape {
    public Rectangle() {
        p1 = new Point(1,4);
        System.out.println("Rectangle UpperLeft Point: X: " + p1.getX() + " Y: " + p1.getY());
        p2 = new Point(1, 0);
        System.out.println("Rectangle BottomLeft Point: X:" + p2.getX() + " Y: " + p2.getY());
        p3 = new Point(4, 4);
        System.out.println("Rectangle UpperRight Point: X: " + p3.getX() + " Y: " + p3.getY());
        p4 = new Point(4, 1);
        System.out.println("Rectangle BottomRight Point: X: " + p4.getX() + " Y: " + p4.getY());
    }

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        System.out.println("Rectangle Point: X: " + p1.getX() + ", " + p2.getX() + ", " + p3.getX() + ", " + p4.getX());
        System.out.println("Rectangle Point: Y: " + p1.getY() + ", " + p2.getY() + ", " + p3.getY() + ", " + p4.getY());
    }
}
