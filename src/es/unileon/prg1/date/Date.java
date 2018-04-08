package es.unileon.prg1.date;
import java.util.Random;
public class Date {
	private int day;
	private int month;
	private int year;
	
//Constructores:
	
//Constructor1
	public Date(int day, int month, int year) throws DateException{
			this.year = year;
			
			// comprobar si el mes y el anyo introducidos no son validos
			if ((month < 1 || month > 12) && (day < 0 || day > 31)){
				throw new DateException("Dia " + day + " y mes " + month + 
				" no son validos " +
					" Valores posibles : entre 1 y 31 para dia y entre 1 y 12 para mes " );
			} else {
				this.day = day;
				this.month = month;
			}
			
			if (month < 1 || month > 12) {
				throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
			} else {
				this.month = month;
			}
			
			
			//comprobar el dia
			if (day < 0 || day > 31){
				throw new DateException("Dia " + day + " no valido " +
					" Valores posibles entre 1 y 31 " );
			} else {
				this.day = day;
			}
			
				
		}
//Constructor2
	
	public Date(){
		day = 1;
		month = 1;
		year = 2018;
	}
	
//Constructor3
	public Date(Date cp ){ 
		this.day = cp.getDay();
		this.month = cp.getMonth();
		this.year = cp.getYear();
		
	}

	
	
//getters:
	
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	
	public int getYear(){
		return this.year;
	}
	
	
	
//setters:
	
	public void setDay (int day){
		this.day = day;
	}
	
	public void setMonth (int month){
		this.month = month;
	}
	
	public void setYear (int year){
		this.year = year;
	}
	
	
		
	
	
	
			
//metodos isSame
		
	boolean isSameDayIf (Date anotherDate){
		if ( this.day == anotherDate.getDay()){
			return true;
		}else 
		return false;
			
	}
	boolean isSameMonthIf (Date anotherDate){
		if ( this.month == anotherDate.getMonth()){
			return true;
		}else 
		return false;
			
	}
	boolean isSameYearIf(Date anotherDate){
		if ( this.year == anotherDate.getYear() ){
			return true;
		}else 
		return false;
			
	}
		
	boolean isSameYearDate (Date date){
		boolean sameYear = false;
		sameYear = (this.year == date.getYear());
		return sameYear;
	}
	boolean isSameMonthDate (Date date){
		boolean sameMonth = false;
		sameMonth = (this.month == date.getMonth());
		return sameMonth;
	}
	boolean isSameDayDate (Date date){
		boolean sameDay = false;
		sameDay = (this.day == date.getDay());
		return sameDay;
	}
		
//metodos que incluyen switch
	
	
	public boolean isDayRight(){
		
		boolean accurateDay = false;
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (this.day >= 1 && this.day <=31){
					accurateDay = true;
				}
				break;
			case 2:
				if (this.day >=1 && this.day <=28){
					accurateDay = true;
				}
				break;	
			default:	
				if (this.day >=1 && this.day <= 30){
					accurateDay = true;
				}
		}
		return accurateDay;
	}
	
	
	
	
	
	
	
	
	public String getMonthName(){
		
		String month = " ";
		
		switch (this.month){
		
			case 1:
				month = "Enero";
				break;
			case 2:
				month = "Febrero";
				break;
			case 3:
				month = "Marzo";
				break;
			case 4:
				month = "Abril";
				break;
			case 5:
				month = "Mayo";
				break;
			case 6:
				month = "Junio";
				break;
			case 7:
				month = "Julio";
				break;
			case 8:
				month = "Agosto";
				break;
			case 9:
				month = "Septiembre";
				break;
			case 10:
				month = "Octubre";
				break;
			case 11:
				month = "Noviembre";
				break;
			case 12:
				month = "Diciembre";
				break;
			default:
				month = " Los datos no se corresponden con un mes ";
		}
		
		return month;			
			
	}
	
	public String setSeasonName(){
		
		String season = " ";
		
		switch (this.month){

			case 1:
			case 2:
				season = "Invierno";
				break;
			case 3:
				if (this.day <= 20){
				season = "Invierno";
				}else season = "Primavera";
				break;
			case 4:
			case 5:
				season = "Primavera";
				break;
			case 6:
				if (this.day <= 20){
					season = "Primavera";
				}else season = "Verano";
				break;
			case 7:
			case 8:
				season = "Verano";
				break;
			case 9:
				if (this.day <= 20){
					season = "Verano";
				}else season = "Otonyo";
				break;
			case 10:
			case 11:
				season = "Otonyo";
				break;
			case 12:
				if (this.day <= 21){
					season = "Otonyo";
				}else season = "Invierno";


		}
	return season;
	}
				
			
			
