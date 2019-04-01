package com.company;

public class Main {

    public static void main(String[] args) {
        Point po1 = new Point(1,1);
        Point po2 = new Point(4,1);
        Point po3 = new Point(2,6);

        Point p1 = new Point(1,4);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(4, 4);
        Point p4 = new Point(4, 1);

        System.out.println("Circle");
	    Circle c1 = new Circle();
	    Circle c2 = new Circle(p1);

        System.out.println("\nTriangle");
	    Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(po1, po2, po3);

        System.out.println("\nRectangle");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(p1, p2, p3, p4);

    }
}


