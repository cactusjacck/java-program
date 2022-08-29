import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Testable
public class IterativeFibtesty {
    @Test
    public void testfibnnumer(){
        IterqtiveFib itfib= new IterqtiveFib();

        assertEquals(34,IterqtiveFib.fibnnumer(0,1,10 ));

       

    }
}

