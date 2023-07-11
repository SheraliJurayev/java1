package Constructor;

public class Car {
    String modelCar;
    int yearCar;

    public Car(String carModel , int year){
        modelCar = carModel;
        yearCar = year;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Cobalt" , 2022);
        System.out.println("My car model is " + myCar.modelCar + ", year is " + myCar.yearCar);
    }
}
