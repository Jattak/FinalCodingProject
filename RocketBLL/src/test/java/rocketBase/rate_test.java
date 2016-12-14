package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

public class rate_test {

	// RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	@Test
    public void sameRateTest() {
		double testRate = double getRate(800); 
		assertNotSame(testRate,5); //Got the rates from the SQL file to test it
	}
	
	// - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void Exceptiontest() {
		Object testGCS = null ; 
		// I want to check and see if an Exerption is thrown with an assert with a true or false
		assertException (getRate(testGCS));
	}

}
