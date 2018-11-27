import java.lang.String;
public class Main {
    public static void main(String[] args) {
        FileIterator fileIterator = new FileIterator("/home/daminov/Рабочий стол/физтех");

        while (fileIterator.hasNext())
        {
            System.out.println(fileIterator.next());
        }
    }
}