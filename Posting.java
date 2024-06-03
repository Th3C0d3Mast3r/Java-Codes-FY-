import java.util.*;

class Posting
{
	static Scanner obj=new Scanner(System.in);

	int courseWork;
	int AptTest;
	int TechTest;
	int interview;


	//making the constructors for the same
	Posting (int courseWork, int AptTest, int TechTest,int interview)
	{
		this.courseWork=courseWork;
		this.AptTest=AptTest;
		this.TechTest=TechTest;
		this.interview=interview;

	}

	Posting (int TechTest,int interview)
	{
		this.courseWork=0;
		this.AptTest=0;
		this.TechTest=TechTest;
		this.interview=interview;
	}

	Posting (int interview)
	{
		this.courseWork=0;
		this.AptTest=0;
		this.TechTest=0;
		this.interview=interview;
	}

	public static void main(String args[])
	{
		int count=0;

		while(count==0){
		boolean decision=false;

		System.out.println("CHOOSE THE POST YOU ARE APPLYING FOR:-");
		System.out.println("(1) PROGRAMMER\n(2) TEAM LEADER\n(3) PROJECT MANAGER");
		int num=obj.nextInt();

		if(num==1)
			decision = programmer();
		else if(num==2)
			decision=teamLead();
		else if(num==3)
			decision=projM();
		else{
			System.out.println("WRONG INPUT-Exiting the CODE");
			System.exit(0);
		}


		if(decision==true)
		{
			System.out.println("CONGRATS- You are SELECTED for the Applied Post");
		}
		else
		{
			System.out.println("BETTER LUCK NEXT TIME");
		}

		System.out.println("Wish to Redo this? Enter \'1\' for redoing");
		int replyss=obj.nextInt();
		if(replyss==1)
			count+=0;
		else
			count+=90;

	}
	}

	private static boolean programmer()
	{
		System.out.println("Enter below:-");
		System.out.print("\nCourse Mark (out of 100)");
		int a=obj.nextInt(); 

		System.out.print("\nAptitude Test (out of 100)");
		int b=obj.nextInt();

		System.out.print("\nTechnical Test (out of 100)");
		int c=obj.nextInt();

		System.out.print("\nInterview (out of 100)");
		int d=obj.nextInt();

		Posting ob=new Posting(a,b,c,d);

		int sum=(ob.courseWork)+(ob.AptTest)+(ob.TechTest)+(ob.interview);

		if(ob.courseWork>=20 && ob.AptTest>=20 && ob.TechTest>=20 && ob.interview>=20 && sum>=80)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	private static boolean teamLead()
	{
		System.out.println("Enter below:-");
		
		System.out.print("\nTechnical Test (out of 100)");
		int c=obj.nextInt();

		System.out.print("\nInterview (out of 100)");
		int d=obj.nextInt();

		Posting ob=new Posting(c,d);

		int sum=(ob.TechTest)+(ob.interview);

		if(ob.courseWork>=20 && ob.AptTest>=20 && ob.TechTest>=20 && ob.interview>=20 && sum>=80)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static boolean projM()
	{
		System.out.print("\nInterview (out of 100)");
		int d=obj.nextInt();

		Posting ob=new Posting(d);

		if(ob.interview>=90)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}