package Exercises.Chapter4.A.First;

public class Year {

	private Day day;
	private Month month;
	private int year;

	public Year() {

		
	}
	
	public void setDate(int d, String m, int year) {
		
		
		day = new Day(d);
		
		month = new Month(m);
		
		this.year = year;
		
		
		
	}
	public String toString() {
		StringBuilder st = new StringBuilder();
		
		st.append("[" + year + ":" + month + ":" + day + "]");
		
		return st.toString();
	}
	
	

	private class Day {
		private int day;

		public Day(int day) {
			
			this.day = day;
		}

		

		public int getDay() {
			return day;
		}

		@Override
		public String toString() {
			return day + " ";
		}
		

	}

	private class Month {

		private String month;

		public Month(String month) {
			this.month = month;
		}

		public String getMonth() {
			return month;
		}

		
		
		@Override
		public String toString() {
			return month + " ";
		}

	}

}
