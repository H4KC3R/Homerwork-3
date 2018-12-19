import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

final public class RandomUtils {
    public static  String[] makeStringArray(String path)
    {
             Random randomNum = new Random(System.currentTimeMillis());
             String[] randomStringArray;
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
        return words;
    }
    public static  int[] makeIntArray() {
        Random randomNum = new Random(System.currentTimeMillis());
        int[] a = new int[randomNum.nextInt(100)];
        for (int i = 0; i < a.length; i++)
            a[i] = randomNum.nextInt(100);
        return a;
    }
}

