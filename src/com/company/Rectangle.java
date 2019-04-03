package com.company;

public class Rectangle extends Shape {
    public Rectangle() {
        super.addPoints(p1);
        super.addPoints(p2);
        super.addPoints(p3);
        super.addPoints(p4);

        System.out.println("Rectangle UpperLeft Point: X: " + super.getPointX(0) + ", Y: " + super.getPointY(0));
        System.out.println("Rectangle BottomLeft Point: X:" + super.getPointX(1) + ", Y: " + super.getPointY(1));
        System.out.println("Rectangle UpperRight Point: X: " + super.getPointX(2) + ", Y: " + super.getPointY(2));
        System.out.println("Rectangle BottomRight Point: X: " + super.getPointX(3) + ", Y: " + super.getPointY(3));
    }
//
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super.addPoints(p1);
        super.addPoints(p2);
        super.addPoints(p3);
        super.addPoints(p4);

        System.out.println("Rectangle Point: X: " + super.getPointX(0) + ", " + super.getPointX(1) + ", " + super.getPointX(2) + ", " + super.getPointX(3));
        System.out.println("Rectangle Point: Y: " + super.getPointY(0) + ", " + super.getPointY(1) + ", " + super.getPointY(2) + ", " + super.getPointY(3));
    }
}
