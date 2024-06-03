//this is the program that Ma'am explained in the class
import java.util.*;

class Box1
{
	int l;
	int b;
	int h;
	
	public void volume(int l, int b, int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;

		int vol=l*b*h;
		System.out.println("VOLUME IS:- "+vol);
	}
}

class Rectangle1 extends Box1
{
	Box1 ob=new Box1();

	public void area(int le, int br, int he)
	{
		ob.l=le;
		ob.b=br;
		ob.h=he;

		int area=ob.l*ob.b;
		System.out.println("AREA IS:- "+area);
	}
}

class Shape extends Rectangle1
{
	private String color;
}

class Main1
{
	static Scanner obj=new Scanner(System.in);

	public static void main(String args[])
	{
		Shape ob=new Shape();
		System.out.println("Enter the COLOR below:-");
		String color=obj.nextLine();

		System.out.println("Enter Length, Breadth, and Height");
		ob.l=obj.nextInt();
		ob.b=obj.nextInt();
		ob.h=obj.nextInt();

		display(ob.l, ob.b, ob.h, color);
	}

	private static void display(int len, int bre, int he, String s)
	{
		int x=len;
		int y=bre;
		int z=he;


		System.out.println("\n\n\nThe DIMENSIONS are:- "+x+"x"+y+"x"+z);
		System.out.println("THE COLOR is:- "+s);
		Shape ob=new Shape();
		ob.area(x,y,z);
		ob.volume(x,y,z);
	}
}

