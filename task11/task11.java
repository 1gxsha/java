package task11;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String currentString = scanner.next();

        System.out.println("Ваша строка: " + currentString + "\n" + "Строка без гласных: " + minusvowels(currentString));

    }
    public static String minusvowels(String lackofvowels) {
        return lackofvowels.replaceAll("[АаОоУуИиЕеЁёЭэЫыЮюЯя]", "");
    }

}