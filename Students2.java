import java.util.*;
class Students2
{
	public static void main(String args[])
	{
		Students s1=new Students(); //this is the line which shows that we are using the functions of any other class

		Scanner obj=new Scanner(System.in);

		String name;
		int uid;
		int marks1, marks2, marks3;

		System.out.println("Enter the name below:");
		name=obj.nextLine();
		System.out.println("Enter your UID");
		uid=obj.nextInt();
		System.out.println("ENter Marks of sub1");
		marks1=obj.nextInt();
		System.out.println("Enter Marks of sub2");
		marks2=obj.nextInt();
		System.out.println("Enter Marks of sub3");
		marks3=obj.nextInt();

		s1.inputs(name, uid, marks1, marks2, marks3);
		s1.display();
		System.out.println("\n\n\nYOUR PERCENTAGE IS:- "+ ((marks1+marks2+marks3)/3)*100);
		System.out.println("*********************THANK YOUR FOR TRYING OUT THE CODE! EXITING CODE!*********************")

	}
}