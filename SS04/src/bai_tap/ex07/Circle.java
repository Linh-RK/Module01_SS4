package bai_tap.ex07;

import java.awt.*;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

//    public double getRadius() {
//        return radius;
//    }
//
//    public String getColor() {
//        return color;
//    }
    private double getRadius() {
        return radius;
    }

    private String getColor() {
        return color;
    }
}
