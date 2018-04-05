package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		
		//metodos isSameIf
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearIf(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonthIf(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDayIf(tomorrow));
		//metodos isSame
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearDate(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonthDate(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDayDate(tomorrow));
		
		//metodos que incluyen switch
		System.out.println(today.isDayRight());
		System.out.println(today.getMonthName());
		System.out.println(today.setSeasonName());
		
		//metodos que incluyen for
		System.out.println(today.getMonthsLeft());
		System.out.println(today.getMonthsSameDays());
		System.out.println(today.getDaysLeftOfMonth());
		/*
		System.out.println(today.daysOfWeek());
		*/
		
		
	}
	

}
