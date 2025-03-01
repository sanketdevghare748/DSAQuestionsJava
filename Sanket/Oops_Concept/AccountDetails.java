package Sanket.Oops_Concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AccountDetails {
	private static String username = "";
	private static String password = "";
	static HashMap<String, List<String>> UserDetail = new HashMap<>();
	static HashMap<String, String> UserCredentials = new HashMap<>();
	static HashMap<String, Double> UserCurrentBalance = new HashMap<>();
	
	private static int account_Number = 1000;
	private static String account_number = "";
	private static double current_balance = 0;
	static String temp_account_number="";

	static Scanner sc = new Scanner(System.in);

	public static void isaccountExists() {
		System.out.println("Enter your account number to check if account exitst: ");
		temp_account_number=sc.next();
		if (!UserDetail.containsKey(temp_account_number)) {
			System.out.println(
					"Your acccount does not exitst, please create new account. would you proceed to create account now (Y/N)? ");
			String is_CreatAccount = sc.next();
			if (is_CreatAccount.equalsIgnoreCase("Y")) {
				create_new_Account();
			} else {
				System.out.println("Thanks for visiting..");

			}

		}
		else
			login();
	}

	public static void create_new_Account() {
		System.out.println("Enter name:");
		String Name = sc.next();
		List<String> list = new ArrayList<String>();
		System.out.println("Enter Age:");
		String Age = sc.next();
		list.add(Name);
		list.add(Age);
		account_number = "BANK" + Integer.toString(account_Number + 1);

		System.out.println("Enter user name:");
		username = sc.next();
		System.out.println("Enter password:");
		password = sc.next();
		UserCredentials.putIfAbsent(username, password);
		list.add(username);
		UserDetail.put(account_number, list);

		// Add balance as zero
		UserCurrentBalance.put(account_number, 0.0);

		System.out.println(
				"Dear " + Name + " , user creation is successfull, please find your account number as : ******* "
						+ account_number + " *******");
		System.out.println("Would you like to login (Y/N)? ");

		String islogin = sc.next();
		if (islogin.equals("Y")) {
			login();
		} else
			System.out.println("Thanks for visiting.");
			isaccountExists();

	}

	public static void login() {
		String tocontinue = "Y";
		while (tocontinue.equalsIgnoreCase("Y")) {
				System.out.println("Enter user name:");
				username = sc.next();
				System.out.println("Enter password:");
				password = sc.next();

				// Check if credentials are valid or not.
				if (UserCredentials.containsKey(username)) {
					if (UserCredentials.get(username).contentEquals(password)) {
						System.out.println("You are successfully logged in.");
						break;
					} else
						System.out.println("Enter correct password.");
				} else
					System.out.println("Invalid username, enter valid username and password.");
				System.out.println("would you like to continue (Y/N) ?");
				tocontinue = sc.next();
			}
		while (true) {
			System.out.println("Press required option: 1.To see balance. 2. Credit  3. Debit   4. Logout");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				fetch_Curren_balance(account_number);
				continue;
			case 2:
				System.out.println("Enter amount to be credited= ");
				double credit_amount = sc.nextDouble();
				credit(account_number, credit_amount);
				continue;
			case 3:
				System.out.println("Enter amount to be debited= ");
				double debit_amount = sc.nextDouble();
				debit(account_number, debit_amount);
				continue;
			case 4:
				System.out.println("Logging out from your account.");
				return;
			default:
				System.out.println("Enter valid options..");
				continue;
			}
		}

	}

	private static void debit(String account_number, double debit_amount) {
		// TODO Auto-generated method stub
		if (current_balance < debit_amount) {
			System.out.println("You do not have sufficient balance. your current balance is= *** " + current_balance);

		} else {
			current_balance = UserCurrentBalance.get(account_number) - debit_amount;
			UserCurrentBalance.put(account_number, current_balance);
			System.out.println(debit_amount + " has been debited successfully and now your current balance is= *** "
					+ UserCurrentBalance.get(account_number));
		}

	}

	private static void credit(String account_number, double credit_amount) {
		// TODO Auto-generated method stub
		current_balance = UserCurrentBalance.get(account_number) + credit_amount;
		UserCurrentBalance.put(account_number, current_balance);
		System.out.println(credit_amount + " has been credit successfully and now your current balance is =*** "
				+ UserCurrentBalance.get(account_number));

	}

	private static void fetch_Curren_balance(String account_number) {
		// TODO Auto-generated method stub
		System.out.println("Current balance for account number " + account_number + " is *** "
				+ UserCurrentBalance.get(account_number));
	}

}
