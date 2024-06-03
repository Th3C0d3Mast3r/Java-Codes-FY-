class Person
{
	String name;
	String dates;
}
class Doctor extends Person
{
	int fees=20000;
	int income;
}
class Patient extends Person
{
	Doctor d=new Doctor(); //this is the Doctor object, as desired 	
}
class Billing
{
	
}

class DriverClass
{
	
}