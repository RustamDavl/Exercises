package Exercises.Chapter4.B.first;

public class Aspidistra extends Decorator {
	private Flowers flowers;

	public Aspidistra(Flowers flowers) {
		this.flowers = flowers;
	}

	@Override
	public String getDescription() {
	
		return flowers.getDescription() + " Aspidistra ";
	}
	

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 80 + flowers.cost();
	}

	
}
