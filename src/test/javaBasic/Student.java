package test.javaBasic;


public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Student obj) {
//sort in ascending order
        return this.age-obj.age;
//sort in descending order
//return obj.age-this.age;
    }
    //this method is used to print the Student object in user friendly manner
    @Override
    public String toString() {
        return "Name:"+name+", Age:"+age;
    }
}
