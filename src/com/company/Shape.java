package com.company;
import java.util.ArrayList;

public class Shape {
    //Points - Circle/Rectangle
    Point p1 = new Point(1,4);
    Point p2 = new Point(1, 0);
    Point p3 = new Point(4, 4);
    Point p4 = new Point(4, 1);

    //Points - Triangle
    Point po1 = new Point(1,1);
    Point po2 = new Point(4,1);
    Point po3 = new Point(2,6);

    private ArrayList<Point> points = new ArrayList<Point>();

    public Shape() { }

    public Shape(Point point, Point point1, Point point2) {
        points.add(point);
        points.add(point1);

    }


    public Shape(ArrayList<Point> _points){ points = _points; }

    public Shape(Point point) {
        points.add(point);
    }

    public void addPointsList(ArrayList<Point> _points) {
        points = _points;
    }

    public void addPoints(Point point) {
        points.add(point);
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

    public int getPointX(int index) {
        return points.get(index).getX();
    }

    public int getPointY(int index) {
        return points.get(index).getY();
    }

}
