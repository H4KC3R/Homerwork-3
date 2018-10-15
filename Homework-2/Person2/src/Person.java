public class Person {
    protected int age;
    protected String name;
    Person(int age,String name)
    {
        if(age < 0 ) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
}
