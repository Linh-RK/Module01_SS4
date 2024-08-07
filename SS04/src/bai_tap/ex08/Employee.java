package bai_tap.ex08;

import java.util.Scanner;

public class Employee {
//    Viết chương trình Java nhập vào thông tin của n nhân viên,
//    tính lương và hiển thị thông tin của tất cả các nhân viên.
//    Xây dựng lớp Employee gồm các thuộc tính như: mã nhân viên(employeeId),
//    tên nhân viên (employeeName) , tuổi (age), giới tính (gen),
//    hệ số lương(rate) và lương(salary).
//    các phương thức khởi tạo (constructor) 0 tham số và có tham số,
//    phương thức inputData() cho phép người dùng nhập vào
//    toàn bộ thông tin của đối tượng trừ lương, phương thức displayData()
//    cho phép hiển thị toàn bộ thông tin nhân viên, phương thức calSalary()
//    cho phép tính lương nhân viên theo công thức salary = rate * 1.300.000 .
//    Yêu cầu vẽ biểu đồ lớp Student trước khi triển khai.
//            Hướng dẫn
//    Bước 1: Tạo lớp Employee, khai báo các thuộc tính (properties),
//    định nghĩa các phương thức khởi tạo (constructors),
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private int rate;
    private int salary;

    public Employee() {
    }
    public Employee(String employeeId, String employeeName, int age, boolean gen, int rate, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }
    //    tạo các phương thức nhập thông tin, hiển thị, tính lương nhân viên.
    public void inputData(Scanner scanner){
        System.out.println("Please enter the employee ID: ");
        this.employeeId = scanner.next();
        System.out.println("Please enter the employee name: ");
        this.employeeName = scanner.next();
        System.out.println("Please enter the employee age: ");
        this.age = Integer.parseInt(scanner.next());
        System.out.println("Please enter the employee gen: ");
        this.gen = Boolean.parseBoolean(scanner.next());
        System.out.println("Please enter the employee rate: ");
        this.rate = Integer.parseInt(scanner.next());

    }
    public void displayData (){
        System.out.println(
                "Employee information: \n"
                + "Employee ID: "+ this.employeeId + "\n"
                + "Employee Name: "+ this.employeeName + "\n"
                + "Employee Age: "+ this.age + "\n"
                + "Employee Gen: "+ (this.gen ? "Male" : "Female")  + "\n"
                + "Employee Rate: "+ this.rate + "\n"
                + "Employee Salary: "+ calSalary() + "\n"
        );
    }
public int calSalary() {
        int salary = this.rate * 1300000;
        return salary;
}
}
