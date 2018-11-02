public class Main {
    public static void main(String[] args) {
        System.out.println(FileUtils.fileExists("/home/daminov/Рабочий стол/физтех"));
        System.out.println(FileUtils.dirExists("/home/daminov/Рабочий стол/физтех"));
        System.out.println(FileUtils.fileReadAll("/home/daminov/Рабочий стол/физтех"));

    }
}
