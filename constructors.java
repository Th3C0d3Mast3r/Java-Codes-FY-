//this is the main function that uses the things from class Employee.java
import java.util.*;
class constructors
{
	public static void main(String args[]){

	Employee ob=new Employee(); //this object even invokes the base constructor in the file Employee
	Scanner obj=new Scanner(System.in);

	System.out.println("WHAT DO YOU WANT TO ENTER: ");
	System.out.println("(1) NAME only");
	System.out.println("(2) AGE only");
	System.out.println("(3) SALARY only");
	System.out.println("(4) NAME, AGE, SALARY");
	int num=obj.nextInt();
	obj.nextLine();

	if(num==1)
	{

		String str=obj.nextLine();
		ob.setName(str);
		ob.get();
	}

	else if(num==2)
	{
		int a=obj.nextInt();
		ob.setAge(a);
		ob.get();
	}

	else if(num==3)
	{
		double s=obj.nextDouble();
		ob.setSalary(s);
		ob.get();
	}
	else if(num==4)
	{
		String str1=obj.nextLine();
		int a1=obj.nextInt();
		double sal=obj.nextDouble();
		ob.setAll(str1, a1, sal);
		ob.get();
	}
	else
	{
		ob.get();
	}
}
}