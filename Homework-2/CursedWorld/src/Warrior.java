public class Warrior extends Hero {
    protected int agility;
    protected int intelligent;
    protected int strength;
    protected int physicaldamage;
    protected int magicaldamage;
    protected int physicalresist;
    protected int magicalresist;
    protected String weapon;
    Warrior(String heroName,boolean sex,String race)
    {
        super(heroName,sex,race);
        this.agility = 20;
        this.intelligent = 10;
        this.strength = 80;
        this.physicaldamage = 100;
        this.magicaldamage = 0;
        this.physicalresist = 50;
        this.magicalresist = 10;
    }
    public void getCharacteristics ()
    {
        System.out.println(this.agility);
        System.out.println(this.strength);
        System.out.println(this.intelligent);
        System.out.println(this.magicaldamage);
        System.out.println(this.magicalresist);
        System.out.println(this.physicalresist);
        System.out.println(this.physicaldamage);

    }
    public void takeWeapon(int magic,int weight,int agile,String weaponName)
    {
        if (magic > this.intelligent) throw new IllegalArgumentException ("Your intelligent is small");
        if (weight > this.strength) throw new IllegalArgumentException("Weapom is heavy");
        if (agile > this.agility) throw new IllegalArgumentException("Your agility is small");
        this.weapon = weaponName;
    }
    public void showWeapon()
    {
        System.out.println(this.weapon);
    }
}
