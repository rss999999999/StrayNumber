import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void simpleArray1() {
        assertEquals(8, getActualFor(1, 1, 1,1,1,1,8,1,1));
    }

    private int getActualFor(int... numbers) {
        return Solution.stray(numbers);
    }
}