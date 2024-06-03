class Shipment extends BoxWeight
{
	String shipNo;

	public static void main(String args[])
	{
		Shipment ob=new Shipment();
		System.out.println("ENTER THE SHIPMENT No.");
		ob.shipNo=obj.nextLine();

		System.out.println("What is the Box-Weight");
		int w=obj.nextInt();
		BoxWeight(w);

		System.out.println("Enter the Dimensions of the Box");
		int l=obj.nextInt();
		int b=obj.nextInt();
		int h=obj.nextInt();
		Box11(l,b,h);

		System.out.println("\n\n\nTHE SHIPMENT DETAILS ARE:-");
		System.out.println("Shipment No. :-"+ob.shipNo);
		System.out.println("Box Weight:- "+weight);
		System.out.println("Volume of the Box is:- "+volume);




	}
}
