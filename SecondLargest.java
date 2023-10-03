import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 2};
        Arrays.sort(numbers);

        if (numbers.length >= 2) {
            int secondLargest = numbers[numbers.length - 2];
            System.out.println("Второе по величине число: " + secondLargest);
        } else {
            System.out.println("Недостаточно элементов в массиве.");
        }
    }
}
