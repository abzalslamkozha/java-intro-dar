import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();

        double max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Наибольшее число: " + max);

        scanner.close();
    }
}
