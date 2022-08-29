import org.junit.Test;

public class Log {
    /**
     * @param n
     * @param m
     * @return
     */
    static int Countnum(int n,int m){
    
    int sum=0;

    while (n != 0) {
        //System.out.println(n);
        n = n/ m;

        sum=sum+1;
        //System.out.println(sum);

    }
    System.out.println(sum-1);



    return sum;
}
    public static void main(String[] args) {
        
        int a= Countnum(10,2);
        

       
    }
    
}


