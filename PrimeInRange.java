//WAP to fid all the prime numbers in the given range. Print all the numbers and the number of primes in that range
import java.util.*;
class PrimeInRange
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		int ll, ul;

		System.out.print("Enter a LOWER LIMIT: ");
		ll=obj.nextInt(); //taking the lowe limit

		System.out.print("\nEnter the UPPER LIMIT: ");
		ul=obj.nextInt(); //upper limit

		isPrime(ll, ul);
	}

	public static void isPrime(int n1, int n2) //method for checking and printing Primes
	{
		int count=0;
		int numbers=0;
		for(int i=n1; i<=n2; i++)
		{
			for(int j=1; j<=i/2; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println((++numbers)+". "+i);
			}
			
			else
			{
				count=0;
			}
			
		}
		System.out.println("THUS, THE TOTAL NUMBER OF PRIME NUMBERS IN THE RANGE IS: "+numbers+"\n\n");
	}
}