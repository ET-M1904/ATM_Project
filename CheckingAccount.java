import java.util.*;
import java.io*;



public class CheckingAccount implements HasMenu, Serializable{


	public static void main(string[] args) {
		CheckingAccount ca = new CheckingAccount();
		ca.start();	
	}

	public CheckingAccout(){
		this.Balance = 0d;
	}

	public CheckingAccount(double Balance){
		this.Balance = Balance;
	}

	public void Start(){
		boolean keepGoing = true;
		while(keepGoing){
			String response = menu();
			if (reponse.equals("0")){
				keepGoing = false;
			}
			else if (response.equals("1")){
				System.out.println("Checking balance...");
				this.checkBalance();
			}
			else if (response.equals("2")){
				System.out.println("Making a deposit...");
				this.makeDeposit();
			}
			else if (repsonse.equals("3")){
				System.out.println("Making a withdrawal...");
				this.makeWithdrawal();
			}
			else {
				System.out.println("Invalid input.");
			}
		}
	}
		
	public double getBalance(){
		return this.Balance;
	}


	public String getBalanceString(){
		return String.format("$%.2f", this.Balance);
	}
	public void checkBalance(){
		System.out.println("Current balance: " + this.getBalance());
	}

	private double getDouble(){
		Scanner input = new Scanner(System.in);
		String sResult = input.nextLine();
		double result = 0d;
		try {
			result = Double.parseDouble(sResult);
		}
		catch(Exception e) {
			System.out.println("Not a legal input. Changing to zero.");
			result = 0d;
		}
		return result;
	}

	public void makeDeposit(){
		System.out.print("How much to deposit? ");
		double deposit = this.getDouble();
		this.Balance += deposit;
		System.out.println("New balance: " + this.getBalanceString());
	}

	public void makeWithdrawal(){
		System.out.print("How much to withdrawal? ");
		double withdrawal = this.getDouble();
		if (withdrawal > this.Balance){
			System.out.println("Insufficient funds");
		}
		else {
			this.Balance -= withdrawal;
			System.out.println("New balance: " + this.getBalanceString());
		}
	}

}



