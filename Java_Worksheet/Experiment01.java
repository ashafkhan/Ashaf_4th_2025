//Create a class Animal with a method makeSound() that outputs a generic sound.The class should further contain derived classes Dog and Cat that override the makeSound() method to output specific sounds for each animal. Demonstrate polymorphism by creating an Animal reference that can hold objects of both Dog and Cat, and call the overridden makeSound() method at runtime.

public class Experiment01 {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        System.out.println("Dog:");
        animal1.makeSound();

        System.out.println("\nCat:");
        animal2.makeSound();

        Animal[] animals = {new Dog(), new Cat()};
        System.out.println("\nPolymorphism:");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}