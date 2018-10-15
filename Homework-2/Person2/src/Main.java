public class Main {
    public static void main(String[] args) {
        Person Alex = new Person(34, "Alex");
        Student Radmir = new Student(19,"Radmir",99);
        Employee Alexander = new Employee(27,"Alexander",0);
        System.out.println(Alex.getAge());
        System.out.println(Alex.getName());
        System.out.println(Radmir.getHatelevel());
        System.out.println(Radmir.getName());
        System.out.println(Radmir.getAge());
        System.out.println(Alexander.getSalary());
        System.out.println(Alexander.getName());
        System.out.println(Alexander.getAge());
    }
}