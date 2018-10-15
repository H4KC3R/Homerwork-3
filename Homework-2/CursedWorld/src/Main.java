public class Main {
    public static void main(String[] args) {
        Hero Lucius = new Hero("King Lucius", true,"Human");
        Warrior Garrosh = new Warrior("Garrosh Warchief",true,"Ork");
        Wizard Antonidas = new Wizard("Antonidas Blood mage",true,"Elves");
        Archer Sylvana = new Archer("Sylvana Windranger",false,"Undead");
        System.out.println(Lucius.getHerolevel());
        System.out.println(Lucius.getHeroName());
        Lucius.getSex();
        System.out.println(Garrosh.getHerorace());
        System.out.println(Garrosh.getHerolevel());
        System.out.println(Garrosh.getHeroName());
        Garrosh.getSex();
        System.out.println(Garrosh.getHerorace());
        Garrosh.takeWeapon(0,40,10,"Heavy axe");
        Garrosh.getCharacteristics();
        Garrosh.showWeapon();
}
}