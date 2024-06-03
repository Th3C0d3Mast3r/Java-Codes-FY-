//WAP for EVEN and ODD
import java.util.*;
class OddAndEven
{
	static Scanner obj=new Scanner(System.in);

	public static void main(String args[])
	{	
		
		char option;
		System.out.println("Would you Like to DO this USER INPUT based, or PRE-DEFI Type \'U\' or \'S\'");
		option=obj.next().charAt(0); //this is how we take char input in java

		if(option=='U' || option=='u')
		{
			userBased();
		}
		else
		{
			int odds=0;
			int evens=0;
			System.out.println("THis is to FInd all the ODD and EVEN numbers from 1 to 100");
			for(int i=1; i<=100; i++)
			{
				if(i%2==0)
				{
					evens++;
					System.out.println("E "+i);
				}
				else
				{
					odds++;
					System.out.println("O "+i);
				}
			}

			System.out.println("THE TOTAL ODDS are: "+odds);
			System.out.println("THE TOTAL EVENS are: "+evens);
		}
	}

	public static void userBased()
	{
		System.out.println("Enter the LOWER LIMIT: ");
		int ll=obj.nextInt();

		System.out.println("Enter the UPPER LIMIT: ");
		int ul=obj.nextInt();

		int odds=0;
		int evens=0;
		for(int i=ll; i<=ul; i++)
			{
				if(i%2==0)
				{
					evens++;
					System.out.println("E "+i);
				}
				else
				{
					odds++;
					System.out.println("O "+i);
				}
			}
			System.out.println("THE TOTAL ODDS are: "+odds);
			System.out.println("THE TOTAL EVENS are: "+evens);

	}
}