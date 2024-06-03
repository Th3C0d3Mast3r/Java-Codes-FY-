//implementing the concepts of Polymorphism(method overloading and overriding)

import java.util.*;

class Shape
{
	public void draw()
	{
		System.out.println("drawn the shape");
	}

	public void calculateArea()
	{
		System.out.println(1);
	}
}


class Rectangle extends Shape
{
	int l;
	int b;
	Rectangle(int l, int b)
	{
		this.l=l;
		this.b=b;
	}


	public void draw()
	{
		super.draw();
		System.out.println("drawn Rectangle");
	}

	public void calculateArea()
	{
		super.calculateArea();
		System.out.println(l*b);
	}
}

class Circle extends Shape
{
	int rad;

	Circle(int rad)
	{
		this.rad=rad;
	}
	public void draw()
	{
		super.draw();
		System.out.println("drawn the Circle");
	}

	public void calculateArea()
	{
		super.calculateArea();
		System.out.println((22/7)*rad*rad);
	}
}

class Triangle extends Shape
{
	int base;
	int height;

	Triangle(int base, int height)
	{
		this.base=base;
		this.height=height;
	}
	public void draw()
	{
		super.draw();
		System.out.println("drawn Triangle");
	}

	public void calculateArea()
	{
		super.calculateArea();
		System.out.println(0.5*base*height);
	}
}

class Mainss
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Side of RECTANGLE:");
		int l=obj.nextInt();
		int b=obj.nextInt();

		System.out.println("Enter the Radii of CIRCLE");
		int rad=obj.nextInt();

		System.out.println("Enter BASE and HEIGHT of the Triangle");
		int base=obj.nextInt();
		int he=obj.nextInt();



		Rectangle r=new Rectangle(l,b);
		Triangle t=new Triangle(base, he);
		Circle c=new Circle(rad);

		r.draw();
		r.calculateArea();
		System.out.print("\n");
		t.draw();
		t.calculateArea();
		System.out.print("\n");
		c.draw();	
		c.calculateArea();

	}
}