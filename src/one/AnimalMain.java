package one;

public class AnimalMain {
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit("Velkan rabbit " , 3);
        Shark shark = new Shark("Dark shark " , 10 );

        rabbit.eat();
        rabbit.sleep();
        rabbit.air();

        shark.swim();
        shark.eat();
        shark.sleep();

    }
}
