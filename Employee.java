class Employee {
    int empId;
    String empName;
    String department;
    double basicSalary;

    // Parameterized constructor
    Employee(int empId, String empName, String department, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    // Method to calculate net salary
    double calculateNetSalary(double bonusPercentage) {
        return basicSalary + (basicSalary * bonusPercentage / 100);
    }

    // Method to get employee summary
    String getEmployeeSummary() {
        return "Employee ID: " + empId +
               ", Name: " + empName +
               ", Department: " + department;
    }

    // Method to promote employee
    void promote(String newDepartment) {
        department = newDepartment;
        System.out.println(empName + " has been promoted to " + newDepartment + ".");
    }

    // Main method
    public static void main(String[] args) {
        // Create two employees
        Employee e1 = new Employee(1, "Kamal", "IT", 50000);
        Employee e2 = new Employee(2, "Nimal", "HR", 60000);

        // Print summaries
        System.out.println(e1.getEmployeeSummary());
        System.out.println(e2.getEmployeeSummary());

        // Calculate net salary with 20% bonus
        System.out.println("Net Salary of " + e1.empName + ": " + e1.calculateNetSalary(20));
        System.out.println("Net Salary of " + e2.empName + ": " + e2.calculateNetSalary(20));

        // Promote one employee
        e1.promote("Finance");
    }
}