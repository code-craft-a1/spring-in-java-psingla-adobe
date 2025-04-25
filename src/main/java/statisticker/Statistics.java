package statisticker;

import java.util.List;

class Stats {
    public float average;
    public float min;
    public float max;

    // Constructor
    public Stats(float average, float min, float max) {
        this.average = average;
        this.min = min;
        this.max = max;
    }
}

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        if (numbers.size() == 0) {
            return new Stats(Float.NaN, Float.NaN, Float.NaN);
        } else {
            float sum = 0;
            float min = Float.MAX_VALUE;
            float max = Float.MIN_VALUE;
            for (float number : numbers) {
                sum += number;
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
        
            float average = sum / numbers.size();
            return new Stats(average, min, max);
        }
    }   
}
