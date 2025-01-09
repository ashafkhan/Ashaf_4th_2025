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
