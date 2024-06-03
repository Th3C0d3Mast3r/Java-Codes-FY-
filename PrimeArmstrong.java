import java.util.*;

class PrimeArmstrong
{
static Scanner obj=new Scanner(System.in);
	public static void main(String args[])
	{
		run();
	}

	private static void run()
	{
		System.out.println("Enter the NUMBER- we will see if its a PRIME ARMSTRONG OR NO");
		long num=obj.nextLong();
		isArmstrong(num);
		isPrime(num);
	}

	private static void isArmstrong(long n)
	{
		long temp=n;
		ArrayList<Long> arr=new ArrayList<Long>();

		while(temp!=0)
		{
			arr.add(temp%10);
			temp=temp/10;
		}

		int len=arr.size(); //gets the number of total elements
		long sum=0;
		for(int i=0; i<len; i++)
		{
			sum=(long)(sum+Math.pow(arr.get(i), len));
		}

		if(sum==n)
		{
			System.out.println("IS AN ARMSTRONG");
		}
		else
		{
			System.out.println("Oops!Not an ARMSTRONG");
			System.exit(0);
		}
	}

	private static void isPrime(long n)
	{
		int c=0;
		for(int j=2; j<=n; j++)
		{
			for(int i=2; i<n; i++)
			{
				if(j%i == 0)
				{
					c++;
				}
				else
				{
					c+=0;
				}
			}

			if(c==0)
			{
				System.out.println("Prime:- "+j);
			}
			else
			{
				continue;
			}
		}
	
	}
}