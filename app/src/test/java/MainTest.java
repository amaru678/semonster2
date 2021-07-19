package sequality;
import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
class MainTest {    
    @Test    
    public void main() {
        App mainTest = new App();
        assertEquals("加藤純一最強！！！！", mainTest.getGreeting());
        }
}