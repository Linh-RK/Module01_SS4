package bai_tap.ex02;

public class QuadraticEquation {
    //    Nhập vào 3 giá trị cho a, b, c và
//    hiển thị kết quả dựa trên việc tính delta.
//    Nếu delta >= 0, hiển thị 2 nghiệm.
//    Nếu delta bằng 0, hiển thị một nghiệm (do 2 nghiệm bằng nhau).
//    Còn lại hiển thị chuỗi “The equation has no roots”
//    Bước 1: Tạo lớp QuadraticEquation ,
//    khai báo các thuộc tính (properties),
//    định nghĩa các phương thức khởi tạo (contructors).
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //    Bước 2: Định nghĩa phương thức gettter cho a, b và c.

    //    Bước 3: Định nghĩa phương thức getDiscriminant()
//    trả về delta theo công thức delta = b2 - 4ac.
    public void getDiscriminant() {
        double delta = b * b - 4 * a * c;

    }
}


