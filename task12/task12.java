package task12;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введи второе число: ");
        int secondNumber = scanner.nextInt();
        squareOfRange(firstNumber, secondNumber);
    }
    public static void squareOfRange(int a, int b) {
        int min = 0;
        int max = 0;
        if (a < b) {
            min = a;
            max = b;
        }
        else {
            min = b;
            max = a;
        }
        for (int i = min; i <= max; i +=min) {
            System.out.print((int) Math.pow(i,2) + " ");
        }
    }
}