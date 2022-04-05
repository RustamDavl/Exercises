package Exercises.Chapter4.B.Second_Task;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.*;

public class CreateGift {
	private static List<Sweets> list = new ArrayList<>();
	
	 public static void  create(Sweets ...sweets) {
		for (Sweets s : sweets) {
			list.add(s);
			
		}
		Collections.sort(list);
		System.out.println("Your gift consists of : " + list);
	}
	
	
	
	

}


