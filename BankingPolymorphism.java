/**Aayush has deposited Rs. 10000 in SBI Bank,  Rs. 12500 in ICICI Bank, and Rs. 20000 in AXIS bank respectively for 
a particular month.
*/ 

class Bank
{
	int getRate(int sum, int days)
	{
		return (sum+0.02*sum); //returns the 2% of the sum added to the sum-thus, the return Amount
	}
}

class SBI extends Bank
{
	int getRate(int sum, int days)
	{
		int s=sum;
		int d=days;
		super.getRate(s,d);

		if(s<20000000 && d>7&&d<45)
		{
			return (s+(0.03*s));
		}
		else if(s<20000000 && d>45&&d<90)
		{
			return (s+(0.0405*s));
		}
		else if(s<20000000 && d>90&&d<180)
		{
			return (s+(0.041*s));
		}
		else
		{
			System.out.println("WRONG INPUT PARAMETERS!");
			return -1;
		}

	}
}
class ICICI extends Bank
{
	int getRate(int sum, int days)
	{
		int s=sum;
		int d=days;
		super.getRate(s,d);

		if(s<20000000 && d>7&&d<14)
		{
			return (s+(0.031*s));
		}
		else if(s<20000000 && d>14&&d<30)
		{
			return (s+(0.032*s));
		}
		else if(s<20000000 && d>30&&d<45)
		{
			return (s+(0.035*s));
		}
		else if(s<20000000 && d>45&&d<90)
		{
			return (s+(0.045*s));
		}
		else if(s<20000000 && d>90&&d<120)
		{
			return (s+(0.047*s));
		}
		else if(s<20000000 && d>120&&d<180)
		{
			return (s+(0.049*s));
		}
		else
		{
			System.out.println("WRONG INPUT PARAMETERS!");
			return -1;
		}
		
	}
}
class AXIS extends Bank
{
	int getRate(int sum, int days)
	{
		int s=sum;
		int d=days;
		super.getRate(s,d);

		if(s<20000000 && d>7&&d<30)
		{
			return (s+(0.0315*s));
		}
		else if(s<20000000 && d>30&&d<45)
		{
			return (s+(0.0345*s));
		}
		else if(s<20000000 && d>45&&d<90)
		{
			return (s+(0.0405*s));
		}
		else if(s<20000000 && d>90&&d<90)
		{
			return (s+(0.0405*s));
		}
		else
		{
			System.out.println("WRONG INPUT PARAMETERS!");
			return -1;
		}
		
	}
}



SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Calendar c = Calendar.getInstance();
c.setTime(new Date()); // Using today's date
c.add(Calendar.DATE, 5); // Adding 5 days
String output = sdf.format(c.getTime());
System.out.println(output);

