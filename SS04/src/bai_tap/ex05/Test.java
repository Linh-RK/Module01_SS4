package bai_tap.ex05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student  = new Student();
//        student.setName("line");
//        student.setClasses("C05");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
