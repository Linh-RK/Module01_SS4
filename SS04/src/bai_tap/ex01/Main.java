package bai_tap.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle1 = new Circle();
//        Circle circle2 = new Circle();
        circle1.input(sc);
//        circle2.input(sc);
        circle1.dislayData();
//        circle2.dislayData();
//        System.out.println("Perimeter of circle 1: " + circle1.getPerimeter() + "Area of circle 1: " + circle1.getArea());
//        System.out.println("Perimeter of circle 2: " + circle2.getPerimeter() + "Area of circle 2: " + circle2.getArea());
    }

}
