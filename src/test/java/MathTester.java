import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTester {
    @Test
    public void testSum(){
        int expectedSum = 3;
        var mathClass = new MathClass();
        int actual = mathClass.Sum(1,1);
        assertEquals(expectedSum,actual);
    }
}
