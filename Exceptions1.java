//some more changes needed
import java.util.*;
class Exceptss extends Exception
{
	public Exceptss(String s)
	{
		super(s);
	}
}
class Exceptions1
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
			System.out.println("Enter Gap Between Vaccine Doses");
			int gap=obj.nextInt();

			try
			{
				throw new Exceptss("INVALID INPUTS");
			}
			catch(Exceptss e)
			{
				System.out.println("ERROR CAUGHT");
				System.out.println(e.getMessage());
			}
	}
}