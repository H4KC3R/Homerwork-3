public class Main {
    public static void main(String[] args) {
        Person Person = new Person (34,"Alex");
        Student Radmir = new Student(19,"Radmir",731,"MIPT");
        System.out.println(Person.hashCode());
        System.out.println(Radmir.hashCode());
        if (Person.equals(Radmir))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("Fasle");
        }
    }
}