package bai_tap.ex04;

public class Fan {
//    Lớp này gồm các thành phần sau:
//    3 hằng được đặt tên là SLOW, MEDIUM, và FAST với giá trị 1, 2, và 3 để biểu thị tốc độ quạt.
private static final int SLOW =1;
private static final int MEDIUM =2;
private static final int FAST =3;
//    Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt, mặc định là SLOW
    private int speed = 1;
//    Trường on có kiểu private boolean để xác định quạt đang bật hay tắt, mặc định là false (tắt).
    private boolean on = false;
//    Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc định là 5
    private double radius = 5;
//    Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là blue
    public String color = "blue";
//    Các getter và setter cho các thuộc tính

//----------------------------
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

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
//----------------------------
//phương thức trả về speed, color,
//    và radius với chuỗi “fan is on”.
//    Nếu quạt không ở trạng thái on,
//    phương thức trả về color,
//    radius với chuỗi “fan is off”.
    public String toString() {
        if(on == true){
            String status = "Speed is " + speed + "\n"
                            +"Color is " + color + "\n"
                            +"Radius is " + radius + "\n"
                            +"fan is on";
            return status;
        } else {
            String status =
                    "Color is " + color + "\n"
                    + "Radius is " + radius + "\n"
                    + "fan is off";
            return status;
        }
    }

    //    Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
//    Phương thức toString() trả về chuỗi chứa thông tin của quạt. Nếu quạt đang ở trạng thái on,
//    phương thức trả về speed, color, và radius với chuỗi “fan is on”.
//    Nếu quạt không ở trạng thái on, phương thức trả về color, radius với chuỗi “fan is off”.
//    Vẽ sơ đồ UML cho lớp và cài đặt lớp
//    Viết chương trình hiển thị các đối tượng bằng cách gọi phương thức toString
//    Tạo 2 đối tượng Fan
//    Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
//    Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
//    private int speed;
}
