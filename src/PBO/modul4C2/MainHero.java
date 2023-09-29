package PBO.modul4C2;

public class MainHero {
    public static void main(String[] args){
        //level langsung diinputkan
        Assassin player1 = new Assassin(8);
        Mage player2 = new Mage(5);

        boolean stop = false;
        int round = 1;

        System.out.println("Status Player 1");
        player1.CheckStatus();

        System.out.println();

        System.out.println("Status Player 2");
        player2.CheckStatus();

        System.out.println();

        System.out.println("\t\t START--");
        do{
            System.out.println("--Ronde "+ round +" --");

            System.out.println("==========Player 1 Attack Player 2==========");

            player1.SpawnIntro();
            player1.Attack(player2);

            System.out.println("HP Player 2 : " + player2.HealthPoint);

            if(!player2.LifeStatus){
                System.out.println();
                System.out.println("======================================================");
                System.out.println("Player 2 is DEAD");
                System.out.println("Player 1 HP remaining : " + player1.HealthPoint);
                System.out.println("Player 1 WIN");
                stop = true;
                break;
            }

            System.out.println("==========Player 2 Attack Player 1==========");

            player2.SpawnIntro();
            player2.Attack(player1);

            System.out.println("HP Player 1 : " + player1.HealthPoint + "\n");

            if(!player1.LifeStatus){
                System.out.println();
                System.out.println("======================================================");
                System.out.println("Player 1 is DEAD");
                System.out.println("Player 2 HP remaining : " + player2.HealthPoint);
                System.out.println("Player 2 WIN");
                stop = true;
                break;
            }

            round++;
        }while(!stop);
    }

}