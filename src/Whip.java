
public class Whip extends Topping {
	 IceCream iceCream;
	 public Whip(IceCream iceCream){
		 this.iceCream = iceCream;
	 }

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return iceCream.getDescription()+", Whip";
	}
	public double cost(){
		return 10 + iceCream.cost();
	}
}
