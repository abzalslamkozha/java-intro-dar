import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double num = scanner.nextDouble();

        if (num > 0) {
            System.out.println("Число положительное.");
        } else if (num < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число равно нулю.");
        }

        scanner.close();
    }
}
