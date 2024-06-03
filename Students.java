//remember-this is a non-main, just a function running class. As running this on the CMD won't lead to any answer.
//RUn students2 class which is calling this class and its functions!
public class Students
{
	String names;
	int ids;
	int marks[]=new int[3];

	void inputs(String s, int i, int sub1, int sub2, int sub3)
	{
		names=s;
		ids=i;
		marks[0]=sub1;
		marks[1]=sub2;
		marks[2]=sub3;
	}

	void display()
	{
		System.out.println(names);
		System.out.println(ids);

		for(int i=0; i<3; i++)
		{
			System.out.println("MARKS OF SUBJECT:" +marks[i]);
		}
	}
}