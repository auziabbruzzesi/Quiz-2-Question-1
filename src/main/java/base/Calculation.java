package base;

public class Calculation {
	//returns complete total of money paid back after student loans are paid off
	//returns monthly $ amount to pay back loans
	public static double totalcost(double tuition, double annualIncrease){
		int yearsOfSchool = 4;
		double tuitionPerYear = tuition * 2;
		double borrowed = 0;
		int x;
		
		for(x = 0;x < yearsOfSchool;x++){
			borrowed = borrowed + tuitionPerYear;
			tuitionPerYear = tuitionPerYear+(tuitionPerYear * (annualIncrease/100));
		}
		return borrowed;
	}
	public static double monthlyPayment(double principal,double apr, double termYears){
		double n = termYears * 12;
		double numerator = apr*Math.pow((1+apr), n);
		double denominator = Math.pow((1+apr), n)-1;
		return principal*((numerator)/(denominator));
		
	}
	public Calculation(double tuition,double annualIncrease,double principal, double apr, double termYears){
		totalcost(tuition, annualIncrease);
		monthlyPayment(principal, apr, termYears);
	}
}
