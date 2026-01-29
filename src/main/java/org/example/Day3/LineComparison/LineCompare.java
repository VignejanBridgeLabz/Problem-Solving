package org.example.Day3.LineComparison;

import static java.lang.Math.sqrt;

public class LineCompare {


    //find the lenght of the line
    public double lenghtOftheLine(double a, double b, double c,double d) {
        double lenght= Math.sqrt(Math.pow(b-a,2)+Math.pow(d-c,2));
       return lenght;
    }
}
