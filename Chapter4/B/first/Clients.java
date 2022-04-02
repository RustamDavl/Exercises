package Exercises.Chapter4.B.first;
import java.util.*;
public class Clients {

	
	public static void main(String[] args) {
		
		Flowers rose = new Asparagus(new Aspidistra(new Rose(new Chrysanthemum())));
		System.out.println(rose.getDescription());
		
		System.out.println("Total prise : " + rose.cost());
		
		
	}
}



