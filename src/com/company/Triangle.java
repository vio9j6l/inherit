package com.company;

public class Triangle extends Shape {
    public Triangle() {
        super.addPoints(po1);
        super.addPoints(po2);
        super.addPoints(po3);

        System.out.println("Triangle Rightmost Point: X: " + super.getPointX(0) + ", Y: " + super.getPointY(0));
        System.out.println("Triangle LeftMost Point: X: " + super.getPointX(1) + ", Y: " + super.getPointY(1));
        System.out.println("Triangle Top Point: X: " + super.getPointX(2) + ", Y: " + super.getPointY(2));
    }

    public Triangle(Point po1, Point po2, Point po3) {
        super.addPoints(po1);
        super.addPoints(po2);
        super.addPoints(po3);

        System.out.println("Triangle Point: X: " + super.getPointX(0) + ", " + super.getPointX(1) + ", " + super.getPointX(2));
        System.out.println("Triangle Point: Y: " + super.getPointY(0) + ", " + super.getPointY(1) + ", " + super.getPointY(2));
    }

}
