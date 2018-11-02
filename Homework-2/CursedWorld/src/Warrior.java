public class Warrior extends Hero {
    protected int agility;
    protected int intelligent;
    protected int strength;
    protected int physicalDamage;
    protected int magicalDamage;
    protected int physicalResist;
    protected int magicalResist;
    protected String weapon;
    Warrior(String heroName,boolean sex,String race)
    {
        super(heroName,sex,race);
        this.agility = 20;
        this.intelligent = 10;
        this.strength = 80;
        this.physicalDamage = 100;
        this.magicalDamage = 0;
        this.physicalResist = 50;
        this.magicalResist = 10;
    }
    public void getCharacteristics ()
    {
        System.out.println(this.agility);
        System.out.println(this.strength);
        System.out.println(this.intelligent);
        System.out.println(this.magicalDamage);
        System.out.println(this.magicalResist);
        System.out.println(this.physicalResist);
        System.out.println(this.physicalDamage);

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
