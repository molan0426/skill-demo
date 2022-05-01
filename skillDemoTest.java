import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class skillDemoTest {
    
    @Test
    public void testIsPositive(){
        assertTrue(skillDemo.isPositive(5));
    }
}
