import java.util.Scanner;
public class Player {
    protected int attempt;

    Player() {
        this.attempt = 1;
    }

    protected int getAttempt() {
        return this.attempt;
    }

    protected int writeNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    protected void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    protected void increaseAttempt()
    {
        this.attempt ++;
    }
    protected void gameRestart()
    {
        this.attempt = 1;
    }
    protected void gameOver()
    {
        this.attempt = 4;
    }

}
