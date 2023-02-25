package test;

public class Banks {
	private int money;
	
	public Banks(int money) {
		this.money = money;
	}
	
	public Banks() {
		
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	public void withdrawMoney(int money) {
		this.money = this.money - money;
	}
	
	public int getCash() {
		return money;
	}
	
}
