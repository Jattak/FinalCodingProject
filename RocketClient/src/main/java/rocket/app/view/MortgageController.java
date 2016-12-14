package rocket.app.view;

import eNums.eAction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import rocket.app.MainApp;
import rocketCode.Action;
import rocketData.LoanRequest;

public class MortgageController {

	private MainApp mainApp;
	
	//	DONE - RocketClient.RocketMainController
	
	//	Create private instance variables for:
	//		TextBox  - 	txtIncome
			@FXML
			Label txtIncomeLbl = new Label ("Salary");
			TextField txtIncome = new TextField();
			
	//		TextBox  - 	txtExpenses
			@FXML
			Label txtExpensesLbl = new Label ("Debt Obligations");
			TextField txtExpenses = new TextField();
			
	//		TextBox  - 	txtCreditScore
			@FXML
			Label txtCreditScoreLbl = new Label ("Credit Score");
			TextField txtCreditScore = new TextField();
			
	//		TextBox  - 	txtHouseCost
			@FXML
			Label txtHouseCostLbl = new Label ("House Cost");
			TextField txtHouseCost = new TextField();
			
	//		ComboBox -	loan term... 15 year or 30 year
			@FXML
			ComboBox<Integer> LoanTermCmb = new ComboBox<Integer> ();
			
	//		Labels   -  various labels for the controls
			@FXML
			Label MorgagePaymentLbl = new Label ("Mortgage Payment");
			Label MessageLbl = new Label ("Error/Try Again");
			
	//		Button   -  button to calculate the loan payment
			@FXML
			Button calculateButton = new Button ("Calculate");
			
	//		Label    -  to show error messages (exception throw, payment exception)
			@FXML
			Label errorLbl = new Label ("Error, try again");

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	
	// RocketClient.RocketMainController
	//			Call this when btnPayment is pressed, calculate the payment
	@FXML
	public void btnCalculatePayment(ActionEvent event)
	{
		Object message = null;
		// RocketClient.RocketMainController
		
		Action a = new Action(eAction.CalculatePayment);
		LoanRequest lq = new LoanRequest();
		//	JUST LEFT IF CAUSE I DIDN'T KNOW WHAT TO DO - RocketClient.RocketMainController
		//			set the loan request details...  rate, term, amount, credit score, downpayment
	
		//			I've created you an instance of lq...  execute the setters in lq
		
		// I Didn't know what to do here.
		a.setLoanRequest(lq);
		
		//	send lq as a message to RocketHub		
		mainApp.messageSend(lq);
	}
	
	public void HandleLoanRequestDetails(LoanRequest lRequest)
	{
		//	JUST LEFT IF CAUSE I DIDN'T KNOW WHAT TO DO - RocketClient.HandleLoanRequestDetails
		//			lRequest is an instance of LoanRequest.
		//			after it's returned back from the server, the payment (dPayment)
		//			should be calculated.
		//			Display dPayment on the form, rounded to two decimal places
		
		 // I Didn't know what to do here.
	}
}
