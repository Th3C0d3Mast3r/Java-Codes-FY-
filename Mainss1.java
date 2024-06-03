//implementing the concepts of Polymorphism(method overloading and overriding)

import java.util.*;

class Employee
{
	void calculateSal()
	{
		System.out.println("THE BASE SALARY FOR EMPLOYEE IS 34000");
	}
}

class Programmer extends Employee
{
	void calculateSal()
	{
		super.calculateSal();
		System.out.println("POST WISE ADDITIONAL SALARY IS:- 46000");
		System.out.println("THE BASE SALARY FOR PROGRAMMER IS 80000");
	}
}

class Manager extends Employee
{
	void calculateSal()
	{
		super.calculateSal();
		System.out.println("POST WISE ADDITIONAL SALARY IS:- 41000");
		System.out.println("THE BASE SALARY FOR manager IS 75000");
	}
}

class Mainss1
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		Programmer p=new Programmer();
		Manager m=new Manager();
		System.out.println("WHAT ARE YOU?");
		String rep=obj.nextLine();

		if(rep.charAt(0)=='p' || rep.charAt(0)=='P'){
			p.calculateSal();
			System.out.println("");
		}
		else{
			m.calculateSal();
		}
		
		

	}
}