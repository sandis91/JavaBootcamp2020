package sef.module6.activity;

public class AbstractionActivity {


    public static void main(String[] args) {
        Rectangle w = new Rectangle();
        w.width = 5;
        w.length = 6;
        System.out.println(w.length);
        System.out.println(w.width);
        Shape s = new Shape();
        s.setColor("banana");
        System.out.println("Area " + s.calculateArea(w.width, w.length));
        System.out.println("Perimeter " + s.calculatePerimeter(w.width, w.length));
        System.out.println("color " + s.getColor());
    }
}
