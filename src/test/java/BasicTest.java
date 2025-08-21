import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicTest {
        @Test
        void greetingWorks() {
            assertEquals(Greeting.getGreeting("Alice"), "Hello, Alice");
        }
}
