class Person{
	String name;
	int age;
	Person(){
		
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}	
}
class ITEmployee extends Person{
	int emp_id;
	String company_name;
	double salary;
	ITEmployee(String name,int age,int emp_id,double salary){
		super(name,age);
		this.emp_id=emp_id;
		this.salary=salary;
		company_name="Suryansh Technology";
		
	}
	void printEmployee() {
		System.out.println("Company Name: "+company_name);
		System.out.println("Employee name: "+name+" Employee id: "+emp_id+" Employee salary: "+salary);
		
	}
}
class FullTimeEmployee extends ITEmployee{
	double pf;
	double bonus;
	FullTimeEmployee(String name,int age,int emp_id,double salary) {
		super(name,age,emp_id,salary);
	}
	void computePF() {
		this.pf=salary*0.5;
		System.out.println("PF: "+pf);
	}
	void computeBonus() {
		this.bonus=salary*0.8;
		System.out.println("Bonus: "+bonus);
	}
	@Override
	void printEmployee() {
		super.printEmployee();
		computePF();
		computeBonus();
	}
}
class PartTimeEmployee extends ITEmployee{
	int noOfhours;
	PartTimeEmployee(String name,int age,int emp_id,double salary,int noOfhours) {
		super(name,age,emp_id,salary);
		this.noOfhours=noOfhours;
	}
	@Override
	void printEmployee() {
		super.printEmployee();
		System.out.println("No. of Hours: "+noOfhours);
	}
	void computeAtt()
	{
		System.out.println("Hourly Basis");
	}
}
class Freelancer extends ITEmployee{
	String project;
	int duration;
	Freelancer(String name,int age,int emp_id,double salary,String project,int duration){
		super(name,age,emp_id,salary);
		this.project=project;
		this.duration=duration;
	}
	@Override
	void printEmployee() {
		super.printEmployee();
		System.out.println("Project name:  "+project);
		System.out.println("Duration: "+duration);
	}
	void rating()
	{
		System.out.println("A");
	}
}

class Customer extends Person{
	String order;
	Customer(String name,int age,String order) {
		super(name,age);
		this.order=order;
	}
}
class Caller{
	void callEmployee(ITEmployee employee) {
		employee.printEmployee();
		if (employee instanceof FullTimeEmployee) {
			FullTimeEmployee fte=(FullTimeEmployee) employee;
			fte.computeBonus();
			fte.computePF();
		}
		if (employee instanceof PartTimeEmployee) {
			((PartTimeEmployee)employee).computeAtt();
		}
		
		if (employee instanceof Freelancer) {
			((Freelancer)employee).rating();
		}
		System.out.println("***********************************************************");
	
	}
}
class TestEmp{
	
	public static void main(String[] args) {
		Caller caller=new Caller();
		caller.callEmployee(new	PartTimeEmployee("Ramesh",25,1001,50000,20));
		caller.callEmployee(new	FullTimeEmployee("Suresh",28,1002,70000));
		caller.callEmployee(new	Freelancer("Rohit",21,1003,47000,"Dog Vision",45));
		
		
		
	}
}