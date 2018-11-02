import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FileUtils {

    public static boolean dirExists(String path)
    {
        File dir = new File(path);
        if (dir.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean fileExists(String path)
    {
        File file = new File(path);
        if (file.isFile()) {
            return true;
        } else {
            return false;
        }
    }
 /*   public static List<String> dirReadAll(String path)
    {
        ArrayList<String> fileNames = new ArrayList<String>();
        try
        {
            File dir = new File(path);
            fileNames = Arrays.asList(dir.list());

        }
       catch (IOException ex)
       {
           System.out.println(ex.getMessage());
       }
       return fileNames;
    }
*/
    public static List<String> fileReadAll(String path)  {
        ArrayList<String> text = new ArrayList<String>();
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line;
            while ((line = reader.readLine()) != null)
            {
                text.add(line);
            }
            reader.close();

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return text;
    }
}
