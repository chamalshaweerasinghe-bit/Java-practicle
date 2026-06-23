class Person {

    protected int id;
    protected String name;

    public Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}


class Employee extends Person {

    protected double salary;

    public Employee(int id,String name,double salary){
        super(id,name);
        this.salary=salary;
    }
}


class Manager extends Employee {

    String department;

    public Manager(int id,String name,double salary,String dept){
        super(id,name,salary);
        department=dept;
    }


    public void displayInfo(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }
}


public class Main4 {

    public static void main(String[] args){

        Manager m = new Manager(1,"David",70000,"Finance");

        m.displayInfo();
    }
}