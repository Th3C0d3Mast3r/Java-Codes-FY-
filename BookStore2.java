import java.util.*;
class BookStore2
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		int bookRating[][]=new int[4][4];

		for(int i=0; i<4; i++)
		{
			System.out.println("Enter 4 Reviews for Book"+(i+1));
			for(int j=0; j<4; j++)
			{
				bookRating[i][j]=obj.nextInt();
			}
			System.out.println("");
		}

		display(bookRating);
	}

	private static void display(int br[][])
	{
		double avg=new double[4];
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				avg[i]+=br[i][j];
			}
		}

		for (int i=0; i<4; i++)
		{
			avg[i]/=4;
		}

		for(int i=0; i<4; i++)
		{
			System.out.println("Avg Rating for Book #"+(i+1)+" is:"+avg[i]);
		}

		//CODE FOR MAXIMUM

		int maxima=0; //index of max
		for(int i=0; i<4; i++)
		{
			for(int j=i; j<3; j++)
			{
				if(avg[i]>=avg[j])
				{
					maxima=i;
				}
			}
		}

		System.out.print("Book NO.: "+maxima);
	}
}