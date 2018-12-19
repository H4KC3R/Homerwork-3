import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.String;

public class RandomMap {
    protected Random randomNum = new Random(System.currentTimeMillis());
    protected String[] randomStringArray;
    public RandomMap(String path)
    {
        int i;
        randomStringArray = new String[randomNum.nextInt(100)];
        String[] words;
        String line;
        List<String> fileLine = new ArrayList<>();
        File file = new File(path);
        try(
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr))
        {
            while ((line = br.readLine()) != null)
            {
                fileLine.add(line);
            }
            String str = fileLine.toString();
            words = str.split(" ");
            for(i = 0;i < randomStringArray.length;i++)
            {
                int tmp = randomNum.nextInt(words.length);
                randomStringArray[i] = words[tmp];
            }

        }
        catch (IOException e)
        {
            System.err.println("Exception while reading file:" + path);
            throw new RuntimeException(e);
        }

    }
    public int[] randomIntArray() {
        int[] a = new int[randomNum.nextInt(100)];
        for (int i = 0; i < a.length; i++)
            a[i] = randomNum.nextInt(100);
        return a;
    }
    public Map makeMap(int[] numbers)
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

