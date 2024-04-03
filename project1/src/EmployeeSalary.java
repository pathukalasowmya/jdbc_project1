import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter Employee Id");
     int EmployeeId = input.nextInt();
     System.out.println("Enter Employee Name");
     String EmployeeName = input.next();   
     
     
     
     System.out.println("Enter Basic Salary");
     double basic =input.nextDouble();
     
     double HRA = 0.02*basic;// (basic*2)/100
     double PF = 0.03*basic;
     double TA =  0.01*basic;
     double ESI= 0.025*basic;
     double DA = 0.05*basic;
     double ta = 0.01*basic;
     double pt = 0.02*basic;
     double grosspay = basic+HRA+PF+ESI+DA+ta+pt;
     double netpay = grosspay - PF-pt;
     
     System.out.println("EmployeeSalary:" +basic);
     System.out.println("Basic:" + basic);
     System.out.println("HRA:"+ HRA);
     System.out.println("PF:"+PF);
     System.out.println("ESI:"+ESI);
     System.out.println("Da:"+DA);
     System.out.println("ta:"+ TA);
     System.out.println("pt:"+ pt);
     System.out.println("grosspay:" +grosspay);
     System.out.println("netpay:"+netpay);
     input.close();
     

    

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

	}

}
