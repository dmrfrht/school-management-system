package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Teacher canan = new Teacher(1, "Canan", 500);
    Teacher zeynep = new Teacher(2, "Zeynep", 700);
    Teacher ayse = new Teacher(3, "Ayse", 600);

    List<Teacher> teacherList = new ArrayList<>();
    teacherList.add(canan);
    teacherList.add(zeynep);
    teacherList.add(ayse);

    Student mellisa = new Student(1, "Mellisa", 4);
    Student elia = new Student(2, "Elia", 12);
    Student cristiano = new Student(3, "Cristiano", 5);

    List<Student> studentList = new ArrayList<>();
    studentList.add(mellisa);
    studentList.add(elia);
    studentList.add(cristiano);

    School nevzatAyazHighSchool = new School(teacherList, studentList);

    Teacher megan = new Teacher(6,"Megan", 900);
    nevzatAyazHighSchool.addTeacher(megan);

    System.out.println("Nevzat Ayaz High School has earned $" + nevzatAyazHighSchool.getTotalMoneyEarned());

    mellisa.payFees(5000);
    System.out.println("Nevzat Ayaz High School has earned $" + nevzatAyazHighSchool.getTotalMoneyEarned());

    elia.payFees(6000);
    System.out.println("Nevzat Ayaz High School has earned $" + nevzatAyazHighSchool.getTotalMoneyEarned());

    System.out.println("--- MAKING nevzatAyazHighSchool PAY SALARY ----");

    canan.receiveSalary(canan.getSalary());
    System.out.println("Nevzat Ayaz High School has spent for salary to: " + canan.getName());
    System.out.println("Nevzat Ayaz High School has earned $" + nevzatAyazHighSchool.getTotalMoneyEarned());

    zeynep.receiveSalary(zeynep.getSalary());
    System.out.println("Nevzat Ayaz High School has spent for salary to: " + zeynep.getName());
    System.out.println("Nevzat Ayaz High School has earned $" + nevzatAyazHighSchool.getTotalMoneyEarned());

    ayse.receiveSalary(ayse.getSalary());
    System.out.println("Nevzat Ayaz High School has spent for salary to: " + ayse.getName());
    System.out.println("Nevzat Ayaz High School has earned $" + nevzatAyazHighSchool.getTotalMoneyEarned());


    System.out.println(elia);
    System.out.println(canan);
  }
}
