public class SwapVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("До обмена: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("После обмена: a = " + a + ", b = " + b);
    }
}
