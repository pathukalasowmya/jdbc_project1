package designingpatterns;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 =  Employee.getinstance();
	    Employee e2 =  Employee.getinstance();
        e1.EmployeeId();
       
        
        
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1 == e2);
	}

}


