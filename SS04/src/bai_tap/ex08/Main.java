package bai_tap.ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    Bước 2: Tạo lớp Main chưa phương thức main() để chạy chương trình.
//    Bước 3: .Trong phương thức main() ,
//    khởi tạo 5 đối tượng nhân viên từ lớp Employee,
//    thực hiện nhập thông tin, tính lương và
//    hiển thị toàn bộ thông tin các nhân viên ra màn hình.
//    Bước 4: Chạy chương trình và quan sát kết quả.
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();
        emp1.inputData(sc);
        emp2.inputData(sc);
        emp3.inputData(sc);
        emp4.inputData(sc);
        emp5.inputData(sc);
        emp1.calSalary();
        emp2.calSalary();
        emp3.calSalary();
        emp4.calSalary();
        emp5.displayData();
        emp1.displayData();
        emp2.displayData();
        emp3.displayData();
        emp4.displayData();
        emp5.displayData();
    }
}
