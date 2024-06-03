//this is a practise problem on the topic of Mersenne Prime Numbers
import java.util.*;
class Mersenne
{
	static Scanner obj=new Scanner(System.in);

	public static void main(String args[])
	{
		run();
	}

	public static void run()
	{
		System.out.println("Enter the value of 'p' for the Mesenne Finder");
		int p=obj.nextInt();

		if(p<2 || p>31)
		{
			System.out.println("Whoops! Enter a NUmber in range of 2 to 31");
			run();
		}

		isPrime(p);
	}

	private static void isPrime(int p)
	{
		double num=0;
		for(int i=2; i<=p; i++)
		{
			num=(Math.pow(2, i))-1;
			if(primes(num))
			{
				System.out.println(num+" for the value of p being: "+i);
			}
			else
			{
				continue;
			}
		}
	}

	private static boolean primes(double n)
	{
		int c=0;

		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
			{
				c++;
			}
			else
			{
				c+=0;
			}
		}

		if(c==0)
			return true;
		else
			return false;
	}
}