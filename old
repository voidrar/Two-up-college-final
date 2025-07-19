import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        //gambling
        // ATT 1:   boolean heads;
        // ATT 1:    boolean heads2;
        // ATT 1:    boolean tails;
        // ATT 1:    boolean tails2;
        /* ATT 2 */
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

            if (coin == false && coin2 == true || coin == true && coin2 == false) {
                System.out.println("Respin");
                Thread.sleep(3000);
                coin = rand.nextBoolean();
                if (!coin) {
                    // System.out.println("not half");
                    System.out.println("Coin 1 : Tails");
                } else if (coin) {
                    // System.out.println("half");
                    System.out.println("Coin 1 : Heads");
                }
                //coin 2
                coin2 = rand.nextBoolean();
                if (!coin2) {
                    // System.out.println("not half");
                    System.out.println("Coin 2 : Tails");
                } else if (coin2) {
                    // System.out.println("half");
                    System.out.println("Coin 2 : Heads");
                }
                if (coin == false && coin2 == false) {
                    //  System.out.println("Both coins are tails :/");
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
                    Thread.sleep(5000);
                    l = 0;
                    w++;
                }
            } else {

                System.out.println(w + " Wins So Far | " + l + " Loses In a Row So Far.. ");
                System.out.println(" Welcome To Todays Two-up Game \n the fairest game in the land");
                System.out.println("------------------------------");
                System.out.println("If you would like to bet some pounds Please do so now");
                int Pounds = scnr.nextInt();
                //coin 1
                coin = rand.nextBoolean();
                if (!coin) {
                    // System.out.println("not half");
                    System.out.println("Coin 1 : Tails");
                } else if (coin) {
                    // System.out.println("half");
                    System.out.println("Coin 1 : Heads");
                }
                //coin 2
                coin2 = rand.nextBoolean();
                if (!coin2) {
                    // System.out.println("not half");
                    System.out.println("Coin 2 : Tails");
                } else if (coin2) {
                    // System.out.println("half");
                    System.out.println("Coin 2 : Heads");
                }


                // win loss conditions
                if (coin == false && coin2 == false) {
                    //  System.out.println("Both coins are tails :/");
                    System.out.println("----");
                    System.out.println("pay up.");
                    l++;
                    System.out.println(l);
                    System.out.println("The spinner will start the next match in 5 seconds!");
                    Thread.sleep(5000);

                } /*else if (coin == true && coin2 == false) {
                    System.out.println("----");
                    //   System.out.println("coin 2 is Tails ");
                    System.out.println("pay up.");
                    l++;
                    System.out.println(l);
                    System.out.println("The spinner will start the next match in 5 seconds!");
                    Thread.sleep(5000);
                } else if (coin == false && coin2 == true) {
                    System.out.println("----");
                    //  System.out.println("coin 1 is Tails ");
                    // System.out.println("pay up.");
                    // l++;
                    //  System.out.println(l);
                    System.out.println("The spinner will start the next match in 5 seconds!");
                    Thread.sleep(5000);
                    System.out.println("----");

                }

*/
                //win
                else if (coin == true && coin2 == true) {
                    System.out.println("        WINNER!:");
                    System.out.print(" after collecting your earnings u have AU$:");
                    System.out.println(pounds * 3);

                    System.out.println("The spinner will start the next match in 5 seconds!");
                    Thread.sleep(5000);
                    l = 0;
                    w++;
                }
                System.out.println("\n \n ");
            }
        }
    }
}
