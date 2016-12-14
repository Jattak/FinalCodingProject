package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	// RocketDAL rate_test
	//		Check to see if a known credit score returns a known interest rate
	@Test
	public void testAssertSame() {
		double aRate = getRate(700);
		assertSame(getRate(700), 4);
	}

	
	
	// - RocketDAL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	(expected = RateException.class)
	public boolean testRateException() {
		Object noRate = getRate();
		if ((boolean) (noRate = 0)){
			return true;
		}
		
		
	};
	
	
	
	
	@Test
	public void test() {
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		System.out.println ("Rates size: " + rates.size());
		assert(rates.size() > 0);
		
		assert(1==1);
	}

}
