import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double product = num1 * num2;
        double difference = num1 - num2;

        if (num2 != 0) {
            double division = num1 / num2;
            double remainder = num1 % num2;
            System.out.println("Сумма: " + sum);
            System.out.println("Произведение: " + product);
            System.out.println("Разность: " + difference);
            System.out.println("Деление: " + division);
            System.out.println("Остаток: " + remainder);
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        scanner.close();
    }
}
