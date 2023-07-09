package one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("3 xonali N natural sonni kiriting: ");
        int number = scanner.nextInt();

        int sum = sumOfDigits(number);

        System.out.println("Raqamlar yig'indisi: " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

        }



