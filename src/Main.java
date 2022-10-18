import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList students = new ArrayList();
        students.add(new Student("omar",18,100));
        students.add(new Student("Ahmed",17,70));
        students.add(new Student("Mohamed",22,60));
        students.add(new Student("Hosny",19,85));
        students.add(new Student("Amin",16,90));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.finalGrade - o1.finalGrade;
            }
        });
        System.out.println(students);
    }
}