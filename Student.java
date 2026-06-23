class Student {
    int studentId;
    String name;
    int age;
    double gpa;

    // Parameterized constructor
    Student(int studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // non para - non return type method
    void introduce() {
        System.out.println("Student ID: " + studentId +
                ", Name: " + name +
                ", Age: " + age +
                ", GPA: " + gpa);
    }

    // para - non return type method
    void updateGpa(double newGpa) {
        gpa = newGpa;
        System.out.println(name + "'s GPA has been updated to " + gpa);
    }
}


// Separate main class
class StudentApp {
    public static void main(String[] args) {

        // create objects
        Student s1 = new Student(101, "Kamal", 20, 3.5);
        Student s2 = new Student(102, "Nimal", 21, 3.8);

        // call methods

        // introduce both students
        s1.introduce();
        s2.introduce();

        // update GPA of one student
        s1.updateGpa(3.9);
    }
}