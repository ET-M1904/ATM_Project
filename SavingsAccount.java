import java.util.*;
import java.io*;


public class SavingsAccount extends CheckingAccount implements HasMenu, Serializable{
	public static void main(string[] args){
		SavingsAccount sa = new SavingsAccount();
		sa.start();
	}

	public SavingsAccount(){
		this.Balance = 0d;
	}

	public void Start(){
		boolean keepGoing = true;
		while(keepGoing){
			string response = menu();

