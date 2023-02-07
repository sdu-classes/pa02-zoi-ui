import java.util.*;
import java.util.stream.Stream;

public class pra2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Animal animal = new Animal("Animal");
        System.out.println(animal);
        Mammal mammal = new Mammal("Mammal");
        System.out.println(mammal);
        Cat cat = new Cat("Cat");
        cat.greeting();
        System.out.println(cat);
        Dog dog = new Dog("Dog");
        dog.greetings();
        dog.greetings(dog);
        System.out.println(dog);



    }
}
class Animal {
    private String name;
    Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Mammal extends Animal{
    Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
class Cat extends Mammal{
    Cat(String name){
        super(name);
    }
    void greeting(){
        System.out.println("Meow");
    }


    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
class Dog extends Mammal{
    Dog(String name){
        super(name);
    }
    void greetings(){
        System.out.println("Woof");
    }
    void greetings(Dog another ){
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
