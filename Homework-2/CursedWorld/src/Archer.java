public class Archer extends Hero{
    private int agility;
    private int intelligent;
    private int strength;
    private int physicaldamage;
    private int magicaldamage;
    private int physicalresist;
    private int magicalresist;
    private String weapon;
    Archer(String heroName,boolean sex,String race)
    {
        super(heroName,sex,race);
        this.agility = 60;
        this.intelligent = 10;
        this.strength = 50;
        this.physicaldamage = 80;
        this.magicaldamage = 20;
        this.physicalresist = 30;
        this.magicalresist = 30;
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
