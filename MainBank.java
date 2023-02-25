package test;

import java.util.Scanner;

public class MainBank {
	
	Scanner console = new Scanner(System.in);
	
	public void MakeMoney() {
		System.out.println("What amount do you want to make?\nsum: ");
		int moneyIn = console.nextInt();
		Banks bank = new Banks();
		bank.addMoney(moneyIn);
	}
	
	public void WithdrawMoney() {
		System.out.println("What amount of money do you want to withdraw?\nsum: ");
		int withdraw = console.nextInt();
		Banks bank = new Banks();
		bank.withdrawMoney(withdraw);
	}
	
	public void CheckMoney() {
		Banks check = new Banks();
		System.out.println("Your balance: " + check.getCash());
	}
	
	public void Exit() {
		System.out.println("Exit.");
	}
	
	public static void main(String[] args) {
		MainBank mainBank = new MainBank();
		mainBank.Menu();
	}
	
	public void Menu() {
		int n = 0;
		do {
			System.out.println("\nMain: ");
			System.out.println("1. Make money\n2. Withdraw cash\n3. Check the balance\n4. exit");
					
			n = console.nextInt();
			
			switch(n) {
			
				case 1 : MakeMoney() ; break;
				case 2 : WithdrawMoney() ; break;
				case 3 : CheckMoney() ; break;
				case 4 : Exit() ; break;
				
				default : System.out.println("eror :(");
			}
		}
		while (n != 4);
	}

}
