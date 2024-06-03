import java.util.*;
class HospitalCode 
{
	public static void main(String[] args) {	
		Doctor d1 = new Doctor();

		Scanner obj=new Scanner(System.in);

		d1.setFees(5000);
		d1.setName("Dr. ABCDEF");
		System.out.println("Enter the DISCHARGE DATE below(in DD_MM_YYYY format):-");
		int dates=obj.nextInt();
		int month=obj.nextInt();
		int year=obj.nextInt();

		d1.setDate(dates, month, year);
		d1.printDetails();
		
		Patient p1 = new Patient();
		p1.setDoc(d1);
		System.out.println("Enter the ADMITTING DATE below(in DD_MM_YYYY format):-");
		dates=obj.nextInt();
		month=obj.nextInt();
		year=obj.nextInt();
		p1.setDate(dates, month, year);
		//p.printDetails();
		
		Billing b1 = new Billing();
		b1.setDoc(d1);
		b1.setPatient(p1);
		b1.printBillingDetails();
	
		System.out.println();
	
		d1.printDetails();

		Patient p2 = new Patient();
		p2.setDoc(d1);
		System.out.println("Enter the ADMITTING DATE below(in DD_MM_YYYY format):-");
		dates=obj.nextInt();
		month=obj.nextInt();
		year=obj.nextInt();
		p1.setDate(dates, month, year);
		//p.printDetails();
		
		Billing b2 = new Billing();
		b2.setDoc(d1);
		b2.setPatient(p2);
		b2.printBillingDetails();
		
		System.out.println();
	
		d1.printDetails();
	
	}
}

class Person {
	private String name, date;
	private int day, month, year;
	Person() {
		name = "Person";
		day = 11; month = 9; year = 2001;
		date = day + "/" + month + "/" + year;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		date = day + "/" + month + "/" + year;
	}
	
	String getName() {
		return name;
	}
	
	int getDay() {
		return day;
	}
	int getMonth() {
		return month;
	}
	int getYear() {
		return year;
	}
	
	String getDate() {
		return date;
	}
	
	void printDetails() {
		System.out.printf("Date: %s\n", date);
		System.out.printf("Name: %s\n", name);
	}
}

class Patient extends Person {
	static int patientNo=0;
	private int day, month, year;
	private String dischargeDate;
	Doctor doc;
	
	Patient() {
		patientNo++;
	}
	
	void setDoc(Doctor d) {
		doc = d;
	}
	
	void printDetails() {
		int aDays = (super.getYear() * 365) + (super.getMonth() * 30) + (super.getDay());
		int dDays = (doc.getYear() * 365) + (doc.getMonth() * 30) + (doc.getDay());
		int daysAdmitted = dDays - aDays;
		
		System.out.printf("Patient No: %d\n", patientNo);
		System.out.printf("Name: %s\n", super.getName());
		System.out.printf("Admit Date: %s\n", super.getDate());
		System.out.printf("Disharge Date: %s\n", doc.getDate());
		System.out.printf("Number of Days Admitted: %d\n", daysAdmitted);
	}
}

class Doctor extends Person {
	private int fees, income;
	
	Doctor() {
		fees = 2000;
		income = 0;
	}
	
	void setFees(int fees) {
		this.fees = fees;
	}
	
	int getFees() {
		return fees;
	}
	
	void setIncome(int income) {
		this.income += income;
	}
	
	int getIncome() {
		return income;
	}
	
	void printDetails() {
		System.out.printf("Doctor Name: %s\n", getName());
		System.out.printf("Fees per Day: %d\n", getFees());
		System.out.printf("Income: %d\n\n", getIncome());
	}
}

class Billing {
	Doctor d;
	Patient p;
	
	void setDoc(Doctor d) {
		this.d = d;
	}
	void setPatient(Patient p) {
		this.p = p;
	}
	
	void printBillingDetails() {
		int aDays = (p.getYear() * 365) + (p.getMonth() * 30) + (p.getDay());
		int dDays = (d.getYear() * 365) + (d.getMonth() * 30) + (d.getDay());
		int daysAdmitted = dDays - aDays;
		
		System.out.printf("Patient No: %d\n", p.patientNo);
		System.out.printf("Name: %s\n", p.getName());
		System.out.printf("Admit Date: %s\n", p.getDate());
		System.out.printf("Disharge Date: %s\n", d.getDate());
		System.out.printf("Number of Days Admitted: %d\n", daysAdmitted);
		System.out.printf("Doctor Fees: %d\n", daysAdmitted * d.getFees());
		System.out.printf("Admittance Fees: %d\n", daysAdmitted * 2000);
		System.out.printf("Total Fees: %d\n", (daysAdmitted * d.getFees()) + (daysAdmitted * 2000));
		d.setIncome(daysAdmitted * d.getFees());
	}
}