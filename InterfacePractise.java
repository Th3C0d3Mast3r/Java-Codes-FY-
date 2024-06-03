interface Int{
	final int i=10;
	void display();
}

class InterfacePractise implements Int{
	public void display()
	{
		System.out.println("SIKE!");
	}

	public static void main(String args[])
	{
		Interface t=new Interface();

		System.out.println(i); //we can refer to 9 directly, because i is a static variable in interface!
		t.display();
	}
}