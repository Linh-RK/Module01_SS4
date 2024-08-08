package bai_tap.ex09;

public class StudentManagement {
    public static StudentCRUD studentCRUD = new StudentCRUD();
    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu");
            System.out.println("Menu: \n"
                    + "1. Hiển thị danh sách tất cả học sinh \n"
                    + "2. Thêm mới học sinh \n"
                    + "3. Sửa thông tin học sinh dựa vào mã học sinh \n"
                    + "4. Xoá học sinh \n"
                    + "5. Thoát \n"
            );
        }
    }
}
