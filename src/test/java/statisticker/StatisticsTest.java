package statisticker;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class StatisticsTest 
{
    @Test
    public void reportsAverageMinMaxx()
    {
        Float[] numbers = {1.5f, 8.9f, 3.2f, 4.5f};
        List<Float> numberList = Arrays.asList(numbers);

        Stats s = Statistics.getStatistics(numberList);

        float epsilon = 0.001f;
        assertEquals(s.average, 4.525f, epsilon);
        assertEquals(s.min, 1.5f, epsilon);
        assertEquals(s.max, 8.9f, epsilon);
    }
    @Test
    public void reportsNaNForEmptyInput()
    {
        List<Float> emptyList = new ArrayList<>();

        Stats s = Statistics.getStatistics(emptyList);
        assertTrue(Float.isNaN(s.average) && Float.isNaN(s.min) && Float.isNaN(s.max));
        // All fields of computedStats (average, max, min) must be
        // Float.NaN (not-a-number), as described in
        // https://www.geeksforgeeks.org/nan-not-number-java/
        // Specify the asserts here and implement accordingly.
    }
}
