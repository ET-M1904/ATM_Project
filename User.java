import java.util.*;
import java.io*;



public abstract class User implements HasMenu, Serializable{
	String userName = "";
	String PIN = "";

	public boolean login(){
		Scanner input = new Scanner(System.in);
		boolean result = false;
		System.out.print("User name: ");
		String userName = input.nextLine();

		if (userNameIn.equals(this.userName)){
			System.out.print("PIN: ");
			String pinIn = input.nextLine();

			if (pinIn.equals(this.PIN)){
				System.out.println("Login Successful");
			}
		}

		return result;
	}

	public boolean login(String userNameIn, String pinIn){
		boolean result = false;
		if (userNameIn.equals(this.userName)){
			if (pinIn.equals(this.PIN)){
				result = true;
			}
		}

		return result;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public void setPIN(PIN){
		this.PIN = PIN;
	}

	public String getPIN(){
		return String.format(this.PIN);
	}
