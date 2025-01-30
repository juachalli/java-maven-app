import com.exemple.Application;
import org.junit.Test;
import static org.junit.Assert.*;

package test.java;

public class AppTest {

    @test
    public void testApp() {
        Application myApp = new Application();

        String result = myApp.getStatus();

        assertEquals("OK", result);

    }

}
