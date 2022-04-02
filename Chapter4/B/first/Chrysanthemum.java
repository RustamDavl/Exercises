package Exercises.Chapter4.B.first;

public class Chrysanthemum extends Flowers {
	Flowers flowers;
	private int length = 20;

	public Chrysanthemum() {
		description = "Chrysanthemum with : ";
	}

	public Chrysanthemum(Flowers flowers) {
		description = flowers.getDescription() + " Chrysanthemum ";

		this.flowers = flowers;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if (flowers == null)
			return 115;
		return 225 + flowers.cost();
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return length;
	}

}
