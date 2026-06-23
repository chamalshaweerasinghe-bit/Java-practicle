public class DogApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Buddy";
        dog1.age = 3;
        dog1.breed = "Labrado";

        System.out.println("Name is: " + dog1.name);
        System.out.println("Age is: " + dog1.age);
        System.out.println("Breed name is: " + dog1.breed);

        dog1.run();
        dog1.sleep();
        dog1.bark();
		
		Dog dog2 = new Dog();

        dog2.name = "Banti";
        dog2.age = 3;
        dog2.breed = "Pomanarioum";

        System.out.println("Name is: " + dog2.name);
        System.out.println("Age is: " + dog2.age);
        System.out.println("Breed name is: " + dog2.breed);

        dog2.run();
        dog2.sleep();
        dog2.bark();
    }
}