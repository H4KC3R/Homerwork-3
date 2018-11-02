public class Archer extends Hero{
    protected int agility;
    protected int intelligent;
    protected int strength;
    protected int physicalDamage;
    protected int magicalDamage;
    protected int physicalResist;
    protected int magicalResist;
    protected String weapon;
    Archer(String heroName,boolean sex,String race)
    {
        super(heroName,sex,race);
        this.agility = 60;
        this.intelligent = 10;
        this.strength = 50;
        this.physicalDamage = 80;
        this.magicalDamage = 20;
        this.physicalResist = 30;
        this.magicalResist = 30;
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
