import java.util.*;

class Rectangle extends Shapes
{

	public static void main(String args[])
	{
		System.out.println("THIS IS AN AREA CALCULATOR(using INheritance things)");
		inputs();
	}

	private static void inputs()
	{
		Scanner obj=new Scanner(System.in);
		
		int l=0;
		int w=0;
		System.out.println("ENTER LENGTH and WIDTH of the RECTANGLE");
		l=obj.nextInt();
		w=obj.nextInt();
		calArea(l,w);
	}
}