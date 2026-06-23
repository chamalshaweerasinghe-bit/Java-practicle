class Employee {

    void work() {
        System.out.println("Employee is working.");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer is writing and testing code.");
    }
}

class Designer extends Employee {

    @Override
    void work() {
        System.out.println("Designer is creating UI/UX designs.");
    }
}

public class Main8 {
    public static void main(String[] args) {

        Employee emp = new Employee();
        Employee dev = new Developer();
        Employee des = new Designer();

        emp.work();
        dev.work();
        des.work();
    }
}