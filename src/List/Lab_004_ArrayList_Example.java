package List;

import java.util.ArrayList;
import java.util.Collection;

public class Lab_004_ArrayList_Example {
    public static void main(String[] args) {
        Student s1 = new Student(001, "Suresh", 21);
        Student s2 = new Student(002, "Ramesh", 20);
        Student s3 = new Student(003, "Dinesh", 22);

        ArrayList<Student> myStudent = new ArrayList();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        System.out.println(myStudent);

//        for(Object o: l){
//            System.out.println(o.toString());
//        }

//        for (int i=0; i<l.size(); i++){
//            System.out.println(l.get(i));
//        }


    }
}
class Student{
    private int rollno;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;

    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
