class Animal {
    String name;

    void makeSound() {
        System.out.println(name + " makes a generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}

public class Main3 {
    public static void main(String[] args) {


        Dog d = new Dog();
        d.name = "Rex";
        d.makeSound();

        Cat c = new Cat();
        c.name = "Luna";
        c.makeSound();

        Bird b = new Bird();
        b.name = "Tweety";
        b.makeSound();

     

        Animal a1 = new Dog();
        a1.name = "Bruno";
        a1.makeSound();

        Animal a2 = new Cat();
        a2.name = "Kitty";
        a2.makeSound();

        Animal a3 = new Bird();
        a3.name = "Sky";
        a3.makeSound();
    }
}