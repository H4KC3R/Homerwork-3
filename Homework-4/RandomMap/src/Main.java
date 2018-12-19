import java.util.Map;

public class Main {
    public static void main(String[] args) {
    RandomMap randomMap = new RandomMap("/home/daminov/Рабочий стол/Daminov Radmir/Example.txt");
    int[] numbers = randomMap.randomIntArray();
    Map map = randomMap.makeMap(numbers);
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}