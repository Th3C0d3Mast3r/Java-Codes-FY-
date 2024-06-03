import java.util.*;

class Odds extends Adder implements Runnable {
    public void run() {
        try {
            isOdd();
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.print(e);
        }
    }

    private static void isOdd()
    {
        Random r = new Random();
        int rando = r.nextInt(1000);
        if (rando % 2 == 0)
        {
            isOdd(); // Generate a random odd number
        } else {
            System.out.println("RANDOM ODD:- "+rando);
            add(rando); // Add the odd number to the sum
        }
    }
}

class Evens extends Adder implements Runnable {
    public void run() {
        try {
            isEven();
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.print(e);
        }
    }

    private static void isEven() {
        Random r = new Random();
        int rando = r.nextInt(1000);
        if (rando % 2 != 0) {
            isEven(); // Generate a random even number
        } else {
            System.out.println("RANDOM EVEN:- "+rando);
            add(rando); // Add the even number to the sum
        }
    }
}

class Adder implements Runnable {
    private static int sum = 0;

    public void run() {
        // Perform some operations
    }

    protected static synchronized void add(int num) //this is the MAIN thing
    {
        sum += num;
        System.out.println("Current sum: " + sum);
    }
}

class MT6 {
    public static void main(String[] args)
    {
        Odds oddThread = new Odds();
        Evens evenThread = new Evens();

        Thread t1 = new Thread(oddThread);
        Thread t2 = new Thread(evenThread);

        t1.start();
        t2.start();
    }
}
