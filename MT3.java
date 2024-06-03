import java.util.*;

class NumGen implements Runnable
{
	int num;
	public void run()
	{
		Random r=new Random();
		SquareCalc sc=new SquareCalc();
		CubeCalc cc=new CubeCalc();

		for(int i=0; i<5; i++)
		{

			try{
				num=r.nextInt(100);
			System.out.println("NUMBER IS:- "+num);

			sc.setNum(num);
			Thread t2=new Thread(sc);
			t2.start();

			cc.setNum(num);
			Thread t3=new Thread(cc);
			t3.start();
			 	Thread.sleep(1000);

			}
			catch(InterruptedException e)
			{
		 		System.out.println(e);
			}

			
		}
	}
}

class SquareCalc implements Runnable
{
	private int n;
	public void setNum(int n)
	{
		this.n=n;
	}

	public void run()
	{
		
			int square=n*n;
			System.out.println("SQUARE OF NUMBER IS:- "+square);
		
	}
}

class CubeCalc implements Runnable
{
	private int n;
	public void setNum(int n)
	{
		this.n=n;
	}
	public void run()
	{
		
			int cube=n*n*n;
			System.out.println("CUBE OF NUMBER IS:- "+cube);
			System.out.println();
			
		}

	}




class MT3//this is the main class that will have the static void main function
{
	public static void main(String args[])
	{
		NumGen ng=new NumGen();
		Thread t1=new Thread(ng);
		t1.start();
		
	}
}