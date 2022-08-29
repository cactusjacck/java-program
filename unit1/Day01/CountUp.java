public class CountUp {
    public static int countWhile(int n) {
        int sum = 0;
        int current = 0;
        while(current <= n) {
            System.out.println(current);
            sum += current;
            current++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = countWhile(10);
        System.out.println("sum: " + sum);
    }
    
}
