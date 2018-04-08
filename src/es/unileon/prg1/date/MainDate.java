package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		
			try {
			today = new Date(17, 1, 2016);
			tomorrow = new Date(18, 1, 2016);
		
		
		
			
			
			//metodo toString()
			System.out.println(" La fecha es : " + today.toString());
			
			//metodos isSameIf()
			System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearIf(tomorrow));
			System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonthIf(tomorrow));
			System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDayIf(tomorrow));
			
			//metodos isSame()
			System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearDate(tomorrow));
			System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonthDate(tomorrow));
			System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDayDate(tomorrow));
		
			//metodos que incluyen switch
			System.out.println( " El dia resulta : " + today.isDayRight());
			System.out.println( " Es el mes : " + today.getMonthName());
			System.out.println( " La estacion es : " + today.setSeasonName());
		
		
			//metodos que incluyen bucle for 
			System.out.println( " Los meses restantes son : " + tomorrow.getMonthsLeft());
			System.out.println( " Los siguientes meses tienen el mismo numero de dias : " + today.getMonthsSameDays());
			System.out.println( " Las fechas restantes hasta final de mes son : " + tomorrow.getDaysLeftOfMonth());
			System.out.println( " Los dias que han pasado desde el primer dia del anyo hasta hoy : " + today.daysPast());

			
			
			
			
			
			//metodo numRandomTriesEqualDate1 (empleando un while)
			System.out.println(" Se ha producido el siguiente numero de intentos :  "  + today.numRandomTriesEqualDate1());
			
			//Metodo numRandomTriesEqualDate2() (empleando un  do-while)
			System.out.println(" Se ha producido el siguiente numero de intentos : " + today.numRandomTriesEqualDate2());
			
			
			//metodo daysOfWeek
			System.out.println( " La fecha introducida cae en : " + today.daysOfWeek(5) + "  (siendo lun=1, mar=2, x=3, jue=4, vie=5, sab=6, dom=7) ") ;
			
			
		


		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	

}
