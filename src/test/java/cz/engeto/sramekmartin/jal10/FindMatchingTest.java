package cz.engeto.sramekmartin.jal10;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FindMatchingTest {

    @Test
    void middle1Test() {
        List<Double> testList = List.of(12.0, 8.126, 6.0);
        Double result = Find.findMatching(testList, 11.0, 12.6);
        assertEquals(12.0, result);
    }

    @Test
    void middle2Test() {
        List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        Double result = Find.findMatching(testList, 8.0, 10.0);
        assertEquals(8.126, result);
    }

    @Test
    void noMatching() {
        List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        assertNull(Find.findMatching(testList, 1.0, 2.0));

    }

    @Test
    void emptyList() {
        List<Double> testList = new ArrayList<>();
        assertThrowsExactly(IllegalArgumentException.class, () -> Find.findMatching(testList, 1.0, 2.0));
    }

}
