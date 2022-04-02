package Exercises.Chapter4.B.first;

public abstract class Flowers implements Comparable<Flowers> {

	private int length = 0;

	protected String description = " Unknown beverage ";

	protected String getDescription() {
		return description;
	}
	public abstract int getLength();

	public int compareTo(Flowers o) {

		return this.getLength() < o.getLength() ? -1 : (this.getLength() == o.getLength() ? 0 : 1);
	}

	public abstract double cost();

	public String toString() {
		return description;
	}

}
