class Employee {

    protected int id;
    protected String name;
    protected double salary;

    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void calculateBonus(){
        System.out.println("Bonus: "+salary*0.05);
    }
}


class Manager extends Employee {

    String department;

    public Manager(int id,String name,double salary,String dept){
        super(id,name,salary);
        department=dept;
    }

    public void calculateBonus(){
        System.out.println("Manager Bonus: "+salary*0.10);
    }
}


class Developer extends Employee {

    String programmingLanguage;

    public Developer(int id,String name,double salary,String lang){
        super(id,name,salary);
        programmingLanguage=lang;
    }

    public void calculateBonus(){
        System.out.println("Developer Bonus: "+salary*0.08);
    }
}


public class Main3 {

    public static void main(String[] args){

        Manager m = new Manager(1,"Sam",50000,"HR");
        Developer d = new Developer(2,"Tom",60000,"Java");

        m.calculateBonus();
        d.calculateBonus();
    }
}