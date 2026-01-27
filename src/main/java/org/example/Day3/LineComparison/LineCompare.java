package org.example.Day3.LineComparison;

import static java.lang.Math.sqrt;

public class LineCompare {


    //find the lenght of the line
    public double lenghtOftheLine(double a, double b, double c,double d) {
        double lenght= Math.sqrt(Math.pow(a-b,2)+Math.pow(c-d,2));
       return lenght;
    }
}
