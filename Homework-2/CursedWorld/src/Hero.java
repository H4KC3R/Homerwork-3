public class Hero {
    private String heroName;
    private boolean sex;
    private String race;
    private int heroLevel;

    Hero(String heroName,boolean sex,String race)
    {
        this.heroLevel = 0;
        this.heroName = heroName;
        this.sex = sex;
        if ((race.equals("Human") == false ) || (race.equals("Elves") == false ) || (race.equals("Undead") == false ) || (race.equals("Ork") == false ))
            throw new IllegalArgumentException("This race doesn't exist at Cursed World,please choose one of 4 :" + "\n"+
                    "1.Human" + "\n" +
                    "2.Ork" + "\n" + "3.Undead"+"\n" + "4.Elves");
    }
    public int getHerolevel()
    {
        return this.heroLevel;
    }
    public String getHeroName()
    {
        return this.heroName;
    }
    public void getSex()
    {
        if(this.sex ==  false)
        {
            System.out.println("Female");
        }
        else
        {
            System.out.println("Male");
        }
    }
    public String getHerorace()
    {
        return this.race;
    }
}
