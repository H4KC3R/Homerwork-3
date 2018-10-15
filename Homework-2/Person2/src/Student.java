public class Student extends Person {
     private int hatelevel;
    Student(int age , String name ,int hatelevel)
    {
        super(age,name);
        if(hatelevel > 100 || hatelevel < 0) throw new IllegalArgumentException("Hatelevel from 0 to 100");
        this.hatelevel=hatelevel;


    }
    public int getHatelevel()
    {
        return this.hatelevel;
    }

}
