import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        // ////// Values /////////
        boolean coin = false;
        boolean coin2 = false;
        int winner = 0;
        int loser = 0;
        int pounds = 0;
        // ////////////////////
        boolean rematch = true; //Causes Respins & Rematches
















        while (rematch) {
            System.out.println(winner + " Wins So Far | " + loser + " Losses So Far.. ");
            System.out.println(" Welcome To Todays Two-up Game \n the fairest game in the land");
            System.out.println("--------- Earnings -- " + pounds + "---------------------");
            System.out.println("If you would like to bet some pounds Please do so now");
            pounds = scnr.nextInt();
            coin = rand.nextBoolean();
            coin2 = rand.nextBoolean();

// /////////////////////////////////////////////////////
        if (!coin)
            System.out.println("Coin 1 is Tails");
        else
            System.out.println("Coin 1 is Heads");

        if (!coin2)
            System.out.println("Coin 2 is Tails");
        else
            System.out.println("Coin 2 is Heads");

        // /////////////// - Win & Loss No Rematch
            if (coin && coin2){System.out.println("Win, " + pounds * 3 + " Pounds is your Earnings");winner++;}
            else if (!coin && !coin2) {System.out.println("Loss, "+ pounds + " Pounds is your Losses"); loser++; pounds = 0;}

            // /////////////////////////////////////////////////////

        // /////////////// - Rematch Due To 50/50 coins
        while(coin && !coin2  || !coin && coin2) {


            System.out.println("respin");
            Thread.sleep(2000);
            System.out.println("\n");
            coin = rand.nextBoolean();
            coin2 = rand.nextBoolean();

            // /////////////////////////////////////////////////////
            if (!coin)
                System.out.println("Coin 1 is Tails");
            else
                System.out.println("Coin 1 is Heads");

            if (!coin2)
                System.out.println("Coin 2 is Tails");
            else
                System.out.println("Coin 2 is Heads");

            // /////////////////////////////////////////////////////

            // /////////////// - Win & Loss With Rematch
            if (coin && coin2){System.out.println("Win, " + pounds * 3 + " Pounds is your Earnings");winner++;}
            else if (!coin && !coin2) {System.out.println("Loss, "+ pounds + " Pounds is your Losses"); loser++; pounds = 0;}


           }

            System.out.println();
            System.out.print("Do you want to play another round? (y/n): ");
            String answer = scnr.next().toLowerCase();

            if (!answer.equals("y")) {

                System.out.println("Thanks for playing! Final score: " + winner + " Wins | " + loser + " Losses.");
             System.out.println("Closing in 5 Seconds");
                Thread.sleep(5000);
                System.exit(0);
            }
        }
    }
}
//https://github.com/voidrar/Two-up-college-final/blob/main/Two-up.java
//first version
/*import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);

        boolean coin = false;
        boolean coin2 = false;


        // win loss & Money
        int winner = 0;
        int loser = 0;
        int pounds = 0;
        // Easier calls
        int w = winner;
        int l = loser;
        boolean rematch = true;
        while (rematch) {


            System.out.println("\n\n\n");
                System.out.println(w + " Wins So Far | " + l + " Loses In a Row So Far.. ");
                System.out.println(" Welcome To Todays Two-up Game \n the fairest game in the land");
                System.out.println("------------------------------");
                System.out.println("If you would like to bet some pounds Please do so now");
            pounds = scnr.nextInt();

            //coins///////////////////////////////////////
                coin = rand.nextBoolean();
                if (!coin) {
                    System.out.println("Coin 1 : Tails");
                } else if (coin) {
                    System.out.println("Coin 1 : Heads");
                }
                coin2 = rand.nextBoolean();
                if (!coin2) {
                    System.out.println("Coin 2 : Tails");
                } else if (coin2) {
                    System.out.println("Coin 2 : Heads");
                }
// ////////////////////////////////////////////

                // win loss conditions
                if (coin == false && coin2 == false) {
                    System.out.println("----");
                    System.out.println("pay up.");
                    l++;
                    System.out.println(l);
                    System.out.println("The spinner will start the next match in 5 seconds!");
                    Thread.sleep(5000);
                }
// ////////////////////////////////////////////


            //win
                else if (coin == true && coin2 == true) {
                    System.out.println("        WINNER!:");
                    System.out.print(" after collecting your earnings u have AU$:");
                    System.out.println(pounds * 3);
                    System.out.println("The spinner will start the next match in 5 seconds!");
                    l = 0;
                    w++;
                    Thread.sleep(5000);
                }
// ////////////////////////////////////////////

            if (coin == false && coin2 == true || coin == true && coin2 == false) {
                System.out.println("Respin");
                Thread.sleep(3000);
                coin = rand.nextBoolean();
                if (!coin) {
                    System.out.println("Coin 1 : Tails");
                } else if (coin) {
                    System.out.println("Coin 1 : Heads");
                }
                coin2 = rand.nextBoolean();
                if (!coin2) {
                    System.out.println("Coin 2 : Tails");
                } else if (coin2) {
                    System.out.println("Coin 2 : Heads");
                }
                if (coin == false && coin2 == false) {
                    System.out.println("----");
                    System.out.println("pay up.");
                    l++;
                    System.out.println(l);
                    System.out.println("The spinner will start the next match in 5 seconds!");
                    Thread.sleep(5000);
                }
                else if (coin == true && coin2 == true) {
                    System.out.println("        WINNER!:");
                    System.out.print(" after collecting your earnings u have AU$:");
                    System.out.println(pounds * 3);
                    System.out.println("The spinner will start the next match in 5 seconds!");
                    l = 0;
                    w++;
                    Thread.sleep(5000);
                }

            }

        }
    }
}
*/
