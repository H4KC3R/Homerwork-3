import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class FileUtils {

    public static boolean exists(String path) {
        return exists(new File(path));
    }

    public static boolean exists(File file) {
        return file.exists();
    }

    public static List<String> readAll(String path) {
        List<String> lines = new ArrayList<>();
        try (FileReader fr = new FileReader(path);
             BufferedReader text = new BufferedReader(fr)) {

            String line;
            while ((line = text.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Exception while reading file:" + path);
            throw new RuntimeException(e);
        }
        return lines;
    }

    public static void writeAll(String path, List<String> lines) {
        File file = new File(path);
        if (!file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException("Path should be file,not directory");
        } else {
            try (FileWriter fw = new FileWriter(file);
                 BufferedWriter text = new BufferedWriter(fw)) {
                for (String line : lines) {
                    text.write(line);
                }

            } catch (IOException e) {
                System.err.println("Exception while writting file:" + path);
            }
        }
    }
}