public class Student {
String name;
int age;
int finalGrade;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public Student(String name, int age, int finalGrade) {
        this.name = name;
        this.age = age;
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        return "{ " + name+", " +age+", "+finalGrade+ " }";
    }
}
