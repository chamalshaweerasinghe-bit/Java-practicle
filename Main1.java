class Person {
    private int personID;
    private String name;
    private int age;

    public Person(int personID, String name, int age) {
        this.personID = personID;
        this.name = name;
        this.age = age;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
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

    public void displayDetails() {
        System.out.println("ID: " + personID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    private String course;

    public Student(int id, String name, int age, String course) {
        super(id, name, age);
        this.course = course;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course: " + course);
    }
}


public class Main1 {
    public static void main(String[] args) {

        Person p = new Person(1,"John",20);
        Student s = new Student(2,"Alex",21,"IT");

        p.displayDetails();
        System.out.println();

        s.displayDetails();
    }
}