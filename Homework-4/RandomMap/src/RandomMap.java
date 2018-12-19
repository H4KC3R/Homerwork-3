import java.util.*;
import java.lang.String;

public class RandomMap {
    public static Map makeMap(int[] numbers,String[] randomStringArray)
    {

        if(numbers.length > randomStringArray.length)
        {
            int i = 0;
            Map<Integer,String> randomMap = new HashMap<>();
            while ( i < randomStringArray.length)
            {
                randomMap.put(numbers[i],randomStringArray[i]);
                i++;
            }
            while (i < numbers.length)
            {
                randomMap.put(numbers[i],null);
                i++;
            }
            return randomMap;
        }
        if(numbers.length < randomStringArray.length)
        {
            int i = 0;
            Map<String,Integer> randomMap = new HashMap<>();
            while ( i < numbers.length)
            {
                randomMap.put(randomStringArray[i],numbers[i]);
                i++;
            }
            while (i < randomStringArray.length)
            {
                randomMap.put(randomStringArray[i],null);
                i++;
            }
            return randomMap;
        }
        else
        {
            int i = 0;
            Map<String,Integer> randomMap = new HashMap<>();
            while ( i < numbers.length)
            {
                randomMap.put(randomStringArray[i],numbers[i]);
                i++;
            }
            return randomMap;
        }
    }
}

