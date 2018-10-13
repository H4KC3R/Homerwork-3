public class Student extends Person
{
    public int group;
    public String university;
   Student(int age , String name ,int group,String university)
    {
        super(age,name);
        this.group = group;
        this.university = university;
    }
}
