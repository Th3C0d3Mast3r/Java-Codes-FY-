//we could have even had solved this making array of objects
import java.util.*;

class Cricketers1 {
    static String playerName[] = new String[11];
    static int runHit[] = new int[11];
    static int inningsCount[] = new int[11];
    static int notOutCount[] = new int[11];
    static double battingAvg[] = new double[11]; //this is what I calculate-the rest need to be input by the user
    static Scanner obj = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter the STATS of 11 Players below:-");

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter PLAYER#" + (i + 1) + "'s Name:- ");
            playerName[i] = obj.nextLine();

            try {
                System.out.print("\nEnter the TOTAL RUNS HIT:- ");
                runHit[i] = obj.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You are Supposed to Enter NUMERIC VALUES ");
                obj.nextLine(); // Consume invalid input
                i--; // Repeat for the same player
                continue;
            }

            try {
                System.out.print("\nEnter the NUMBER OF INNINGS PLAYED:- ");
                inningsCount[i] = obj.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You are Supposed to Enter NUMERIC VALUES ");
                obj.nextLine(); // Consume invalid input
                i--; // Repeat for the same player
                continue;
            }

            try {
                System.out.print("\nEnter the Number of Times Player has been NOT OUT:- ");
                notOutCount[i] = obj.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You are Supposed to Enter NUMERIC VALUES ");
                obj.nextLine(); // Consume invalid input
                i--; // Repeat for the same player
                continue;
            }

            obj.nextLine(); // Consume newline after nextInt
        }

        getAvg(runHit, inningsCount);
    }

    private static void sorted() {
        //implementing bubble sort
        double temp = 0;
        String temps = "";
        int j = 0;

        for (int i = 0; i < 10; i++) {
            for (j = 0; j < 10 - i; j++) {
                if (battingAvg[j] < battingAvg[j + 1]) {
                    temp = battingAvg[j];
                    battingAvg[j] = battingAvg[j + 1];
                    battingAvg[j + 1] = temp;

                    temps = playerName[j];
                    playerName[j] = playerName[j + 1];
                    playerName[j + 1] = temps;
                }
            }
        }

        for (int i = 0; i < 11; i++) {
            System.out.println("BATTING AVG:- " + battingAvg[i] + " NAME:- " + playerName[i]);
        }
    }

    private static void getAvg(int r[], int iC[]) {
        int x[] = new int[r.length];

        for (int i = 0; i < 11; i++) {
            try {
                if (iC[i] != 0) {
                    x[i] = r[i] / iC[i];
                    battingAvg[i] = (double) x[i] / (notOutCount[i] + 1);
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            } catch (ArithmeticException e) {
                System.out.println("Number of Innings Played were Wrong for player#" + (i + 1));
                battingAvg[i] = 0; // Set batting average to 0 for this player
            }
        }

        System.out.println("\n\n\nTHE PLAYERS AND THEIR BATTING AVERAGE PRINTED IN ORDER IS:-");
        sorted();
    }
}
