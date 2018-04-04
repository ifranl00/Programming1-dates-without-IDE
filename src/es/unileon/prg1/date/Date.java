package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	//Constructores:
	
	public Date(int day, int month, int year){
		
		if (!accurateDate()){
			
			return this.Date();
			
		}else
			this.day = day;
			this.month = month;
			this.year = year;
		
		}
			
	
	public Date(){
		day = 1;
		month = 1;
		year = 2018;
	}
	
	public Date( Date){
		this.day = this.getDay();
		this.month = this.getMonth();
		this.year = this.getYear();
		
	}
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
	
	//metodos
		
	
	
	public boolean isDayRight(){
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
		boolean isSameMonthIf (Date anotherDate){
			if ( this.month == anotherDate.getMonth(){
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
		
		boolean isSameYearDate (Date date){
			boolean sameYear = false;
			sameYear = (this.year == date.getYear());
			return sameyear;
		}
		boolean isSameMonthDate (Date anotherDate){
			boolean sameMonth = false;
			sameMonth = (this.month == date.getMonth());
			return sameMonth;
		}
		boolean isSameDayDate (Date anotherDate){
			boolean sameDay = false;
			sameDay = (this.day == date.getDay());
			return sameDay;
		}
		
		
	
	
	
	public String toString(){
		
		
		String date =" ";
		date = return this.day + "/" + this.month + "/" + this.year;
		return date;
	}
	
	
	
	
	
	private String getMonthName(){
		
		String month;
		
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
		
		String season;
		
		switch (this.month){
			
			case 1:
			case 2:
				season = "Invierno";
				break;
				
			case 3:
				if (this.day <= 20){
					season = "Invierno";
				}else
					season = "Primavera";
				break;
			case 4:
			case 5:
				season = "Primavera";
				break;
			case 6:
				if (this.day <= 20){
					season = "Primavera";
				}else
					season = "Verano";
				break;
				
			case 7:
			case 8:
				season = "Verano";
				break;
			
			case 9:
				if (this.day <= 20){
					season = "Verano";
				}else
					season = "Otonyo";
				break;
				
			case 10:
			case 11:
				season = "Otonyo";
				break;
			case 12:
				if (this.day <= 21);{
					season = "Otonyo";
				}else
					season = "Invierno";
				break;
		}
		return season;
	}
				
			
			
			
			
		
		
		
		
	
	
	public String monthsLeft(){
		StringBuilder months = new StringBuilder();
		
		for( int i = this.month+1 ; i <=12; i++){
				months.append(this.getMonthName());
		}
		return moths.toString();
	}
	
	
	public String getDaysLeftOfMonth(){
		StringBuilder daysLeftOfMonth = new StringBuilder();
		
		for ( int i = this.day, i
		
	}
	
	public String getMonthsSameDays(){
		StringBuilder monthsSameDays = new StringBuilder();
		
		
		
	}
	
	
	public int daysYearUntilNow(){
	}
	public int daysOfWeek (int dayJanuaryFirst){
		int day,today,daysTotal;
		daysTotal= this.daysYearUntilNow()-1;
		return daysTotal % 7 + dayJanuaryFirst;
	}
	
	

}
