//****************************************************************PAYMENT-CLASS******************************************************************************//
package EHMS;

import java.util.*;
/***********************************************************************************************/ 
public class Payment 
{
	Scanner input=new Scanner(System.in);
	public String CreditCardDetails(int fee)//THIS METHOD TAKES THE CREDIT CARD DETILS OF THE PATIENT 
	{
		String Status;
		System.out.println("         CARD-HOLDER Name : ");
		String cardHolderName=input.next();
		System.out.println("         CARD-NUMBER : ");
		int card_no=input.nextInt();
		System.out.println("         EXPIRY DATE : ");
		String ExpiryDate=input.next();
		System.out.println("         CVC number: ");
		int cvc=input.nextInt();
		System.out.println("Please Enter 1 to confirm Payment---");
		int x=input.nextInt();
		if(x==1)
		{
			System.out.println("Your Payment is confirmed");
			return "Payed";
		}
		else
		{
			System.out.println("Your Appointment is cancelled");
			return "NotPayed";
		}
	}
}
/***********************************************************************************************/ 
