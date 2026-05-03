import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderTest {

    @Test
    public void testThatRiderWith25DeliveriesEarns9000() {
        assertEquals(9000, BackToSender.calculateWage(25));
    }

    @Test
    public void testThatRiderWith55DeliveriesEarnsCorrectly() {
        assertEquals(16000, BackToSender.calculateWage(55));
    }

    @Test
    public void testThatRiderWith65DeliveriesEarnsCorrectly() {
        assertEquals(21250, BackToSender.calculateWage(65));
    }

    @Test
    public void testThatRiderWith80DeliveriesEarns45000() {
        assertEquals(45000, BackToSender.calculateWage(80));
    }
}
