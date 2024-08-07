package bai_tap.ex01;

import java.util.Scanner;

public class Circle {
//    Biết cách khai báo lớp (thuộc tính, phương thức)
//    Biết cách khởi tạo đối tượng
//    Biết cách sử dụng các phương thức của đối tượng
//    Mô tả
//    Xây dựng lớp Circle gồm các thuộc tính : Bán kính và Màu sắc.
//            Hướng dẫn
//Xây dựng lớp Circle gồm các thuộc tính : Bán kính và Màu sắc.
    private double radius;
    private String color;
//    các phương thức khởi tạo (constructor) 0 tham số và có tham số,
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
//    các phương thức getter và setter,

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//    phương thức chuVi() trả về chu vi của hình tròn ,
    public double getPerimeter (){
        return 2 * this.radius * Math.PI;
    }
//    phương thức dienTich() trả về diện tích hình tròn ,
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
//    phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng, phương thức displayData() cho phép hiển thị toàn bộ thông tin các thuộc tính.
    public void input(Scanner scanner){
        System.out.println("Please enter the radius of the circle:");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the color of the circle:");
        this.color = scanner.nextLine();

    }
    public void dislayData(){
//        System.out.println("Radius: " + this.radius + "\nColor: " + this.color + "\nPerimeter: " + this.getPerimeter()+ "\nArea: " + this.getArea());
        System.out.printf("radius: %.2f color: %8s perimeter: %.3f area %.3f\n",this.radius, this.color, this.getPerimeter(), this.getArea());
    }
//    Yêu cầu vẽ biểu đồ lớp Circle trước khi triển khai.
//    Bước 1: Tạo lớp Circle, khai báo các thuộc tính (properties),
//    định nghĩa các phương thức khởi tạo (constructors),
//    tạo thêm phương thức tính chu vi và diện tích trong lớp Circle.
//    Bước 2: Tạo lớp Main chứa phương thức main() để chạy chương trình.
//    Bước 3: Trong lớp Main , khởi tạo các đối tượng hình tròn với bán kính khác nhau,
//    từ đối tượng gọi phương thức tính chu vi và diện tích của hình tròn đó.

//    Bước 4: Chạy chương trình và quan sát kết quả.
}
