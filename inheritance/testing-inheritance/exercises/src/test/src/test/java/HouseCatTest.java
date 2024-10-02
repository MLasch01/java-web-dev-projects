import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class HouseCatTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
