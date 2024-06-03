import java.util.*;

class Vehicle
{
	int mileage;
	int price;
}



class Cars extends Vehicle
{
	int ownerCost;
	int warranty;
	int seatCap;
	String tyres;
}

class Bikes extends Vehicle
{
	int cylinderNo;
	int gearNo;
	String coolType;
	String tyres;
	int tankSize;
}


class Audi extends Cars
{
	public void display()
	{
		Audi ob=new Audi();

		ob.mileage=45;
		ob.price=5000000;

		ob.ownerCost=4000000;
		ob.warranty=5;
		ob.seatCap=4;
		ob.tyres="Broad";

		System.out.println("THESE ARE THE CAR SPECIFICATIONS:-\n");
		System.out.println("CAR COMPANY:- AUDI");
		System.out.println("CAR MILEAGE:- "+ob.mileage);
		System.out.println("OWNERSHIP COST:- "+ob.ownerCost);
		System.out.println("WARRANTY (in yrs):- "+ob.warranty);
		System.out.println("SEAT CAPACITY:- "+ob.seatCap);
		System.out.println("TYRE TYPE:- "+ob.tyres);
	}
}
class Ford extends Cars
{
	public void display()
	{
		Ford ob=new Ford();

		ob.mileage=55;
		ob.price=1500000;

		ob.ownerCost=1000000;
		ob.warranty=2;
		ob.seatCap=4;
		ob.tyres="Broad and Grooved for Mountain Terrain";

		System.out.println("THESE ARE THE CAR SPECIFICATIONS:-\n");
		System.out.println("CAR COMPANY:- FORD");
		System.out.println("CAR MILEAGE:- "+ob.mileage);
		System.out.println("OWNERSHIP COST:- "+ob.ownerCost);
		System.out.println("WARRANTY (in yrs):- "+ob.warranty);
		System.out.println("SEAT CAPACITY:- "+ob.seatCap);
		System.out.println("TYRE TYPE:- "+ob.tyres);
	}
}


class Bajaj extends Bikes
{
	public void display()
	{
		Bajaj ob=new Bajaj();

		ob.mileage=100;
		ob.price=80000;

		ob.cylinderNo=3;
		ob.gearNo=6;
		ob.coolType="Liquid";
		ob.tyres="Narrow or Broad";
		ob.tankSize=40;

		System.out.println("THESE ARE THE BIKE SPECIFICATIONS:-\n");
		System.out.println("BIKE COMPANY:- BAJAJ");
		System.out.println("BIKE PRICE:- "+ob.price);
		System.out.println("MILEAGE:- "+ob.mileage);
		System.out.println("NO. OF CYLINDERS:- "+ob.cylinderNo);
		System.out.println("NO. OF GEARS:- "+ob.gearNo);
		System.out.println("COOLING TYPE:- "+ob.coolType);
		System.out.println("TYRE TYPE:- "+ob.tyres);
		System.out.println("TANK SIZE:- "+ob.tankSize);


	}
}
class TVS extends Bikes
{
	public void display()
	{
		TVS ob=new TVS();

		ob.mileage=80;
		ob.price=70000;

		ob.cylinderNo=2;
		ob.gearNo=6;
		ob.coolType="Liquid";
		ob.tyres="Narrow";
		ob.tankSize=30;

		System.out.println("THESE ARE THE BIKE SPECIFICATIONS:-\n");
		System.out.println("BIKE COMPANY:- TVS");
		System.out.println("BIKE PRICE:- "+ob.price);
		System.out.println("MILEAGE:- "+ob.mileage);
		System.out.println("NO. OF CYLINDERS:- "+ob.cylinderNo);
		System.out.println("NO. OF GEARS:- "+ob.gearNo);
		System.out.println("COOLING TYPE:- "+ob.coolType);
		System.out.println("TYRE TYPE:- "+ob.tyres);
		System.out.println("TANK SIZE:- "+ob.tankSize);
	}
}


public class MainC
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		System.out.println("WHAT DO YOU WANT- CAR / BIKE");
		String choice1=obj.nextLine();

		if(choice1.charAt(0)=='c'||choice1.charAt(0)=='C')
		{
			System.out.println("WHICH CAR? AUDI/FORD");
			String choice11=obj.nextLine();

			if(choice11.charAt(0)=='a'||choice11.charAt(0)=='A')
			{
				Audi ob=new Audi();

				ob.display();
			}
			else
			{
				Ford ob=new Ford();

				ob.display();
			}

		}

		else if(choice1.charAt(0)=='b'||choice1.charAt(0)=='B')
		{
			System.out.println("WHICH BIKE? BAJAJ/TVS");
			String choice12=obj.nextLine();

			if(choice12.charAt(0)=='b'||choice12.charAt(0)=='B')
			{
				Bajaj ob=new Bajaj();
				ob.display();
			}
			else
			{
				TVS ob=new TVS();

				ob.display();
			}
		}

		else
		{
			System.out.println("\n\n\n\nYOU WANT TO EXIT-WE GET IT!");
			System.out.println("THANK YOU FOR TRYING OUT THE CODE!");
			System.exit(0);
		}
	}
}