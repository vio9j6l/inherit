package com.company;

public class Triangle extends Shape {
    public Triangle() {
        p1 = new Point(2,8);
        System.out.println("Triangle Point: X:" + p1.getX() + " Y:" + p1.getY());
    }

    public Triangle(Point p1) {
        System.out.println("Triangle Point: X:" + p1.getX() + " Y:" + p1.getY() + " Z:");
    }
}
