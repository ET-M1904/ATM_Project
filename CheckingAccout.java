import java.util.*;
import java.io*;



public class CheckingAccount implements HasMenu, Serializable{
	double Balance;

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
		void Start(){
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
					System.out.println("Making a withdrawal...")

