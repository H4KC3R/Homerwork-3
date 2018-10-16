public class Main {
    public static void main(String[] args) {
        Person Alex = new Person (34,"Alex","USA");
        Student Radmir = new Student(19,"Radmir","Kazakhstan",731,"MIPT");
        System.out.println(Alex.hashCode());
        System.out.println(Radmir.hashCode());
        if (Alex.equals(Radmir))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("Fasle");
        }
        if (Alex.equals(796684896))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("Fasle");
        }
        if (Alex.equals(Alex))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("Fasle");
        }
    }
}
