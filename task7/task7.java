package task7;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int dit = scanner1.nextInt();
        int findDit = (int) Math.round(Math.sqrt(dit));
        System.out.println("Вы ввели: " + dit + "\n" + "Ближайший квадрат: " + (int) Math.pow(findDit, 2) + "\n" + "Ответ: " + findDit);

    }
}