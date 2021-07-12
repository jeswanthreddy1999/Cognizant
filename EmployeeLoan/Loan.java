
public class Loan {
	
	//Implement the below method 
	double lone=0.0;
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee){
		     lone=(employeeObj.getSalary()*15.0)/100.0;
		}
		else if(employeeObj instanceof TemporaryEmployee){
		     lone=(employeeObj.getSalary()*10.0)/100.0;
		}
		return lone;
	}

}
