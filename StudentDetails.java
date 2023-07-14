package com.jap.students;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class StudentDetails {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(110,"Malcolm","King","23, Alder main"),
                new Student(111,"Gary","Aldrin","123, Marble main"),
                new Student(114,"Yani","Tress","45, Francis Street"),
                new Student(101,"Sharon","Stone","12, Martha street"),
                new Student(123,"Jane","Jacob","10, Marble drive"));
        System.out.println("The Student List Before Sorting");
        for(Student s : studentList){
            System.out.println(s);
        }
        Collections.sort(studentList,new NameComparator());
        System.out.println("The Student List After Sorting By First Name");
        for(Student s : studentList){
            System.out.println(s);
        }
        Collections.sort(studentList,new RollNumberComparator());
        System.out.println("The Student List After Sorting By Roll Number");
        for(Student s : studentList){
            System.out.println(s);
        }


    }


}
