import java.util.ArrayList;
import java.util.List;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        List<String> ff= new ArrayList<String> ()
        {
            {
                add("8============\n");
                add("=================\n");
                add("=======================D\n");
            }
        };
        System.out.println(FileUtils.exists("/home/daminov/Рабочий стол/физтех"));
        System.out.println(FileUtils.exists("/home/daminov/Рабочий стол/физтех"));
        FileUtils.writeAll("/home/daminov/Рабочий стол/физтех",ff);
        System.out.println(FileUtils.readAll("/home/daminov/Рабочий стол/физтех"));

    }
}
