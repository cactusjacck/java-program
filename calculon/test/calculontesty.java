import static org.junit.jupiter.api.Assertions.assertEquals;

    import org.junit.Test;
    import org.junit.platform.commons.annotation.Testable;
    
    @Testable
    public class CalculonTest {
        @Test
        public void testAdd(){
            float x = 5.2f;
            float y = 2.7f;
            float expectd = x + y;
    
            float actual = Calculon.add(x, y);
    
            assertEquals(expectd, actual);
        }
    }
    

