
public class Person {
	private int coins, price;
	
	public Person(int coins) {
		this.coins = coins;
		this.price = 3;
	}
	
	public void insertCoin(Coinable coinable, int coins) {
		
		System.out.println("\nCoin Inserted = " + coins);
		
		if (coins >= 3) {
			
		if(!coinable.insertCoin()) {
			System.out.println("Coin Refunded = " + coins);
		}
		else {
			coins = coins - price;
			System.out.println("Your Change = " + coins);
		}
		}
		else {
		System.out.println("Insufficient Coin");
		}
	}


}
