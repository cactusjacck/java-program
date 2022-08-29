import java.util.Scanner;
public class IterqtiveFib {
    static int fibnnumer(int a, int b, int c) {


        int sum = 0;


        for (int i = 2; i < c; i++) {
            sum = a + b;

            a = b;

            b = sum;
        }


        return sum;
    }

    public static void main(String[] args) {


        int a = 0, b = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the nth element");
        int d = scan.nextInt();
        


            System.out.println(fibnnumer(a, b, d));

    }
    
}
