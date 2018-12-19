import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = RandomUtils.makeStringArray("/home/daminov/Рабочий стол/Daminov Radmir/Example.txt");
        int[] numbers = RandomUtils.makeIntArray();
        Map randomMap = RandomMap.makeMap(numbers,words);
        randomMap.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}