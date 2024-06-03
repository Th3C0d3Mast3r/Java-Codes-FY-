import java.util.*;
interface Volume
{
	public double getVolume();
}

interface SurfaceArea
{
	public double getSurfArea();
}


class Cylinder implements Volume, SurfaceArea
{
	int radius=0, height=0;

	Cylinder(int radius, int height)
	{
		this.radius=radius;
		this.height=height;
	}

	public double getVolume()
	{
		return((Math.PI)*Math.pow(radius,2)*height);
	}
	public double getSurfArea()
	{
		return ( ((Math.PI)*2*radius) * (height+radius));
	}
}


class Cone implements Volume, SurfaceArea
{
	int radius=0, height=0;
	Cone(int radius, int height)
	{
		this.radius=radius;
		this.height=height;
	}
	public double getVolume()
	{
		return((Math.PI) * radius*radius * (height/3));
	}
	public double getSurfArea()
	{
		return ( ((Math.PI)*radius) * (Math.sqrt(radius*radius + height*height) + radius));
	}
}


class Sphere implements Volume, SurfaceArea
{
	int radius=0;
	Sphere(int radius)
	{
		this.radius=radius;
	}

	public double getVolume()
	{
		return ( (1.33)*(Math.PI)*radius*radius*radius );
	}

	public double getSurfArea()
	{
		return ((Math.PI * 4)*radius*radius);
	}
}


class Mains123
{
	public static void main(String args[])
	{
	    Scanner obj=new Scanner(System.in);
		System.out.println("Which Shape's Volume and Total Surface Area do you want?");
		String reply=obj.nextLine();

		if(reply.equalsIgnoreCase("cylinder"))
		{
			System.out.println("Enter RADIUS and the HEIGHT of the Cylinder");
			int r=obj.nextInt();
			int h=obj.nextInt();

			Cylinder c=new Cylinder(r,h);

			System.out.println("THE VOLUME IS:- "+ c.getVolume()+ " cubic units");
			System.out.println("THE SURFCE AREAD IS:- "+c.getSurfArea()+ " square units");
		}
		else if(reply.equalsIgnoreCase("cone"))
		{
			System.out.println("Enter RADIUS and the HEIGHT of the Cone");
			int r1=obj.nextInt();
			int h1=obj.nextInt();

			Cone c1=new Cone(r1,h1);
			
			System.out.println("THE VOLUME IS:- "+ c1.getVolume()+ " cubic units");
			System.out.println("THE SURFCE AREAD IS:- "+c1.getSurfArea()+ " square units");
		}
		else if(reply.equalsIgnoreCase("sphere"))
		{
			System.out.println("Enter RADIUS Sphere");
			int r2=obj.nextInt();

			Sphere s=new Sphere(r2);
			
			System.out.println("THE VOLUME IS:- "+ s.getVolume()+ " cubic units");
			System.out.println("THE SURFCE AREAD IS:- "+s.getSurfArea()+ " square units");
		}
		else
		{
			System.out.println("WRONG INPUT!");
			System.exit(0);
		}
	}
}