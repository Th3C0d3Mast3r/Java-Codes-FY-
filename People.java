import java.util.*;
class People
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in); //Scanner Class is pre-built in java

		Students s1=new Students(); //we make an object of a file(java file) that we have created as a SOLE METHOD BASED CLASS

		String name;
		int ids;

		System.out.print("Enter NAME:");
		name=obj.nextLine();

		System.out.print("Enter ID:");
		ids=obj.nextInt();

		s1.inputs(name, ids);
		s1.display();
	}
}