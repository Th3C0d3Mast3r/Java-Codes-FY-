import java.util.*;

class itReturn
{
	static Scanner obj=new Scanner(System.in);

	double salary;
	double incomeProf;
	double incomeHP; //house or prop
	double capitalGains;
	double others;

	itReturn(double salary, double incomeHP, double incomeProf, double capitalGains, double others) //dual
	{
		this.salary=salary;
		this.incomeHP=incomeHP;
		this.incomeProf=incomeProf;
		this.capitalGains=capitalGains;
		this.others=others;
	}

	public static void main(String args[])
	{
		System.out.println("WELCOME TO ITR RETURN CODE");
		System.out.println("To Get your ITR Return, Enter the Below Values (if doesn't apply-enter 0):-");

		System.out.println("What is your profession?\n(1) EMPLOYEE\n(2) BUSINESSs");
		int profession=obj.nextInt();

		if(profession==1)
			employee();
		else if(profession==2)
			business();
		else{
			System.out.println("OKAY- EXITING THE CODE!");
			System.exit(0);
		}
	}

	private static void employee()
	{
		double s=0;
		double iHP=0;
		double cG=0;
		double o=0;
		double tax1=0;

		System.out.println("Are you Male(M) or Female(F)");
		char gender=obj.next().charAt(0);

		System.out.print("Enter Salary (MONTHLY):- ");
		s=obj.nextDouble();
		s=s*12; //this is the annual salary then

		System.out.print("\nEnter House Property Return(if any):- ");
		iHP=obj.nextDouble();

		System.out.print("\nEnter Capital Gains(if any):- ");
		cG=obj.nextDouble();
		
		System.out.println("\nEnter Other Monetary Source");
		o=obj.nextDouble();

		itReturn its=new itReturn(s, iHP, 0,cG, o); //all passed to the data members

		double gross=(its.salary)+(its.incomeHP)+(its.capitalGains)+(its.others);

		if((s/12)<=7500 && gender=='M' || gender=='m')
			tax1=0;
		else if((s/12)>7500 && gender=='M' || gender=='m')
			tax1=175;
		else if((s/12)<=10000 && gender=='F' || gender=='f')
			tax1=0;
		else if((s/12)>10000 && gender=='F' || gender=='f')
			tax1=200;

		double tot=gross-tax1;

		System.out.println("\n\n\nYOUR TOTAL SALARY(after deductions and all) is:- "+tot);

		if(tot<=250000)
			System.out.println("YOUR TOTAL PAYABLE TAX IS:- 0");
		else if(tot>250000 && tot<=500000)
			System.out.println("YOUR TOTAL PAYABLE TAX IS:- "+(0.05*tot));
		else if(tot>500000 && tot<=1000000)
			System.out.println("YOUR TOTAL PAYABLE TAX IS:- "+(0.2*tot));
		else
			System.out.println("YOUR TOTAL PAYABLE TAX IS:- "+(0.3*tot));
	}

	private static void business()
	{
		double iP=0;
		double iHP=0;
		double cG=0;
		double o=0;
		double tax1=0;

		System.out.println("Are you Male(M) or Female(F)");
		char gender=obj.next().charAt(0);

		System.out.print("Enter Profession Annual Business Income:- ");
		iP=obj.nextDouble();

		System.out.print("\nEnter House Property Return(if any):- ");
		iHP=obj.nextDouble();

		System.out.print("\nEnter Capital Gains(if any):- ");
		cG=obj.nextDouble();
		
		System.out.println("\nEnter Other Monetary Source");
		o=obj.nextDouble();

		itReturn its=new itReturn(0, iHP, iP,cG, o); //all passed to the data members

		double gross=(its.incomeProf)+(its.incomeHP)+(its.capitalGains)+(its.others);

		if((s/12)<=7500 && gender=='M' || gender=='m')
			tax1=0;
		else if((s/12)>7500 && gender=='M' || gender=='m')
			tax1=175;
		else if((s/12)<=10000 && gender=='F' || gender=='f')
			tax1=0;
		else if((s/12)>10000 && gender=='F' || gender=='f')
			tax1=200;

		double tot=gross-tax1;


		System.out.println("\n\n\nYOUR TOTAL SALARY(after deductions and all) is:- "+tot);

		if(tot<=250000)
			System.out.println("YOUR TOTAL PAYABLE TAX IS:- 0");
		else if(tot>250000 && tot<=500000)
			System.out.println("YOUR TOTAL PAYABLE TAX IS:- "+(0.05*tot));
		else if(tot>500000 && tot<=1000000)
			System.out.println("YOUR TOTAL PAYABLE TAX IS:- "+(0.2*tot));
		else
			System.out.println("YOUR TOTAL PAYABLE TAX IS:- "+(0.3*tot));
	}


}