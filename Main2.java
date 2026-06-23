class Vehicle {

    private int vehicleID;
    private String brand;
    private int speed;

    public Vehicle(int id,String brand,int speed){
        vehicleID=id;
        this.brand=brand;
        this.speed=speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void calculateSpeed(){
        System.out.println("Vehicle speed: " + speed);
    }
}


class Car extends Vehicle {

    private int numberOfDoors;

    public Car(int id,String brand,int speed,int doors){
        super(id,brand,speed);
        numberOfDoors=doors;
    }

    public void calculateSpeed(){
        System.out.println("Car speed: " + getSpeed()+" km/h");
    }
}


public class Main2 {
    public static void main(String[] args){

        Vehicle v = new Car(1,"BMW",180,4);

        v.calculateSpeed();
    }
}