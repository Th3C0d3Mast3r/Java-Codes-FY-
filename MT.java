//this is a code for MUTLI-THREADING
class MT extends Thread // "Thread" is an in-built class
{
	public void run()
	{
		System.out.println("RUNNING");
	}

	public static void main(String args[])
	{
		MT t1=new MT();
		t1.start();
	}
}