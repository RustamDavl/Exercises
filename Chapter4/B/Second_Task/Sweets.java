package Exercises.Chapter4.B.Second_Task;

public abstract class Sweets implements Comparable<Sweets> {

	protected double weight;

	protected double sugar;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}

	public int compareTo(Sweets s) {
		return this.getWeight() > s.getWeight() ? 1 : (this.getSugar() == s.getSugar() ? 0 : -1);
	}

	public String toString() {
		return this.getClass().getSimpleName() + " ";
	}

}
