
public class CornFlake extends Topping {
	IceCream iceCream;
	 public CornFlake(IceCream iceCream){
		 this.iceCream = iceCream;
	 }

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return iceCream.getDescription()+", Corn Flake";
	}
	public double cost(){
		return 10 + iceCream.cost();
	}

}
