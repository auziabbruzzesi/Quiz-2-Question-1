package base;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestClass{
	static Calculation testa = new Calculation(50,20,536.8,14,15);
	Calculation testb = new Calculation(45000,10,Calculation.totalcost(45000, 10),20,30);
	public static void tests(){
		
		assertTrue(Calculation.totalcost(50, 20)==536.8);


	
		
		
		
	
		
}
	
}


