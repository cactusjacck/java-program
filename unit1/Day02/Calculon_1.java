import java.util.Scanner;

public class Calculon_1 {
    public static float add(float x, float y) {
        return x + y;
    }

    public static float subtract(float x, float y) {
        return x + y;
    }

    public static float multiply(float x, float y) {
        return x * y;
    }

    public static float divide(float x, float y) {
        return x / y;
    }

    /**
     * 1.2.2
     * @param x
     * @param y
     * @return
     */
    public static float raise(float x, int y) {
        float result = 1.0f;

        while(y > 0) {
            result = result * x;
            y-=1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operand 1: ");
        float x = scanner.nextFloat();
        System.out.print("Enter operand 2: ");
        float y = scanner.nextFloat();

        System.out.println(x + " + " + y + " = " + add(x, y));
        System.out.println(x + " - " + y + " = " + subtract(x, y));
        System.out.println(x + " * " + y + " = " + multiply(x, y));
        System.out.println(x + " / " + y + " = " + divide(x, y));
        System.out.println(x + " ^ " + y + " = " + raise(x, (int)y));

        scanner.close();
    }
}