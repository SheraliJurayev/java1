package one;


import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[15];

        System.out.println("15 ta haqiqiy sonni kiriting:");
        for (int i = 0; i < 15; i++) {
            System.out.print("a" + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        boolean increasing = true;
        for (int i = 0; i < 14; i++) {
            if (numbers[i] > numbers[i + 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing) {
            System.out.println("Sonlar o'sish tartibida tartiblangan.");
        } else {
            int index = 1;
            for (int i = 1; i < 15; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    index = i + 1;
                    break;
                }
            }
            System.out.println("Tartib buzgan birinchi sonning tartib nomeri: a" + index);
        }
    }
}