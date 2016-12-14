package rocketBase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.formula.functions.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import exceptions.RateException;
import rocketDomain.RateDomainModel;
import util.HibernateUtil;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) throws RateException {
		// - RocketBLL RateBLL.getRate - make sure you throw any exception
		ArrayList <RateDomainModel> Ratelist = Rate.getAllRates() ; //Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		for (RateDomainModel RDM : Ratelist){
			double GCSrate = (Double) null;
			if (GivenCreditScore >= RDM.getiMinCreditScore()){
				GCSrate = RDM.getdInterestRate();
				break;	}
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
			if (GCSrate == 0){
				throw new RateException();	}
		// - RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate
			return GCSrate; }
		}
	
	
	//	Didn't seem like it needed much work or changes, RocketBLL RateBLL.getPayment 
	//	how to use: https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
