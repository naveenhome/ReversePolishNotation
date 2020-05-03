package csd.may;


import junit.framework.*;

public class TestRPNCalc extends TestCase {
	
public void testRPN1()
{
	String expr = "2,2,+";
	RPNCalc rpnCalc = new RPNCalc();
	assertEquals(4, rpnCalc.Calculate(expr));
			
}
public void testRPN2()
{
	String expr = "2,3,+";
	RPNCalc rpnCalc = new RPNCalc();
	assertEquals(5, rpnCalc.Calculate(expr));
			
}



// 2,2,+; 2,2; " "; 2,+,2; +,2,2, 2,2,+,2, 2,2,2,+,+, 
}
