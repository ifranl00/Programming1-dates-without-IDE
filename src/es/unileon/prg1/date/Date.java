package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	//Constructores:
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
		if (!accurateDate()){
			return false;
		}
			return true;
		
		
			
		}
			
	}
	public Date(){
		day = 1;
		month = 1;
		year = 2018;
	}
	
	public Date( ){
		
	}
	
	
	//getters:
	
	public getDay(){
		return this.day;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
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
	
	//metodos
	
	public boolean isDayRight(){
		switch(this.day){
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
					acurrateDay = true;
				}
		}
		return accurateDay;
	}
			
			
		
	
	public boolean accurateDate(){
		
		boolean accurateDay = false
		boolean accurateMonth = false;
		boolean accurateYear = false;
		
		accurateYear = this.year >0;
		accurateMonth = (this.month >=1) && (this.month >=12);
		accurateDay = this.isDayRight(this.day);
	}
	
	
		
		
		
		
		
	
	
	
		//metodos isSame
		
		boolean isSameDayIf (Date anotherDate){
			if ( this.day == anotherDate.getDay(){
				return true;
			}
			return false;
		}
		boolean isSameYearIf(Date anotherDate){
			if ( this.year == anotherDate.getYear() ){
				return true;
			}
			return false;
		}
		boolean isSameYearDate another){
			return (this.year == date.getYear());
	
	
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	
	
	
	
	private String getMonthName(){
	}
	
	public String monthsLeft(){
		StringBuilder months = new StringBuilder();
		
		for( int i = this.month+1 ; i <=12; i++){
				months.append(this.getMonthName());
		}
		return moths.toString();
	}
	public int daysYearUntilNow(){
	}
	public int daysOfWeek (int dayJanuaryFirst){
		int day,today,daysTotal;
		daysTotal= this.daysYearUntilNow()-1;
		return daysTotal % 7 + dayJanuaryFirst;
	}
	
	

}
