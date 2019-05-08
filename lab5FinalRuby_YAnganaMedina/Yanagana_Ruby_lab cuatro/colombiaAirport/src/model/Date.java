package model;

import java.util.Comparator;

/**
 * @author Andres
 *
 */
public class Date implements Comparable<Date> {
	
	private int hour;
	
	private int minute;
	
	private static String AM = "AM";
	
	private static String PM = "PM";
	
	public Date(){
		
	generateRandomTime();
	
	}
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * This method generate a random time between 00 and 23;
	 * @return The estimated time in hour and seconds
	 */
	public String generateRandomTime(){
		String msg = "";
		
		hour = (int)(Math.random()*24);
		
		minute = (int)(Math.random()*60);
		
		if(minute>59){
			hour++;
			minute=00;
		}
		if(hour==0){
			hour=24;
		}
		if(minute==0){
			minute =00;
		}
		return msg;
	}
	/**
	 * <pre>The method generate has been invoke already
	 * @return A Date indicating the time in format AM/PM
	 */
	public String convertDate(){
		String msg = "";
		if(hour>12&&hour<=23){
			switch (hour) {
			case 13:
				hour = 1;
				msg =hour+" "+minute+" "+PM;
				break;
			case 14:
				hour = 2;
				msg =hour+" "+minute+" "+PM;
				break;
			case 15:
				hour = 3;
				msg =hour+" "+minute+" "+PM;
				break;
			case 16:
				hour = 4;
				msg =hour+" "+minute+" "+PM;
				break;
			case 17:
				hour = 5;
				msg =hour+" "+minute+" "+PM;
				break;
			case 18:
				hour = 6;
				msg =hour+" "+minute+" "+PM;
				break;
			case 19:
				hour = 7;
				msg =hour+" "+minute+" "+PM;
				break;
			case 20:
				hour = 8;
				msg =hour+" "+minute+" "+PM;
				break;
			case 21:
				hour = 9;
				msg =hour+" "+minute+" "+PM;
				break;
			case 22:
				hour = 10;
				msg =hour+" "+minute+" "+PM;
				break;
			case 23:
				hour = 11;
				msg =hour+" "+minute+" "+PM;
				break;
	
			}
		}
		else{
			msg=hour+" "+minute+" "+AM;
		}
		return msg;
		
	}
	/**
	 * This method compare 
	 * @param o
	 * @return
	 */
	public int compareToHourAndMinuteInArrival(Date arrival) {
		
		int comparisonValue= 0;
		
			if(arrival.getHour()==hour) {
				if(arrival.getMinute()==minute) {
					comparisonValue = 0;
				}
			}
			
			else if(arrival.getHour()<hour||arrival.getMinute()<=minute) {
				comparisonValue = 1;
			}
			
			else if(arrival.getHour()==hour||arrival.getMinute()<=minute) {
				comparisonValue = 1;
			}
			
			else if(arrival.getHour()>hour||arrival.getMinute()>=minute) {
				comparisonValue = 1;
			}
			
			else if(arrival.getHour()==hour||arrival.getMinute()>=minute) {
				comparisonValue = 1;
			}
		
		return comparisonValue;
	}
	@Override
	/**
	 * This method compare the departure date it returns 
	 * @param departure
	 * @return it return 0 is departure is equals to parameter
	 */
	public int compareTo(Date departure) {
		
		int comparisonValue= 0;
		
			if(departure.getHour()==hour) {
				if(departure.getMinute()==minute) {
					comparisonValue = 0;
				}
			}
			
			else if(departure.getHour()<hour||departure.getMinute()<=minute) {
				comparisonValue = 1;
			}
			
			else if(departure.getHour()==hour||departure.getMinute()<=minute) {
				comparisonValue = 1;
			}
			
			else if(departure.getHour()>hour||departure.getMinute()>=minute) {
				comparisonValue = 1;
			}
			
			else if(departure.getHour()==hour||departure.getMinute()>=minute) {
				comparisonValue = 1;
			}
		
		return comparisonValue;
	}

}