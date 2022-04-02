package Exercises.Chapter4.B.first;

public class Rose extends Flowers {
	Flowers flowers;
	private int length = 30;

	public Rose() {
		description = "Rose with : ";
	}

	public Rose(Flowers flowers) {
		
			description = flowers.getDescription() + " Rose ";

		this.flowers = flowers;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if (flowers == null)
			return 199;
		return 199 + flowers.cost();
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return length;
	}

}
