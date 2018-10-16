public class Student extends Person
{
    public int group;
    public String university;
   Student(int age , String name ,String country,int group,String university)
    {
        super(age,name,country);
        this.group = group;
        this.university = university;
    }
}
