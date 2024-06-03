//NOTE:- IMAGICA is an exact replica of Essel World. Changes need to be made so as to RUN it correctly
//THE CODE IS COMPILE AND RUN READY THO!


import java.util.*;
abstract class AmusementPark {
    abstract int getCost(int a, int b); // This is an abstract method
}

class EsselWorld extends AmusementPark {
    Scanner obj = new Scanner(System.in);

    void inputs() {
        EsselWorld e = new EsselWorld();

        int games[] = new int[5]; // The index of this represents the game no. and its value is the no. of times that game is played
        // Game no. 5 is extra
        int baseAdd=0;

        System.out.println("Enter the Number of People in the Group (can be from 1 to 30)");
        int grp = obj.nextInt();

        System.out.println("Which Day are You Planning to Visit on?");
        String day=obj.next();

        if(day.charAt(0)=='s' || day.charAt(0)=='S')
        	baseAdd=300*grp;
        else
        	baseAdd+=0;

        System.out.println("Enter the Number of Kids and Senior Citizens (people of age more than 60 or less than 21)");
        int less = obj.nextInt();

        System.out.println("Do You Want to Play Games?");
        String reply = obj.next();

        if (reply.charAt(0) == 'y' || reply.charAt(0) == 'Y') {
            games = e.playGames(games);
            int gamesPlayed = 0;
            for (int i = 0; i < 5; i++) {
                if (games[i] != 0) {
                    gamesPlayed++;
                }
            }

            int totCost = e.getCost(grp, less) + (games[4] * 50) + baseAdd;
            e.billings(totCost, gamesPlayed, games);
        } 
        else
        {
        	int totCost = e.getCost(grp, less) + (games[4] * 50) + baseAdd;
        	int gamesPlayed=0;
            e.totalGamesPlayed();
            e.billings(totCost, gamesPlayed, games);
        }
    }

    void billings(int tc, int gp, int games[]) {
        System.out.println("\fTHIS IS THE FINAL BILL PRINTING POST THE SESSION:-");
        System.out.println("TOTAL GAMES PLAYED: " + gp);
        for(int i=0; i<5; i++)
        {
        	System.out.println("GAME#"+(i+1)+":- "+games[i]);
        }
        System.out.println("GAMES NOT PLAYED: " + (5 - gp));
        System.out.println("TOTAL SPENDINGS MADE (incl of Tickets+Additional Games): Rs." + tc);
    }

    int getCost(int grp, int less) {
        return ((1050 * (grp - less)) + (660 * less));
    }

    int[] playGames(int a[]) {
        System.out.println("How Many Games do you want to play?");
        int num = obj.nextInt();

        int x[] = new int[5];
        int inp1 = 0;
        int times = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter Game #" + (i + 1) + " that you wish to Play:");
            inp1 = obj.nextInt();

            System.out.println("How many Times You Wish to Play Game No. " + inp1);
            times = obj.nextInt();

            x[inp1-1] = times;
        }

        return x;
    }

    void totalGamesPlayed() {
        System.out.println("No games played.");
    }
}

class Imagica extends AmusementPark {
    Scanner obj = new Scanner(System.in);

    void inputs() {
        EsselWorld e = new EsselWorld();

        int games[] = new int[5]; // The index of this represents the game no. and its value is the no. of times that game is played
        // Game no. 5 is extra

        System.out.println("Enter the Number of People in the Group (can be from 1 to 30)");
        int grp = obj.nextInt();

        System.out.println("Enter the Number of Kids and Senior Citizens (people of age more than 60 or less than 21)");
        int less = obj.nextInt();

        System.out.println("Do You Want to Play Games?");
        String reply = obj.next();

        if (reply.charAt(0) == 'y' || reply.charAt(0) == 'Y') {
            games = e.playGames(games);
            int gamesPlayed = 0;
            for (int i = 0; i < 5; i++) {
                if (games[i] != 0) {
                    gamesPlayed++;
                }
            }

            int totCost = e.getCost(grp, less) + (games[4] * 50);
            e.billings(totCost, gamesPlayed, games);
        } else {
            e.totalGamesPlayed();
        }
    }

    void billings(int tc, int gp, int games[]) {
        System.out.println("\fTHIS IS THE FINAL BILL PRINTING POST THE SESSION:-");
        System.out.println("TOTAL GAMES PLAYED: " + gp);
        for(int i=0; i<5; i++)
        {
        	System.out.println("GAME#"+(i+1)+":- "+games[i]);
        }
        System.out.println("GAMES NOT PLAYED: " + (5 - gp));
        System.out.println("TOTAL SPENDINGS MADE (incl of Tickets+Additional Games): Rs." + tc);
    }

    int getCost(int grp, int less) {
        return ((1050 * (grp - less)) + (660 * less));
    }

    int[] playGames(int a[]) {
        System.out.println("How Many Games do you want to play?");
        int num = obj.nextInt();

        int x[] = new int[5];
        int inp1 = 0;
        int times = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter Game #" + (i + 1) + " that you wish to Play:");
            inp1 = obj.nextInt();

            System.out.println("How many Times You Wish to Play Game No. " + inp1);
            times = obj.nextInt();

            x[inp1-1] = times;
        }

        return x;
    }

    void totalGamesPlayed() {
        System.out.println("No games played.");
    }
}

public class Experiment7D {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        EsselWorld ob1 = new EsselWorld();
        Imagica ob2 = new Imagica();

        System.out.println("Which Amusement Park are you going to?");
        String aPark = obj.nextLine();

        if (aPark.equalsIgnoreCase("essel world") && (aPark.charAt(0) == 'E' || aPark.charAt(0) == 'e')) {
            ob1.inputs();
        } else {
            ob2.inputs();
        }
    }
}