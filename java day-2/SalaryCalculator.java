import java.util.Scanner;
class SalaryCalculator
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("______________________________________________________________________");
    System.out.println();
    System.out.println("                          SALARY SLIP                           ");
    System.out.println("______________________________________________________________________");
    System.out.println();
    System.out.print("Employee name: ");
    String name=sc.nextLine();
    System.out.print("Employee ID: ");
    int id=Integer.parseInt(sc.nextLine());
    System.out.println();
    System.out.println("______________________________________________________________________");
    System.out.println("EARNINGS                  AMOUNT");
    System.out.println("______________________________________________________________________");
    System.out.println();
    System.out.print("Basic Salary:             ");
    float BS=Float.parseFloat(sc.nextLine()); //BS-BAsic Salary
    float HRA=BS*30/100;//HRA-House Rent Allowance
    float DA=BS*10/100;//DA-Dearness Allowance
    float TA=BS*20/100;//TA-Transport Allowance
    float PF=BS*15/100;//PF-Provident Fund
    float GS=BS+HRA+DA+TA-PF;//GS-Gross Salary
    float Tax;
    if (BS<=500000.0){
        Tax=GS*10/100;
    }
    else if (BS>500000.0 && BS<=700000.0){
        Tax=GS*20/100;
    }
    else{
        Tax=GS*30/100;
    }
    float NS=GS-Tax;//NS-Net Salary
    sc.close();
    System.out.println("______________________________________________________________________");
    System.out.println("House Rent Allowance:     "+HRA);
    
    System.out.println("Dearness Allowance:       "+DA);
    
    System.out.println("Transport Allowance:      "+TA); 
    
    System.out.println("Provident Fund:           "+PF);
    System.out.println("______________________________________________________________________");
    System.out.println();
    System.out.println("Gross Salary:             "+GS);
    System.out.println("______________________________________________________________________");
    System.out.println();
    System.out.println("Tax:                      "+Tax);
    System.out.println("NET Salary:               "+NS);
}
}