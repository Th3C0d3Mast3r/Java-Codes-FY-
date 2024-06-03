import java.util.*;
public class Codes1
{
	public static void main(String args[])
	{
		Codes1Fn c1=new Codes1Fn();
		Scanner obj=new Scanner(System.in);

		System.out.println("Enter the Number of digits whose Addition you want: ");
		int num=obj.nextInt();

		if(num==2)
		{
			System.out.println("Enter two digits below:-");
			int x=obj.nextInt();
			int y=obj.nextInt();
			System.out.println("The ANswer is:- "+c1.sum(x,y));
		}
		else if(num==3)
		{
			System.out.println("Enter 3 Digits below:-");
			int x1=obj.nextInt();
			int y1=obj.nextInt();
			int z=obj.nextInt();
			System.out.println("The Answer is:- "+c1.sum(x1,y1,z));
		}
		else
		{
			System.out.println("OOPS! TRY AGAIN!");
			System.exit(0);
		}

		System.out.println("Now for Average-enter the number of inputs you want:-");
		int option=obj.nextInt();

			int arr[]=new int[option];

			for(int i=0; i<option; i++)
			{
				arr[i]=obj.nextInt();
			}

			System.out.println("The Average is:- "+ c1.avg(arr));
	}
}