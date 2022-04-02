package Exercises.Chapter4.B.first;

public class Asparagus extends Decorator {
	private Flowers flowers;

	public Asparagus(Flowers flowers) {
		this.flowers = flowers;
	}

	@Override
	public String getDescription() {
		
		return flowers.getDescription() + " Asparagus ";

	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 50 + flowers.cost();
	}

}
