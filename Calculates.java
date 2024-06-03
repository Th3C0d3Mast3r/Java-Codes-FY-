import java.util.*;
class Calculates
{
    int n1, d1, n2, d2;
    int nFinal;
    int dFinal;

    Calculates()
    {
        n1=n2=d1=d2=1;
        nFinal=1;
        dFinal=1;
    }

    public static void main(String args[])
    {
        Calculates c=new Calculates();
        Scanner obj=new Scanner(System.in);

        System.out.println("1) PERFORM ADDITION");
        System.out.println("2) PERFORM SUBTRACTION");
        System.out.println("3) PREFORM MULTIPLICATION");
        System.out.println("4) PERFORM DIVISION");
        int num=obj.nextInt();

        if(num==1)
        {
            c.inputs();
            c.additions(c.n1, c.d1, c.n2, c.d2);
        }
        else if(num==2)
        {
            c.inputs();
            c.subtractions(c.n1, c.d1, c.n2, c.d2);
        }
        else if(num==3)
        {
            c.inputs();
            c.multiplications(c.n1, c.d1, c.n2, c.d2);
        }
        else if(num==4)
        {
            c.inputs();
            c.divisions(c.n1, c.d1, c.n2, c.d2);
        }
        else
        {
            System.out.println("Woops! This code is for");
            System.exit(0);
        }

        System.out.println("\n\n\n\n\nNow, for the table printer-Enter a Denominator");
        int numss=obj.nextInt();
        c.TablePrinter(numss);
    }

    private void TablePrinter(int denoms)
    {
        //this is the solution of that Multiplication
        System.out.println("\fTHE OUTPUT FOR THE MULTIPLICATION IS:-");
        for(int i=1; i<denoms; i++)
        {
            for(int j=1; j<denoms; j++)
            {
                nFinal=i*j;
                dFinal=denoms*denoms;
                reducer();
                System.out.print(nFinal+"/"+dFinal+"\t");
            }
            System.out.println("");
        }
    }

    private void additions(int n1, int d1, int n2, int d2) {
        nFinal = (n1 * d2) + (n2 * d1);
        dFinal = d1 * d2;

        reducer();
        System.out.println("THE FINAL ANSWER IS: " + nFinal + "/" + dFinal);
    }

    private void subtractions(int n1, int d1, int n2, int d2) {
        nFinal = (n1 * d2) - (n2 * d1);
        dFinal = d1 * d2;

        reducer();
        System.out.println("THE FINAL ANSWER IS: " + nFinal + "/" + dFinal);
    }

    private void multiplications(int n1, int d1, int n2, int d2) {
        nFinal = n1 * n2;
        dFinal = d1 * d2;

        reducer();
        System.out.println("THE FINAL ANSWER IS: " + nFinal + "/" + dFinal);
    }

    private void divisions(int n1, int d1, int n2, int d2) {
        nFinal = n1 * d2;
        dFinal = d2 * n1;

        reducer();
        System.out.println("THE FINAL ANSWER IS: " + nFinal + "/" + dFinal);
    }

    private void inputs()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first fraction in the form of: NUMERATOR and then DENOMINATOR");
        n1=obj.nextInt();
        d1=obj.nextInt();

        System.out.println("Enter the Second fraction in the form of: NUMERATOR and then DENOMINATOR");
        n2=obj.nextInt();
        d2=obj.nextInt();
    }

    private void reducer() {
        int gcd = findGCD(Math.abs(nFinal), Math.abs(dFinal));
        nFinal /= gcd;
        dFinal /= gcd;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}

