
public class GumballMachine implements Coinable, Dispensable{
	
	int gums = 0;
			
			public GumballMachine() {
				this.gums = 5;
	}

			@Override
			public boolean insertCoin() {
				// TODO Auto-generated method stub
				
				if (this.gums>0) {
					this.dispense();
					return true;
				}
				System.out.println("return Coin");
				return false;
			}

			@Override
			public void dispense() {
				// TODO Auto-generated method stub
				this.gums--;
				System.out.println("1 Gum dispensed.");
				
			}

			@Override
			public void reload(int count) {
				// TODO Auto-generated method stub
				
				this.gums += count;
				
			}
			
			
		

}
