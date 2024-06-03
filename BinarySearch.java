import java.util.*;
class BinarySearch
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		int arr[]={3,4,5,5,5555,6,23,2321142,24345};
		System.out.print("Number to be Found:");
		int finds=obj.nextInt();

		boolean isPresent=bSearch(arr, finds);
		System.out.print(isPresent);
	}

	private static boolean bSearch(int a[], int x)
	{
		Arrays.sort(a);
		int low=a[0];
		int high=a[a.length-1];
		int mid=a[(low+high)/2];

		while(low<=high)
		{
			if(a[mid]==x)
			{
				return true;
			}
			else if(a[mid]>x)
			{
				low=a[0];
				high=a[mid];

				mid=a[(low+high)/2];
			}
			else if(a[mid]<x)
			{
				low=a[mid];
				high=a[a.length-1];

				mid=a[(low+high)/2];
			}
			else{

			}
		}
		return false;
	}
}