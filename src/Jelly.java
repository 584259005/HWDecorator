
public class Jelly extends Topping {
	IceCream iceCream;
	 public Jelly(IceCream iceCream){
		 this.iceCream = iceCream;
	 }

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return iceCream.getDescription()+", Jelly";
	}
	public double cost(){
		return 5 + iceCream.cost();
	}

}
