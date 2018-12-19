import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
import java.util.List;
import java.lang.String;
import java.io.IOException;
import java.lang.AutoCloseable;

public class FileIterator implements Iterator<String>{
        protected int index = 0;
        protected  int length = 0;
        protected String[] lines;
        public FileIterator(String path)
        {
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
                String[] lineArray = fileLine.toArray(new String[fileLine.size()]);
                this.lines = lineArray;
                this.length = lineArray.length;
            }
            catch (IOException e)
            {
                System.err.println("Exception while reading file:" + path);
                throw new RuntimeException(e);
            }
        }
        @Override
        public boolean hasNext ()
        {
            return index < length && lines[index] != null;
        }
        @Override
        public String next ()
        {
            return lines[index++];
        }

}

