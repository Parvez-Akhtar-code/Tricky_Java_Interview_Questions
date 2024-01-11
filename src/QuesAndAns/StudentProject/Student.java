package QuesAndAns.StudentProject;

public class Student {
    private String name;
    private int rollno;
    private int marks;
    private int age;

    public Student(String name, int rollno, int marks, int age) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student = [ name = "+name+", rollno = "+rollno+", marks = "+marks+", age = "+age+" ]";
    }
}
