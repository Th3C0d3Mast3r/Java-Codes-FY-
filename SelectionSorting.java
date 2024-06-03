import java.util.*;

class SelectionSorting
{

	static Scanner obj=new Scanner(System.in);

	public static void main(String args[])

	{
		System.out.println("Enter the Number of ELEMENTS in the Array");
		int len=obj.nextInt();
		selectionSort(len);
	}

	private static void selectionSort(int len)
	{
		int arr[]=new int[len];

		System.out.println("Enter "+len+" Numbers Below in any Order");
		for(int i=0; i<len; i++)
		{
			arr[i]=obj.nextInt();
		}

		//the actual selection sort algo
		int temp=0;

		for(int i=0; i<len; i++)
		{
			for(int j=i; j<len; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("THE SORTED ARRAY IS:-");
		//printing the output
		for(int i=0; i<len; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}