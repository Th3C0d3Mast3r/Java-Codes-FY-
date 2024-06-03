//use constructors for initial declaration of name and the uid
//take inputs of the sems, and marks-display that

import java.util.*;
class mConstruct
{
	static int id;
	static int s;
	static int s1;
	static String name;
	int marks[][]=new int[10][10]; //array declaration

	private static void display(int arr[][])
	{
		System.out.println("\n\n\n\n\n"+name+", Your UID is "+id);
		System.out.println("YOUR MARKS ARE:- \n");
		for(int i=0; i<s; i++)
		{
			for(int j=0; j<s1; j++)
			{
				System.out.println("Sem-"+(i+1)+" Subject-"+(j+1)+":- "+arr[i][j]);
			}
			System.out.println("");
		}
	}

	private void input()
	{
		Scanner obj=new Scanner(System.in);

		System.out.println("Enter the number of SEMS you have:-");
		int sem=obj.nextInt();
		s=sem;

		System.out.println("Enter the Number of SUBJECTS in SEM:-");
		int subs=obj.nextInt();
		s1=subs;

		for(int i=0; i<sem; i++)
		{
			for(int j=0; j<subs; j++)
			{
				marks[i][j]=obj.nextInt();
			}
		}

		display(marks);
	}

	mConstruct(String n, int ui) //constructor
	{
		id=ui;
		name=n;
	}

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		mConstruct ob=new mConstruct("StudentName", 1234);
		ob.input();



	}
}
