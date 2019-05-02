package paperFolder.app;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals(Long.valueOf(42L), PaperFolder.fold(new Double(384000000)));
        assertEquals(Long.valueOf(0L), PaperFolder.fold(new Double(0.00005)));
    }
}