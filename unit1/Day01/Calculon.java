public class Calculon {
    public static float add(float x, float y) {
        return x + y;
    }

    public static float subtract(float x, float y) {
        return x - y;
    }

    public static float multiply(float x, float y) {
        return x * y;
    }

    public static float divide(float x, float y) {
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println(add(5f, 4f));
        System.out.println(subtract(5, 4));
        System.out.println(multiply(5, 4));
        System.out.println(divide(5, 4));
    }
}