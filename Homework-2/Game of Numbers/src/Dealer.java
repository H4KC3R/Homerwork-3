import java.util.Random;
public class Dealer {
    protected int number;
    Dealer()
    {
        Random random = new Random();
        this.number = random.nextInt(10);
    }
    protected int getRandomNumber()
    {
        return this.number;
    }
    protected void changeNumber()
    {
        Random random = new Random();
        this.number = random.nextInt(10);
    }


}
