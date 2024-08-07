package bai_tap.ex09;

import java.util.Scanner;

public class Student {
//    Xây dựng lớp Student gồm các thuộc tính như:
//    mã HS, tên HS, tuổi, giới tính, địa chỉ và số điện thoại.
    private String ID;
    private String fullName;
    private int age;
    private boolean gender;
    private String address;
    private String phone;
//    các phương thức khởi tạo (constructor) 0 tham số và có tham số,

    public Student() {
    }

    public Student(String ID, String fullName, int age, Boolean gender, String address, String phone) {
        this.ID = ID;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    //    phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng,

    public void inputData(Scanner scanner){
        System.out.println("Please enter student ID:");
        this.ID = scanner.next();
        System.out.println("Please enter student name:");
        this.fullName = scanner.next();
        System.out.println("Please enter student age:");
        this.age = Integer.parseInt(scanner.next());
        System.out.println("Please enter student gender:");
        this.gender = Boolean.parseBoolean(scanner.next());
        System.out.println("Please enter student address:");
        this.address = scanner.next();
        System.out.println("Please enter student phone number:");
        this.phone = scanner.next();
    }
//    phương thức displayData() cho phép hiển thị toàn bộ thông tin học sinh.
public void displayData() {
        System.out.println(
                "Student information: \n"
                        + "Employee ID: "+ this.ID + "\n"
                        + "Employee Name: "+ this.fullName + "\n"
                        + "Employee Age: "+ this.age + "\n"
                        + "Employee Gender: "+ (this.gender ? "Male" : "Female")  + "\n"
                        + "Employee Address: "+ this.address + "\n"
                        + "Employee Phone: "+ this.phone + "\n"

        );
}
//    Xây dựng menu chức năng bao gồm :
//
//    Yêu cầu vẽ biểu đồ lớp Student trước khi triển khai.
//            Hướng dẫn
//    Bước 1: Tạo lớp Student , khai báo các thuộc tính (properties),
//    định nghĩa các phương thức khởi tạo (constructors).

}
