package bai_tap.ex09;

import java.util.Scanner;

public class StudentCRUD {
    public static Student[] students = new Student[0];

    public void addNewStudent(Scanner sc) {
        System.out.println("Please enter the number of students you want to add");
        int n = Integer.parseInt(sc.nextLine());
        Student[] newStudents = new Student[students.length + n];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        for (int i = 0; i < n; i++) {
            Student newStudent = new Student();
            newStudent.inputData(sc);
            newStudents[students.length + i] = newStudent;
        }
        students = newStudents;
    };

    public void showAllStudents() {
        if (students.length == 0) {
            System.out.println("Don't have any students in the list");
        } else {
            System.out.println("The list of students is: ");
            for (int i = 0; i < students.length; i++) {
                students[i].displayData();
            }
        }
    };

    public void updateStudent(Scanner sc) {
        System.out.println("Please enter the student id you want to update");
        int ID = Integer.parseInt(sc.nextLine());
        if (findIndexStudent(ID) != -1) {
            students[findIndexStudent(ID)].inputData(sc);
            System.out.println("Updated:\n" +
                    students[findIndexStudent(ID)]);
        } else {
            System.out.println("Can not find student with id " + ID);
        }
    };

    public void deleteStudent(Scanner sc) {
        System.out.println("Please enter the student id you want to delete");
        int ID = Integer.parseInt(sc.nextLine());

        if (findIndexStudent(ID) != -1) {
            Student[] newStudent = new Student[students.length - 1];
            for (int i = 0; i < students.length; i++) {
                if (i < findIndexStudent(ID)) {
                    newStudent[i] = students[i];
                } else {
                    newStudent[i] = students[i + 1];
                }
                ;
            }
            students = newStudent;
        } else {
            System.out.println("Can not find student with id " + ID);
        }
    };

    //    public void addNewStudent(){};
    public int findIndexStudent(int ID) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getID() == ID) {
                index = i;
                break;
            }
    }
        if (index != -1) {
            return index;
        } else {
            return -1;
        }
    }
}

