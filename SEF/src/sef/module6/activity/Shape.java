package sef.module6.activity;

public class Shape extends Rectangle {

    public String color;
    public double area;
    public double perim;

    public Shape() {
    }

    Rectangle w = new Rectangle();

    // Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
    public double calculateArea(double width, double length) {
        //width = w.width;
       // length = w.length;
        area = length * width;

        return area;
    }

    public double calculatePerimeter(double width, double length) {
        //width = w.width;
        //length = w.length;
        perim = 2 * length + width;

        return perim;
    }


    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }


}
