import java.util.*;
import java.io*;

public class Admin extends User immplements HasMenu, Serializable {

	public static void main(String[] args){
		Admin a = new Admin();
		a.login();
	}

	public Admin(){
		this.userName = "Admin";
		this.PIN = "0000";
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Admin Menu");
		System
