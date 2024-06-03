
abstract class Shape
{
	String color;	
	abstract double area();
	abstract String getColor();
}

class Circle extends Shape
{
	double rad;
	double area;
	Circle(String color, double a)
	{
		this.color=color;
		rad=a;
	}

	double area()
	{
		return (3.14*rad*rad);
	}

	String getColor()
	{
		return color;
	}
}
class Square extends Shape
{
	double side;
	double area;
	Square(String color, double a)
	{
		this.color=color;
		side=a;
	}

	double area()
	{
		return (side*side);
	}

	String getColor()
	{
		return color;
	}
}
class AbstractShapes
{
	public static void main(String args[])
	{
		Shape c1=new Circle("Blue", 12);
		Shape s=new Square("Red", 5);

		System.out.println("FOR CIRCLE:-");
		System.out.println("Color:- "+c1.getColor());
		System.out.println("Area:- "+c1.area());

		System.out.println("\n");
		System.out.println("FOR SQUARE:-");
		System.out.println("Color:- "+s.getColor());
		System.out.println("Area:- "+s.area());
	}	
}
