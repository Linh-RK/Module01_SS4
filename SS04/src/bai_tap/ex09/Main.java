package bai_tap.ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int currentIndex = 0;
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
//    boolean flag = true;
        int choice = 1;
        while (true) {
            System.out.println("Menu: \n"
                    + "1. Hiển thị danh sách tất cả học sinh \n"
                    + "2. Thêm mới học sinh \n"
                    + "3. Sửa thông tin học sinh dựa vào mã học sinh \n"
                    + "4. Xoá học sinh \n"
                    + "5. Thoát \n"
            );
//             choice = Integer.parseInt(sc.nextLine());
             try{
                 choice = Integer.parseInt(sc.nextLine());
             }catch(Exception e){
                 System.out.println("wrong");
             }
            StudentCRUD studentCRUD = new StudentCRUD();
            switch (choice) {
                case 1:
                    studentCRUD.showAllStudents();

                    break;
                case 2:
                    studentCRUD.addNewStudent(sc);
                    studentCRUD.showAllStudents();
                    break;
                case 3:
                    studentCRUD.updateStudent(sc);
                    studentCRUD.showAllStudents();
                    break;
                case 4:
                    studentCRUD.deleteStudent(sc);
                    studentCRUD.showAllStudents();
                    break;
                case 5:
                    System.out.println("Good bye !");
                    System.exit(0);
//                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }}
//        Bước 4: Chạy chương trình và quan sát kết quả.
    }
//    public static void AddStudent (){
//        System.out.println("Please enter the number of students you want to add: ");
//        Scanner sc = new Scanner(System.in);
//        Student[] student = new Student[sc.nextInt()];
//        int n = Integer.parseInt(sc.nextLine());
//        for(int i = 0; i < n; i++){
//            student[student.length + i] = new Student();
//        }
//    }


