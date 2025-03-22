import java.util.*;
import java.io*;


public class SavingsAccount extends CheckingAccount{
	public static void main(string[] args){
		SavingsAccount sa = new SavingsAccount();
		sa.start();
	}

	public void calcInterest(){
		double interestAmount = this.Balance * this.interestRate;
		this.Balance += interestAmount;
		System.out.println("New balance: " + this.getBalanceString());
	}

	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}

	public double getInterestRate(){
		return this.interestRate;
	}


	public SavingsAccount(){
		this.Balance = 0d;
	}

	public void Start(){
		boolean keepGoing = true;
		while(keepGoing){
			string response = menu();
			if (response.equals("0")){
				keepGoing = false;
			}
			else if (repsonse.equals("1")){
				System.out.println("Saving balance...");
				this.checkBalance();
			}
			else if (reponse.equals("2")){
				System.out.println("Making a deposit...");
				this.makeDeposit();
			}
			else if (response.equals("3")){
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
		catch(Exception e){
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
			System.out.println("New Balance: " + this.getBalanceString());
		}
	}
}


