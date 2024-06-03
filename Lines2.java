import java.util.*;
class Lines2
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 1, 2, 3 for the different input ways");
		int num=obj.nextInt();

		if(num==1)
		{
			double a=obj.nextDouble();
			double b=obj.nextDouble();
			Lines ob = new Lines(a,b);
			
		}
		else if(num==2)
		{
			double a1=obj.nextDouble();
			double b1=obj.nextDouble();
			double c1=obj.nextDouble();
			Lines ob1 = new Lines(a1,b1,c1);
		}
		else if(num==3)
		{
			double a2=obj.nextDouble();
			double b2=obj.nextDouble();
			double c2=obj.nextDouble();
			double d2=obj.nextDouble();
			double e2=obj.nextDouble();
			Lines ob2 = new Lines(a2,b2,c2,d2, e2);
		}
		else{
			System.exit(0);
		}

	}
}