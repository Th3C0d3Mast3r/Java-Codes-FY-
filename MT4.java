import java.util.*;

class PrimeFinder implements Runnable
{
	public void run()
	{
		try{
			PrimeFinder ob=new PrimeFinder();
			ob.isPrime();
			Thread.sleep(1000); //gives a pause of 1sec
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	private void isPrime()
	{
		int count=0;
		for(int i=2; i<100; i++)
		{
			for(int j=2; j<i; j++) //A prime would never give a count++ case in this
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
			count=0;
		}
		System.out.println();
	}
}


class PalindromeFinder implements Runnable
{
	public void run()
	{
		PalindromeFinder pf=new PalindromeFinder();

		try{
			pf.isPalin();
			Thread.sleep(1000);
			System.out.println();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	private void isPalin()
	{
		for(int i=10; i<=1000; i++)
		{
			String st=""+i;
			String st2="";
			for(int j=st.length()-1; j>=0; j--)
			{
				st2+=st.charAt(j);
			}

			if(i==Integer.valueOf(st2))
			{
				System.out.print(i+" ");
			}
		}
	}
}



class MT4
{
	public static void main(String args[])
	{
		PrimeFinder pf=new PrimeFinder();
		Thread t1=new Thread(pf);
		t1.start();
		PalindromeFinder pdf=new PalindromeFinder();
		Thread t2=new Thread(pdf);
		t2.start();
	}
}