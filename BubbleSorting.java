//Bubble sort
import java.util.*;

class BubbleSorting
{
	static Scanner obj=new Scanner(System.in);
	public static void main(String args[])

	{
		System.out.println("Enter the Number of ELEMENTS in the Array");
		int len=obj.nextInt();
		bubbleSort(len);
	}

	private static void bubbleSort(int len)
	{
		int arr[]=new int[len];

		System.out.println("Enter "+len+" Numbers Below in any Order");
		for(int i=0; i<len; i++)
		{
			arr[i]=obj.nextInt();
		}

		//the actual bubble sort algo
		int temp=0;
		int j=0;

		for(int i=0; i<len-1; i++)
		{
			j=i+1;
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}

		System.out.println("THE SORTED ARRAY IS:-");
		for(int i=0; i<len; i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}
}