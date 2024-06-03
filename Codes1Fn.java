import java.util.*;
public class Codes1Fn
{
	public int sum(int x, int y)
	{
		return (x+y);
	}

	public int sum(int x, int y, int z)
	{
		return (x+y+z);
	}

	public double avg(int arr[])
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		return (sum/arr.length);
	}

	
}