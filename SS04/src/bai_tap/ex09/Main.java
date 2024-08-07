package bai_tap.ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[100];
//        Bước 3: .Trong phương thức main() khởi tạo danh sách Student
//        có độ rộng 100 phần tử.
//        Tạo menu chức năng như yêu cầu.
//        Sử dụng cấu trúc lặp while và cấu trúc điều kiện switch case
//        để điều hướng chức năng theo lựa chọn của người dùng.
//    1. Hiển thị danh sách tất cả học sinh
//    2. Thêm mới học sinh
//    3. Sửa thông tin học sinh dựa vào mã học sinh
//    4. Xoá học sinh
//    5. Thoát

        System.out.println("Menu: \n"
        + "1. Hiển thị danh sách tất cả học sinh \n"
        + "2. Thêm mới học sinh \n"
        + "3. Sửa thông tin học sinh dựa vào mã học sinh \n"
        + "4. Xoá học sinh \n"
        + "5. Thoát \n"
        );
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                for (int i = 0; i < student.length; i++) {
                    student[i].displayData();
                }
                break;
            case 2:



        }
//        Bước 4: Chạy chương trình và quan sát kết quả.
    }
    public static void AddStudent (){
        System.out.println("Please enter the number of students you want to add: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i < n; ){}
    }
}
