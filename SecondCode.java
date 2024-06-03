//this is the second code in the java programming language
import java.util.*;
class SecondCode
{
	private int gear=5;
 	
 	public static void main(String args[])
 	{
 		/*SecondCode b; //this is the object declaration-but memory allocation and all that is not done
 		b.braking();*/

 		SecondCode b=new SecondCode();
 		b.breaking();
 	}
	void breaking() //the function is basic-thus, we did not put much of public or even static there
	{
		System.out.println("\fWORKS");
	}

}