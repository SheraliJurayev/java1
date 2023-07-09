package one;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        Scanner firstNumber = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int number1 = firstNumber.nextInt();

        Scanner  secondNumber = new Scanner(System.in);
        System.out.print("b sonini kiriting: ");
        int number2 = secondNumber.nextInt();

        if(number1 % number2==0){
            System.out.println( number1*2 + " Shart bajariladi");
        } else {
            System.out.println(number2 / 2 + " Shart bajarilmadi");
        }

    }
}