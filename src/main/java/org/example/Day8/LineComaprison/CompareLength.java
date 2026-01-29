package org.example.Day8.LineComaprison;

public class CompareLength {
    Point p1;
    Point p2;

    public CompareLength(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        double length=Math.sqrt(Math.pow(p2.x-p1.x,2)+(p2.y-p1.y));
        return length;
    }

}
