import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        //  Values /
        boolean coin = false;
        boolean coin2 = false;
        int winner = 0;
        int loser = 0;
        double pounds = 0;


        boolean rematch = true; //Causes Respins & Rematches
        while (rematch) {
            System.out.println(winner + " Wins So Far | " + loser + " Losses So Far.. ");
            System.out.println(" Welcome To Todays Two-up Game \n the fairest game in the land");
            System.out.println("--------- Earnings -- " + pounds + "---------------------");
            System.out.println("If you would like to bet some pounds Please do so now");
            while (!scnr.hasNextDouble()) {
                System.out.println("We only Bet Pounds Here..");
                scnr.next();
            }
            pounds = scnr.nextDouble();
            if (pounds > 1000000) {
                System.out.println("We dont have that much on hand, Would u lower your bet a bit?");
                pounds = 0;
                continue;
            } else if (pounds < 0) {
                System.out.println("haha , you have to pay US to play..");
                pounds = 0;
                continue;
            }
            coin = rand.nextBoolean();
            coin2 = rand.nextBoolean();


            if (!coin)
                System.out.println("Coin 1 is Tails");
            else
                System.out.println("Coin 1 is Heads");

            if (!coin2)
                System.out.println("Coin 2 is Tails");
            else
                System.out.println("Coin 2 is Heads");

            // - Win & Loss No Rematch
            if (coin && coin2) {
                System.out.println("Win, " + pounds * 3 + " Pounds is your Earnings");
                winner++;
            } else if (!coin && !coin2) {
                System.out.println("Loss, " + pounds + " Pounds is your Losses");
                loser++;
                pounds = 0;
            }


            // - Rematch Due To 50/50 coins
            while ((coin && !coin2) || (!coin && coin2)) {


                System.out.println("respin");
                Thread.sleep(2000);
                System.out.println("\n");
                coin = rand.nextBoolean();
                coin2 = rand.nextBoolean();


                if (!coin)
                    System.out.println("Coin 1 is Tails");
                else
                    System.out.println("Coin 1 is Heads");

                if (!coin2)
                    System.out.println("Coin 2 is Tails");
                else
                    System.out.println("Coin 2 is Heads");


                // - Win & Loss With Rematch
                if (coin && coin2) {
                    System.out.println("Win, " + pounds * 3 + " Pounds is your Earnings");
                    winner++;
                } else if (!coin && !coin2) {
                    System.out.println("Loss, " + pounds + " Pounds is your Losses");
                    loser++;
                    pounds = 0;
                }


            }

            String answer = "";
            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.print("Play another round? (y/n): ");
                answer = scnr.next().toLowerCase();
            }

            if (answer.equals("n")) {
                System.out.println("Thanks for playing! Final score: " + winner + " Wins | " + loser + " Losses.");
                Thread.sleep(5000);
                System.exit(0);
            }

        }
    }
}
