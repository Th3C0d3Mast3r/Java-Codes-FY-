import java.util.*;

class Employee
{
	protected int getSalary()
	{
		return 10000;
	}
	protected int getBonus()
	{
		return 0;
	}
}

class Intern extends Employee
{
	protected int getSalary()
	{
		int sal=super.getSalary();
		sal=(int)(sal*(0.75));

		return sal;
	}
	protected int getBonus()
	{
		int bonus=super.getBonus(); //jo har baar 0 hi hoga coz that is what it is
		return bonus+1000;
	}
}
class Clerk extends Employee
{
	protected int getSalary()
	{
		int sal=super.getSalary();
		sal=(int)(sal*(0.5));

		return sal;
	}
	protected int getBonus()
	{
		int bonus=super.getBonus(); //jo har baar 0 hi hoga coz that is what it is
		return bonus+3000;
	}
}
class Manager extends Employee
{
	protected int getSalary()
	{
		int sal=super.getSalary();
		sal=sal*(2);

		return sal;
	}
	protected int getBonus()
	{
		int bonus=super.getBonus(); //jo har baar 0 hi hoga coz that is what it is
		return bonus+9000;
	}
}



public class mmains
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		//now we make the objects of each of the inherited class and get the answers:-
		Intern i=new Intern();
		Clerk c=new Clerk();
		Manager m=new Manager();

		int sal1=i.getSalary();
		int b1=i.getBonus();
		int tot1=sal1+b1;

		int sal2=c.getSalary();
		int b2=c.getBonus();
		int tot2=sal2+b2;

		int sal3=m.getSalary();
		int b3=m.getBonus();
		int tot3=sal3+b3;

		System.out.println("THIS IS HOW ARE COMPANY GIVES THE SALARY:\n");
		System.out.println("FOR AN EMPLOYEE AS INTERN:-");
		System.out.println("BASE SALARY:- Rs."+sal1);
		System.out.println("BONUS:- Rs."+b1);
		System.out.println("TOTAL SALARY:- Rs."+tot1);

		System.out.println();

		System.out.println("FOR AN EMPLOYEE AS CLERK:-");
		System.out.println("BASE SALARY:- Rs."+sal2);
		System.out.println("BONUS:- Rs."+b2);
		System.out.println("TOTAL SALARY:- Rs."+tot2);

		System.out.println();
		
		System.out.println("FOR AN EMPLOYEE AS MANAGER:-");
		System.out.println("BASE SALARY:- Rs."+sal3);
		System.out.println("BONUS:- Rs."+b3);
		System.out.println("TOTAL SALARY:- Rs."+tot3);

	}
}