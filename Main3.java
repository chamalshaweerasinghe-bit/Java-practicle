class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }
}

class Employee extends Person {
    String employeeId;
    String department;

    void showEmployeeInfo() {
        System.out.println("Employee " + employeeId + " works in " + department);
    }
}

class SecurityAnalyst extends Employee {
    int clearanceLevel;

    void analyzeThreats() {
        System.out.println("Analyst " + name + 
        " is analysing threats at clearance level " + clearanceLevel);
    }
}

public class Main3 {
    public static void main(String[] args) {
        SecurityAnalyst sa = new SecurityAnalyst();

        sa.name = "Diana";
        sa.age = 29;
        sa.employeeId = "SA-201";
        sa.department = "SOC";
        sa.clearanceLevel = 3;

        sa.introduce();
        sa.showEmployeeInfo();
        sa.analyzeThreats();
    }
}