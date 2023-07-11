package one;

public class MotherMain {
    public static void main(String[] args) {
        Son son = new Son("30 km/s" , "16m");
        Daughter daughter = new Daughter("20km/s" , "7m");

        son.drive();
        son.sleep();
        son.write();

        daughter.sleep();
        daughter.drive();
        daughter.giveBirth();
    }
}
