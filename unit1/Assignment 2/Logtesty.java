import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import static org.junit.jupiter.api.Assertions.assertEquals;


@Testable
public class Logtesty{
    @Test
    public void testCountnum(){
        Logtesty lg = new Logtesty();

        int n = 10;
        int m = 2;
        int sum=0;

    while (n != 0) {
        //System.out.println(n);
        n = n/ m;

        sum=sum+1;
        //System.out.println(sum);

    }
    int expectd= sum;
    int actual=Log.Countnum(10,2);
    assertEquals(expectd, actual);
        
    }
}
