import java.util.*;
class BookStore
{
	static Scanner obj=new Scanner(System.in);

	public static void main(String args[])
	{
		run();
	}

	private static void run()
	{
		System.out.println("How Many Books' Reviews you want?");
		int rows=obj.nextInt();

		System.out.println("How Many Reviews You want per Book(MAXIMUM)");
		int cols=obj.nextInt();

		int bookRating[][]=new int[rows][cols];
		System.out.print("DO YOU WISH TO RUN THE CODE? (Press 1 to Escape)");
		int replyss=obj.nextInt();
		if(replyss==1)
		{
			System.exit(0);
		}

		else
		{
			reviewInputs(rows, cols, bookRating);
		}
	}

	private static void reviewInputs(int r, int c, int br[][])
	{
		for(int i=0; i<r; i++)
		{
			System.out.println("Enter reviews for Book "+(i+1));
			for(int j=0; j<c; j++)
			{
				br[i][j]=obj.nextInt();
			}
		}
			avgReview(r,c,br);
	}

	private static void avgReview(int r, int c, int br[][])
	{
		double sum[]=new double[r];

		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				sum[i]+=br[i][j];
			}
		}

		double avg[]=new double[r];

		for(int i=0; i<r; i++)
		{
			avg[i]=(sum[i]/c);
		}

		for(int i=0; i<r; i++)
		{
			System.out.printf("BOOK "+(i+1)+": %.2f", avg[i]);
		}

		int maxi=0;
		for(int i=0; i<r; i++)
		{
			for(int j=i; j<r; j++)
			{
				if(avg[i]>avg[j])
				{
					maxi=i;
				}
			}
		}
		System.out.println("HIGHEST RATED BOOK:- "+(maxi+1));
	}
}