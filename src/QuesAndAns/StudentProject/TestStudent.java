package QuesAndAns.StudentProject;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student s1= new Student("Jack" , 01,97,15);
        Student s2= new Student("Ruby" , 02,83,19);
        Student s3= new Student("Robert" , 03,45,14);
        Student s4= new Student("Chris" , 04,67,17);
        Student s5= new Student("Robin" , 05,95,16);

        List<Student> StudentList = new ArrayList<Student>();
        StudentList.add(s1);
        StudentList.add(s4);
        StudentList.add(s5);
        StudentList.add(s2);
        StudentList.add(s3);

        for (Student s : StudentList){
            System.out.println(s);
        }
        System.out.println("---------------------------------");
        StudentList.stream().forEach(e-> System.out.println(e));
        System.out.println("---------------------------------");
        StudentList.stream().filter(e->e.getMarks()>80)
                .forEach(e-> System.out.println(e.getName()+":"+e.getMarks()));
        System.out.println("-----------------------------------");
        int hm = StudentList.stream().map(e->e.getMarks()).max(Integer :: compare).get();
        System.out.println(hm);
        System.out.println("------------------------------------");
        StudentList.stream().filter(e->e.getMarks()==hm).forEach(e-> System.out.println(e));
    }
}
