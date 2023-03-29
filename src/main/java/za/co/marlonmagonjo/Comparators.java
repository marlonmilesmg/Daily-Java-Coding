package za.co.marlonmagonjo;

import java.util.Comparator;
import java.util.TreeSet;

class Student{
    private int studentNo;
    private String name;
    private double score;

    public Student(int studentNo, String name, double score){
        this.studentNo = studentNo;
        this.name = name;
        this.score = score;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

// comparator.compare(s1, s2)
class StudentNumberComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentNo() - o2.getStudentNo();
    }
}

class StudentScoreComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getScore() > o2.getScore()){
            return 1;
        } else if (o1.getScore() < o2.getScore()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Comparators {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentNumberComparator());
        students.add(new Student(2, "Marlon", 96));
        students.add(new Student(3, "Jacob", 75));
        students.add(new Student(1, "Timothy", 98));
        System.out.println("Compare Students by studentNo - - - - - - - - - - - - - ");
        System.out.println(students);
        System.out.println("==========================================================");

        TreeSet<Student> studentss = new TreeSet<>(new StudentScoreComparator());
        studentss.add(new Student(2, "Marlon", 96));
        studentss.add(new Student(3, "Jacob", 75));
        studentss.add(new Student(1, "Timothy", 98));
        System.out.println("Compare Students by score - - - - - - - - - - - - - ");
        System.out.println(studentss);
        System.out.println("==========================================================");
    }
}
