class Employee
{
	String name;
	int age;
	double salary;

	Employee() //this is a constructor setting some default values
	{
		name="unknown";
		age=18;
		salary=20000;
	}

	void setName(String name)
	{
		this.name=name;
	}

	void setAge(int age)
	{
		this.age=age;
	}

	void setSalary(double salary)
	{
		this.salary=salary;
	}

	void setAll(String name, int age, double salary)
	{
		this.salary=salary;
		this.age=age;
		this.name=name;
	}

	//NOW WE PRINT THE THINGS!

	void get() //prints each and every thing
	{
		System.out.println("\n\n\n***************************\nTHE OUTPUT IS:- ");
		System.out.println("NAME: "+name+"\nAGE: "+age+"\nSALARY: "+salary);
	}
}