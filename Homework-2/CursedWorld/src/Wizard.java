public class Wizard extends Hero {
    protected int agility;
    protected int intelligent;
    protected int strength;
    protected int physicalDamage;
    protected int magicalDamage;
    protected int physicalResist;
    protected int magicalResist;
    protected String weapon;
    Wizard(String heroName,boolean sex,String race)
    {
        super(heroName,sex,race);
        this.weapon = "nothing";
        this.agility = 20;
        this.intelligent = 80;
        this.strength = 10;
        this.physicalDamage = 20;
        this.magicalDamage = 80;
        this.physicalResist = 10;
        this.magicalResist = 50;
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
