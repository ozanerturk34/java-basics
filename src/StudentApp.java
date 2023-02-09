class Student {
    public String name;
    public static String studentClass;
    public static final int age = 12;
    public static int count = 0;
    public Student(String name) {
        this.name = name;
        count++;
    }
    public void getStudentName() {
        System.out.println(name);
    }

    public void getStudentNameAndClass() {
        System.out.println(name+" is enrolled to "+studentClass);
    }

    public static void getStudentClass() {
        System.out.println(studentClass);
        // static fields can't make a reference to non-static values
        // System.out.println(name); gives an error
    }

}

public class StudentApp{
    public static void print() {
        Student.studentClass = "Math";
        Student.getStudentClass();
        Student student1 = new Student("John");
        Student student2 = new Student("Mike");
        student1.getStudentName();
        student2.getStudentName();
        student1.getStudentClass();
        student2.getStudentClass();
        student1.getStudentNameAndClass();
        student2.getStudentNameAndClass();
        System.out.println(student2.age);
        student2.getStudentNameAndClass();
        System.out.println(student1.count);
        System.out.println(student2.count);
        System.out.println(Student.count);


    }
}