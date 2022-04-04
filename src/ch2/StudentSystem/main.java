package ch2.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(addData());

    }
    public static Student addData(){
        int id , age ;
        String name , major;
        double tawjehi_score;
        Scanner in = new Scanner(System.in);
        System.out.println("enter student data : ");
        System.out.println("enter student id :");
        id = in.nextInt();
        System.out.println("enter student name :");
        name  = in.nextLine();
        System.out.println("enter student age :");
        age = in.nextInt();
        System.out.println("enter major name :");
        major  = in.nextLine();
        System.out.println("enter tawjehi score name :");
        tawjehi_score  = in.nextDouble();
        Student mStudent = new Student(id , name ,age ,major ,tawjehi_score);
        return mStudent;
    }

}
