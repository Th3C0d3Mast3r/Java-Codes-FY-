//conversion() is the function
//user inputs second and we are converting that to days, months, and all- to hrs, min and secs
//user input two would be back coversion
import java.util.*;
public class times
{
	int hours;
	int mins;
	int secs;

	times() //this is an edit to the og code because of the new Learning of Constructors
			//thus, I am reuisng the pre-existing file to even apply concepts of Constructors and all!
	{
		hours=0;
		mins=0;
		secs=0;
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		times ob=new times(); //class object creation
		int k=0; //this is the counter which keeps on repeating till wrong input type!
		while(k<=0){
		int a=0;
		int b=0;
		int c=0;
		long d=0;

		System.out.println("CHOOSE THE INPUT-OUTPUT FORMAT from below:-\n");
		System.out.println("(1) SECONDS -----> HRS:MINS:SECS");
		System.out.println("(2) HOURS:MINS:SECS -----> SECS");
		int num=obj.nextInt();

		if(num==1)
		{
			System.out.println("Enter the SECONDS below:");
			d=obj.nextLong();

			ob.conversions(d);
			k+=0;
		}
		else if(num==2)
		{
			System.out.println("HOURS:");
			a=obj.nextInt();

			System.out.println("MINUTES:");
			b=obj.nextInt();

			System.out.println("SECONDS:");
			c=obj.nextInt();

			ob.conversions(a,b,c);
			k+=0;

		}
		else
		{
			times t=new times();
			System.out.println("THE DEFAULT THINGS ARE:- ");
			System.out.println(t.hours+":"+t.mins+":"+t.secs);
			System.out.println("EXITING THE CODE!");
			System.exit(0);
		}
	}
	}

	public void conversions(long seconds)
	{
		hours=(int)(seconds/3600);
		mins=(int)(seconds%3600)/60;
		secs=(int)((seconds%3600)%60);

		System.out.println("\n"+seconds+" when converted, gives us:");
		System.out.println("HOURS: "+hours);
		System.out.println("MINUTES: "+mins);
		System.out.println("SECONDS: "+secs);
	}

	public void conversions(int a, int b, int c)
	{
		long seconds= (a*3600)+(b*60)+c;
		System.out.println("\nTHE TOTAL SECONDS IS: "+seconds);

	}
}