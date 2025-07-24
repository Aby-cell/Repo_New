interface Animal {
    void makeSound();
    void eat();
}
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.eat();
    }
}