//metodo toString()	
	public String toString(){
		
		
		String date =" ";
		date =  this.day + "/" + this.month + "/" + this.year;
		return date;
	}		
		
		
		
		
	
//metodos que incluyen bucle for
	
	public String getMonthsLeft(){
		StringBuilder months = new StringBuilder();
		
		Date fecha = new Date();
		int j = this.month;
		
		for( int i = this.month ; i <12; i++){
			
			setMonth(fecha.getMonth() + j++);
			
			months.append(this.getMonthName() + " " );
		}
		return months.toString();
	}
	
	
	public String getDaysLeftOfMonth(){
		
		StringBuilder daysLeftOfMonth = new StringBuilder();
		Date fecha = new Date(this);
		int j = 0;
		
		for ( int i = this.day; i  <= getDaysOfMonth(); i++){
			
			setDay(fecha.getDay() + j++ );
			
			daysLeftOfMonth.append(this.day +   "." + this.month + "." + this.year + "    " );
		}
		return daysLeftOfMonth.toString();
	}
			
			
		
		
//metodo necesario para el metodo getDaysLeftOfMonth()
	public int getDaysOfMonth(){
		int numDays = 0;
		
		if ( this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12){
			numDays = 31;
		}
		if ( this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
			numDays = 30;
		}
		if ( this.month == 2){
			numDays = 28;
		}
		
		return numDays;
	}
//metodos que incluyen bucle for	

	public String getMonthsSameDays(){
		StringBuilder monthsSameDays = new StringBuilder();
		
		int days = getDaysOfMonth();
		int i;
		Date fecha = new Date (this);
		
	
		
		
		for( i = 1; i <=12;i++){
			fecha.setMonth(i);
			if (days == fecha.getDaysOfMonth()){
				
				monthsSameDays.append(fecha.getMonthName() + " " );
			}
		}
		
		return monthsSameDays.toString();
	}
// Metodo numRandomTriesEqualDate1() (empleando un while)
	
	public int numRandomTriesEqualDate1(){
		
		int year;
		int month;
		int day;
		int attempts = 0;
		boolean equalDate = false;
		
		while (!equalDate){
			day = (int)(Math.random() * 31) + 1;
			month = (int)(Math.random() * 12) +1;
			year = this.year;
			
			if(day == this.day && month == this.month && year == this.year){
				equalDate = true;
				System.out.println(" Se ha encontrado la misma fecha ");
			}else{
				equalDate = false;
				System.out.println( " Intente de nuevo ");
				
			}
			attempts++;
		}
		return attempts;
	}
	
//Metodo numRandomTriesEqualDate2() (empleando un  do-while)

	public int numRandomTriesEqualDate2(){
		
		int year;
		int month;
		int day;
		int attempts = 0;
		boolean equalDate = false;
		
		do{
			day = (int)(Math.random() * 31) + 1;
			month = (int)(Math.random() * 12) +1;
			year = this.year;
			
			if(day == this.day && month == this.month ){
				equalDate = true;
				System.out.println(" Se ha encontrado la misma fecha ");
			}else{
				equalDate = false;
				System.out.println( " Intente de nuevo ");
				
			}
			attempts++;
		}
		while(!equalDate);
		return attempts;	
		}
		

			
	


	
				
		
		
		
		
	
//metodos que incluyen bucle for
	
	public int daysPast(){
		
		
		int i ;
		int daysTotal = 0;
		
		
		try{
			
			Date fecha = new Date (1,1, this.year);
			
			for( i = 1; i < this.month; i++){
				daysTotal = fecha.getDaysOfMonth();
			
				fecha.setMonth(i + 1);
			}
		}catch (DateException e ){
			System.out.println(e.getMessage());
		}
		
		return daysTotal + (this.day - 1);
	}
	
	
	
// metodo daysOfWeek
	public int daysOfWeek(int dayJanuaryFirst){
		
	int daysTotal = 0;
	

	daysTotal = this.daysPast() - 1;

	return daysTotal % 7 + (dayJanuaryFirst % 7) + 1 ;

	}


	
	
	


}

