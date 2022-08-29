import java.util.Scanner;
public class lognew {
    static Scanner sc = new Scanner(System.in);

     static int Countnum(int n,int m) {



         int sum=0;
         if(m<1){
             return -1;
         }
        
         else{


             while ( n != 0) {
                 //System.out.println(n);
                 n = n / m;

                 sum = sum + 1;
                 //System.out.println(sum);
             }

         }
         System.out.println(sum-1);



         return sum;
     }
    public static void main(String[] args) {


        System.out.println("enter the valur of c");

        int c = sc.nextInt();

        System.out.println("enter the value of b");
        int b = sc.nextInt();

            int a= Countnum(c,b);


}}
