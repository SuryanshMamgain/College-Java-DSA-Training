import java.util.Scanner;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Date;
class Employee
{
	private float basicsalary;
	private float HRA=basicsalary*0.3f;
	private float DA=basicsalary*0.1f;
	private float TA=basicsalary*0.2f;
	private float MA=basicsalary*0.15f;
	private float PF=basicsalary*0.1f;
	private float grosssalary;
	private String employeename;
	private int employeeID;
	private String employeeemail;
	private float netsalary;
	private float Tax;
	
	
	Employee(String employeename,float basicsalary)
	{
		this.employeename=employeename;
		this.basicsalary=basicsalary;
	}
	Employee(float basicsalary,String employeename,int employeeID, String employeeemail)
	{
		this(employeename,basicsalary);
		this.employeeID=employeeID;
		this.employeeemail=employeeemail;
				
	}
	public float getBasicsalary() {
		return basicsalary;
	}
	public float getHRA() {
		return HRA;
	}
	public float getDA() {
		return DA;
	}
	public float getTA() {
		return TA;
	}
	public float getGrosssalary() {
		return grosssalary;
	}
	void calculate() {
		HRA=basicsalary*0.3f;
		DA=basicsalary*0.1f;
		TA=basicsalary*0.2f;
		MA=basicsalary*0.15f;
		PF=basicsalary*0.1f;
	}
	void calculateTax()
	{
		
		grosssalary=basicsalary+HRA+DA+TA+MA-PF;
		netsalary=grosssalary-Tax;
		
		
		if (basicsalary>=900000.0){
	        Tax=grosssalary*30/100;
	    }
	    else if (basicsalary<900000.0 && basicsalary>=700000.0){
	        Tax=grosssalary*20/100;
	    }
	    else if (basicsalary<700000.0 && basicsalary>=500000.0) {
	    	Tax=grosssalary*10/100;
	    }
	    else{
	        Tax=grosssalary*30/100;
	    }
		
	}
	void show()
	{
		Date date=new Date();
		Locale locale=new Locale("hi","IN");
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT,locale);
		
		
		
		System.out.println("______________________________________________________________________");
	    System.out.println();
	    System.out.println("                          SALARY SLIP                           ");
	    System.out.println("______________________________________________________________________");
	    System.out.println();
	    System.out.println("Employee name: "+employeename);	
	    System.out.println("Employee ID: "+employeeID);
	    System.out.println("Date: "+df.format(date));
	    System.out.println("______________________________________________________________________");
	    System.out.println("EARNINGS                  AMOUNT");
	    System.out.println("______________________________________________________________________");
	    System.out.println();
	    System.out.println("Basic Salary:             "+nf.format(basicsalary));
	    System.out.println("______________________________________________________________________");
	    System.out.println("House Rent Allowance:     "+nf.format(HRA));
	    
	    System.out.println("Dearness Allowance:       "+nf.format(DA));
	    
	    System.out.println("Transport Allowance:      "+nf.format(TA)); 
	    
	    System.out.println("Provident Fund:           "+nf.format(PF));
	    System.out.println("______________________________________________________________________");
	    System.out.println();
	    System.out.println("Gross Salary:             "+nf.format(grosssalary));
	    System.out.println("______________________________________________________________________");
	    System.out.println();
	    System.out.println("Tax:                      "+Tax);
	    System.out.println("NET Salary:               "+nf.format(netsalary));
	    
	    
	}
	
}	
