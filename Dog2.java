public class DogApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Banti";
        dog1.age = 3;
        dog1.breed = "pomanarioum";

        System.out.println("Name is: " + dog1.name);
        System.out.println("Age is: " + dog1.age);
        System.out.println("Breed name is: " + dog1.breed);

        dog1.run();
        dog1.sleep();
        dog1.bark();
    }
}