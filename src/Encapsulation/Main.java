package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person object = new Person();

//        myObj.name = "John";  // error
//        System.out.println(myObj.name); // error

        object.setName("John");
        System.out.println(object.getName());
    }
}
