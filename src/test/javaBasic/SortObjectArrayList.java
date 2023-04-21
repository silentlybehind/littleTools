package test.javaBasic;

import java.util.ArrayList;
import java.util.Collections;

public class SortObjectArrayList {
    public static void main(String args[]){
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Neeraj", 22));
        al.add(new Student("Pawan", 27));
        al.add(new Student("Pankaj", 25));
        al.add(new Student("Suraj", 28));
        Collections.sort(al);
        for(Student s:al){
            System.out.println(s);
        }
    }
}
