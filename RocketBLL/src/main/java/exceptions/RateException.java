package exceptions;

public class RateException extends Exception {

	// RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	int GivenCreditScore;
	
	public RateException (int RateRomainModel ) {
		GivenCreditScore = RateRomainModel; }
	
//	* Create a getter (no setter, set value only in Constructor)
	public int getGivenCreditScore() {
		return GivenCreditScore; }
	
}
