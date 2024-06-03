//this is a code for String Revrsal
import java.util.*;
class StringReversal
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		StringBuilder st=new StringBuilder();

		System.out.println("ENTER A STRING");
		String str=obj.nextLine();

		st.append(str);

		System.out.println("The Reversed String is:- ");
		System.out.println(st.reverse());

	}
}