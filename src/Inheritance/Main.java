package Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Mufassa";
        myDog.eat();
        myDog.gaf();

        Cat myCat = new Cat();
        myCat.name = "Bezbet";
        myCat.eat();
        myCat.miow();
    }
}
