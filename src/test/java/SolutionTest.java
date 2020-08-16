import com.algorithms.logicTask.BoysGirls;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    final BoysGirls solution = new BoysGirls();

    @Test
    public void testCount() {
        int count = solution.count(0, 0);
        assertEquals(0, count);

        count = solution.count(-1, -5);
        assertEquals(0, count);

        count = solution.count(-1, 5);
        assertEquals(5, count);

        count = solution.count(2, -5);
        assertEquals(2, count);

        count = solution.count(1, 5);
        assertEquals(3, count);

        count = solution.count(7, 8);
        assertEquals(0, count);

        count = solution.count(1, 15);
        assertEquals(13, count);

        count = solution.count(1, 13);
        assertEquals(11, count);
    }

}