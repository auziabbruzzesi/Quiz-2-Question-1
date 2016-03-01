package base;

public class Main {			
	private static double tuitionCost = Query.ask_for_input("What is the cost of tuition: ");	
	private static double percentIncrease = Query.ask_for_input("What is the annual % increase for tuition?");										
	private static double interestForLoan = Query.ask_for_input("What is the fixed APR for loan?");	
	private static double paybackTerm = Query.ask_for_input("How long will you be paying back loans?");
							
									

	public static void main(String[] args) {
		System.out.print("Total Cost of Tuition to Complete Degree: " + Calculation.totalcost(tuitionCost,percentIncrease)+"\n");
		System.out.print("Monthly Payment for Student Loan: " + Calculation.monthlyPayment(Calculation.totalcost(tuitionCost, percentIncrease), interestForLoan, paybackTerm)+"\n");
		
	}
}