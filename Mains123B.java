import java.util.*;

interface SavingsAcc
{
	public double getSI();
}

interface CurrentAcc
{
	public double getCI();
}

class Customer implements CurrentAcc, SavingsAcc
{
	double rate=0.04; //this is the rate for SavingsAcc which is fixed by the bank itself
	double p=0, r=0;
	int t=0;
	Customer(double p, int t, double r)
	{
		this.p=p;
		this.t=t;
		this.r=r;
	}

	public double getSI()
	{
		return p+(p*r*t);
	}

	public double getCI()
	{
		return ( p * Math.pow((1+(r/100)),t) );
	}

}

public class Mains123B 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		System.out.println("What Type of Account You Hold?");
		String reply=obj.nextLine();

		if(reply.equalsIgnoreCase("current") || reply.charAt(0)=='c' || reply.charAt(0)=='C')
		{
			System.out.println("Enter PRINCIPAL AMOUNT-aka, the BALANCE");
			double prin=obj.nextDouble();

			System.out.println("Enter RATE for Compound Interest");
			double rate=obj.nextDouble();

			System.out.println("Enter TIME in years(note, compounded annually)");
			int time=obj.nextInt();

			Customer c=new Customer(prin, time, rate);
			double answers=c.getCI();

			System.out.println("\fTHE FINAL AMOUNT AFTER ADDING THE COMPOUND-INTEREST is:-  Rs."+answers);
		}
		else
		{
			System.out.println("Enter PRINCIPAL AMOUNT-aka, the BALANCE");
			double prin1=obj.nextDouble();

			System.out.println("Enter TIME in years(note, compounded annually)");
			int time1=obj.nextInt();

			Customer c=new Customer(prin1, time1, 0.04);
			double answers1=c.getSI();

			System.out.println("\fTHE FINAL AMOUNT ON ADDGING THE SIMPLE-INTEREST is:-  Rs."+answers1);
		}
	}
}