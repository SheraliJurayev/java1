package one;

public class Methods {
    static void myMethod(int age) {
        if (age<18) {
            System.out.println("Kirish taqiqlanadi !");
        }else{
            System.out.println("Kirish mumkin !");
        }
    }
public static void main(String[] args) {
        myMethod(12);


}
}
