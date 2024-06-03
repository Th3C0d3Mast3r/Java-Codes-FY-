import java.util.*

interface DineIn
{
	public double deliver();
}

interface TakeAway
{
	public double displatch();
}

class Mains123C implements DineIn, TakeAway
{
	static Scanner obj=new Scanner(System.in);


	public static void main(String arg[])
	{
		showMenu();
	}

	private static showMenu()
	{
		System.out.println("(1) Burger. . . . . .  Rs. 50");
		System.out.println("(2) Frankie. . . . . . Rs. 45");
		System.out.println("(3) Pizza. . . . . . . Rs. 140");
		System.out.println("(4) Salad. . . . . . . Rs. 80");
		System.out.println("(5) Pasta. . . . . . . Rs. 90");
		System.out.println("(6) Garlic Bread. . .  Rs. 50");
		System.out.println("(7) Milkshakes. . . .  Rs. 80");
		System.out.println("(8) Juices. . . . . .  Rs. 70");

		System.out.println("Do You Wish To Place Order?");
		String r=obj.nextLine();

		if(r.equalsIgnoreCase("yes") || r.charAt(0)=='y' || r.charAt(0)=='Y')
		{
			placeOrder();
		}
		else
		{
			System.out.println("THANKS FOR VISITING");
			System.out.print("See You Back Again!");
			System.exit(0);
		}
	}

	private static void placeOrder()
	{
		int x=0;

		System.out.print("How Many Eatables You Wish to Buy: ");
		int num=obj.nextInt();
		int eatables[]=new int[9];

		for(int i=0; i<nums; i++)
		{
			System.out.println("Which is the #"+(i+1)+" Food You Wish to Buy?");
			x=obj.nextInt();

			System.out.println("How Many Qunatity you Wish to Buy?");
			y=obj.nextInt();

			eatables[x]=y;
		}


	}
}