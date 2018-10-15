public class Wizard extends Hero {
    private int agility;
    private int intelligent;
    private int strength;
    private int physicaldamage;
    private int magicaldamage;
    private int physicalresist;
    private int magicalresist;
    private String weapon;
    Wizard(String heroName,boolean sex,String race)
    {
        super(heroName,sex,race);
        this.weapon = "nothing";
        this.agility = 20;
        this.intelligent = 80;
        this.strength = 10;
        this.physicaldamage = 20;
        this.magicaldamage = 80;
        this.physicalresist = 10;
        this.magicalresist = 50;
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
