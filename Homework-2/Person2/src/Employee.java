public class Employee extends Person {
    private int salary ;
    Employee(int age,String name,int salary)
    {
        super(age,name);
        this.salary=salary;
    }
    public int getSalary()
    {
        return this.salary;
    }
}
