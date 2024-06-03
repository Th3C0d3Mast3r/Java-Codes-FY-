class MT2 implements Runnable // note that this is an interface that is pre-defined in java
{
	public void run()
	{
		System.out.println("RUNNING");
	}
	public static void main(String args[])
	{
		MT2 t=new MT2();
		Thread t1=new Thread(t); //passing the object of class in the COnstructor of thread
		t1.start();
	}
}