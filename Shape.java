import java.util.*;
class Shape extends Rectangle1
{
	static Scanner obj=new Scanner(System.in);
	private String color;

	public static void main(String args[])
	{
		Shape ob=new Shape();
		System.out.println("Enter the COLOR below:-");
		color=obj.nextLine();

		System.out.println("Enter Length, Breadth, and Height");
		ob.l=obj.nextInt();
		ob.b=obj.nextInt();
		ob.h=obj.nextInt();
		display(ob.l, ob.b, ob.h)
	}

	private static void display(int len, int bre, int he)
	{
		
	}
}