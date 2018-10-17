public class Game {
    public static void main(String[] args)
     {
        Player player = new Player();
        Dealer dealer = new Dealer();
        for(int  i = 0 ; (i <= player.getAttempt()) || player.getAttempt() != 3;i++)
        {
                int num = player.writeNumber();
                if(num > dealer.getRandomNumber())
                {
                    System.out.println("Your number is greater than a picked number,try again");
                    if (player.getAttempt() == 2)
                    {
                        System.out.println("Game is over,do you want to try again?" + "\n" +"1.Yes" + "\n" + "2.No");
                            if(player.writeNumber() == 1) { player.setAttempt(1); }
                            if(player.writeNumber() == 2) { player.setAttempt(3) ;}
                            else { System.out.println("Wrong variant,game will off automatically"); player.setAttempt(3);}
                    }
                    else
                        {
                            player.increaseAttempt();
                        }
                }
            if(num < dealer.getRandomNumber())
            {
                System.out.println("Your number is smaller than a picked number,try again");
                if (player.getAttempt() == 2)
                {
                    System.out.println("Game is over,do you want to try again?" + "\n" +"1.Yes" + "\n" + "2.No");
                    if(player.writeNumber() == 1) { player.setAttempt(1);}
                    if(player.writeNumber() == 2) { player.setAttempt(3) ;}
                    else { System.out.println("Wrong variant,game will off automatically"); player.setAttempt(3);}
                }
                else
                {
                    player.increaseAttempt();
                }
            }
            if(num == dealer.getRandomNumber())
            {
                System.out.println("Congratulation you won,your score:" + player.getAttempt() + "\n" + "do you want to try again"+ "\n" +"1.Yes" + "\n" + "2.No");
                if(player.writeNumber() == 1) { player.setAttempt(1); dealer.changeNumber();}
                if(player.writeNumber() == 2) { player.setAttempt(3);}
                else { System.out.println("Wrong variant,game will off automatically"); player.setAttempt(3);}

            }
        }
    }
}

