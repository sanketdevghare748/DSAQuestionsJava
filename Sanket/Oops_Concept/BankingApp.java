package Sanket.Oops_Concept;

public class BankingApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Login or sign up for banking
		//Create  a new user and return a user id for him, and password to login
		//fetch the balance from user id after login
		//credit in the account acccount
		//debit from the account
		//transfer the amount to another user based on the id
		//passbook
		
		while(true)
		{
		AccountDetails user1= new AccountDetails();
		user1.isaccountExists();
		System.out.println("If you want to quit press 0, OR press 1 to continue to use Bank.");
		int quit=user1.sc.nextInt();
		if(quit==0) {
			System.out.println("Exiting from Banking application.");
			user1.login();
		}
		else
			continue;
		}
	}

}
