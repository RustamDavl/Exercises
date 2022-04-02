package Exercises.Chapter4.B.first;

public class Chamomile extends Flowers  {
	Flowers flowers;
	private int length = 15;

	public Chamomile() {
		description = "Chamomile with : ";
	}

	public Chamomile(Flowers flowers) {
		description = flowers.getDescription() + " Chamomile with ";

		this.flowers = flowers;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if (flowers == null)
			return 79;
		return 79 + flowers.cost();
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return length;
	}

}
