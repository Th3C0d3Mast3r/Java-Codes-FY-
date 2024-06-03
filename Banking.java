import java.util.*;

// Bank class serves as a base class for different banks
class Bank {
	// Default method to get the rate of interest for a generic bank
	double get_rate_of_interest() {
		return 2.0;
	}
}
// SBI_Bank class extends Bank and provides implementation for interest rates specific to SBI bank
class SBI_Bank extends Bank {
	// Overridden method to get the rate of interest based on the number of days
	double get_rate_of_interest(int days) {
		if (days >= 7 && days <= 14) {
			return 3.00;
		} else if (days >= 15 && days <= 30) {
			return 3.00;
		} else if (days >= 31 && days <= 45) {
			return 3.00;
		} else if (days >= 46 && days <= 90) {
			return 4.05;
		} else if (days >= 91 && days <= 120) {
			return 4.10;
		} else if (days >= 121 && days <= 180) {
			return 4.10;
		}
		
		return super.get_rate_of_interest(); // Calls the parent class method if conditions aren't met
	}
}

// ICICI_Bank class extends Bank and provides implementation for interest rates specific to ICICI bank
class ICICI_Bank extends Bank {
	// Overridden method to get the rate of interest based on the number of days
	double get_rate_of_interest(int days) {
		if (days >= 7 && days <= 14) {
			return 3.10;
		} else if (days >= 15 && days <= 30) {
			return 3.20;
		} else if (days >= 31 && days <= 45) {
			return 3.50;
		} else if (days >= 46 && days <= 90) {
			return 4.50;
		} else if (days >= 91 && days <= 120) {
			return 4.70;
		} else if (days >= 121 && days <= 180) {
			return 4.90;
		}
		
		return super.get_rate_of_interest(); // Calls the parent class method if conditions aren't met
	}
}

// AXIS_Bank class extends Bank and provides implementation for interest rates specific to AXIS bank
class AXIS_Bank extends Bank {
	// Overridden method to get the rate of interest based on the number of days
	double get_rate_of_interest(int days) {
		if (days >= 7 && days <= 14) {
			return 3.15;
		} else if (days >= 15 && days <= 30) {
			return 3.15;
		} else if (days >= 31 && days <= 45) {
			return 3.45;
		} else if (days >= 46 && days <= 90) {
			return 4.05;
		} else if (days >= 91 && days <= 120) {
			return 4.70;
		} else if (days >= 121 && days <= 180) {
			return 5.00;
		}
		return super.get_rate_of_interest(); // Calls the parent class method if conditions aren't met
	}
}
class Banking
{
	public static void main(String[] args) {
			// Creating instances of different banks
			SBI_Bank sbiBank = new SBI_Bank();
			ICICI_Bank iciciBank = new ICICI_Bank();
			AXIS_Bank axisBank = new AXIS_Bank();
			// Setting initial principal amounts for each bank
			double principalSBI = 10000;
			double principalICICI = 12500;
			double principalAXIS = 20000;
			
			// Taking input for the number of days for deposit in each bank
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of days for deposit in SBI: ");
			int SBIdays = sc.nextInt();
			System.out.print("Enter number of days for deposit in ICICI: ");
			int ICICIdays = sc.nextInt();
			System.out.print("Enter number of days for deposit in AXIS: ");
			int AXISdays = sc.nextInt();
			
			// Calculating the final amount after interest for each bank
			double amountSBI = calculateAmount(principalSBI, sbiBank.get_rate_of_interest(SBIdays),
			SBIdays);
			double amountICICI = calculateAmount(principalICICI,
			iciciBank.get_rate_of_interest(ICICIdays), ICICIdays);
			double amountAXIS = calculateAmount(principalAXIS, axisBank.get_rate_of_interest(AXISdays), AXISdays);
			// Formatting output for display
			System.out.println("\n");
			String sbiformat = String.format("%.2f", amountSBI);
			String iciciformat = String.format("%.2f", amountICICI);
			String axisformat = String.format("%.2f", amountAXIS);
			System.out.println("\n");
			// Displaying the final amounts for each bank
			System.out.println("Amt SBI Bank after " + SBIdays + " days: " + sbiformat);
			System.out.println("Amt from ICICI Bank after " + ICICIdays + " days: " + iciciformat);
			System.out.println("Amt AXIS Bank after " + AXISdays + " days: " + axisformat);
		}
		
		// Method to calculate the final amount after interest
		private static double calculateAmount(double principal, double rateOfInterest, int days) {
			Calendar today = Calendar.getInstance();
			Calendar maturityDate = (Calendar) today.clone();
			maturityDate.add(Calendar.DAY_OF_YEAR, days);
			double monthlyRate = rateOfInterest / 1200.0;
			double amount = principal * Math.pow(1 + monthlyRate, days / 30.0);
			
			// Printing maturity date for the deposit
			System.out.println("Maturity date: " + maturityDate.getTime());
			return amount; // Returning the final amount
		}
}