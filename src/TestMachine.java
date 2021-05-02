
public class TestMachine {
	
	public static void main(String[] args) {

			System.out.println("Gumball Machine\n" + "Insert coin (1 Gumball = 3 coins)");
			
			GumballMachine gumballMachine = new GumballMachine();
			Person person = new Person (5);
			
			person.insertCoin(gumballMachine, 5);
			person.insertCoin(gumballMachine, 12);
			person.insertCoin(gumballMachine, 8);
			person.insertCoin(gumballMachine, 3);
			person.insertCoin(gumballMachine, 2);
		
	}

}
