package thuc_hanh;

public class Student {
    int studentID;
    String studentName;
    boolean sex;
    String className;
    int age;
    String address;

    public Student() {
    }

    public Student(int studentID,String studentName,boolean sex,String className,int age, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }
    public void display(){
        System.out.println("Student ID: " + studentID
                        + "\nStudent Name: " + studentName
                        + "\nStudent sex: " + (sex ? "Male" : "Female")
                        + "\nStudent class: " + className
                        + "\nStudent age: " + age
                        + "\nStudent address: " + address
        );
    }
}
