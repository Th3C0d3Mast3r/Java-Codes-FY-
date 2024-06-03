//this is a program for Anagram checker
import java.util.*;
class AnagramCheck
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		System.out.println("ENTER STRING 1:-");
		String st1=obj.next();
		st1=st1.toLowerCase();

		System.out.println("ENTER STRING 2:-");
		String st2=obj.next();
		st2=st2.toLowerCase();

		int charC[]=new int[27]; //we malke this of 27 because of zero based indexing

		if(st1.length()==st2.length())
		{
			for(int i=0; i<st1.length(); i++)
			{
				char ch1=st1.charAt(i);
				char ch2=st2.charAt(i);

				++charC[ch1-'a'];
				++charC[ch2-'a'];
			}

			int c=0; //this is the counter

			for(int i=0; i<27; i++)
			{
				if(charC[i]==0 || charC[i]%2==0)
				{
					c+=0;
				}
				else
				{
					c++;
				}
			}

			if(c>0)
			{
				System.out.println("NOT ANAGRAM");
			}
			else
				{
					System.out.println("ANAGRAM");
				}
			
		}
		else
		{
			System.out.println("NOT ANAGRAM");
		}
	}
}