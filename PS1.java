import java.util.*;
class PS1
{
	static Scanner obj=new Scanner(System.in);
	public static void main(String args[])
	{

		System.out.println("Enter the TOTAL INPUTS IN ARRAY");
		int nums=obj.nextInt();

		inputs(nums);
	}

	private static void inputs(int n)
	{
		Scanner obj=new Scanner(System.in);
		int arr[]=new int[n];
		for(int i=0;i<n; i++)
		{
			arr[i]=obj.nextInt();
		}

		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+"\t");
		}

		System.out.println("\n\n\nWhat do you want to do from this array now:-\n(1)SEARCH\n(2)SORT");
		int options=obj.nextInt();
		if(options==1)
		{
			System.out.println("\n\nWhat NUMBER do you want to search in the array:");
			int x=obj.nextInt();
			search(arr, x);
		}
		else if(options==2)
		{
		sorts(arr);
		}
		else{
			System.exit(0);
		}
	}

	private static void search(int a[], int y)
	{
		int c=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==y)
			{
				System.out.println("FOUND");
				c++;
			}
			else
			{
				c+=0;
			}
		}
		if(c==0)
		{
			System.out.println("NOT FOUND");
		}

		System.out.println();
		
		System.out.println("Want to CONTINUE? Y or N");
		String reply=obj.next();

		if(reply.charAt(0)=='y' || reply.charAt(0)=='Y')
		{
			System.out.println("How Many Inputs?");
			int in=obj.nextInt();
			inputs(in);
		}
		else
		{
			System.exit(0);
		}
	}

	private static void sorts(int b[])
	{
		int temp=0;

		for(int i=0; i<b.length; i++)
		{
			for(int j=i; j<b.length; j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+"\t");
		}
		System.out.println("");

		System.out.println("Want to CONTINUE? Y or N");
		String reply=obj.next();

		if(reply.charAt(0)=='y' || reply.charAt(0)=='Y')
		{
			System.out.println("How Many Inputs?");
			int in=obj.nextInt();
			inputs(in);
		}
		else
		{
			System.exit(0);
		}
	}
}