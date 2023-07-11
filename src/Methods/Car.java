package Methods;

public class Car {
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxspeed){
        System.out.println("Max speed is: " + maxspeed);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fullThrottle();
        myCar.speed(300);
    }
}
