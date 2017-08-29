
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCream b1 = new Chocolate();
		System.out.println(b1.getDescription()+" "+b1.cost()+" bath");
		System.out.println("--------------");
		
		IceCream b2 = new Vanilla();
		b2 = new CornFlake(b2);
		b2 = new Whip(b2);
		System.out.println(b2.getDescription()+" "+b2.cost()+" bath");
		System.out.println("--------------");
		
		IceCream b3 = new Coffee();
		b3 = new Jelly(b3);
		b3 = new CornFlake(b3);
		b3 = new Whip(b3);
		System.out.println(b3.getDescription()+" "+b3.cost()+" bath");
		System.out.println("--------------");
		
		IceCream b4 = new Strawberry();
		b4 = new Jelly(b4);
		b4 = new Whip(b4);
		System.out.println(b4.getDescription()+" "+b4.cost()+" bath");
	}

}
