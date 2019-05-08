package model;

public class Flight   implements Comparable<Flight>{
	
	
	public static final int length = 0;
	private int numberOfFlights;
	private int hours;
	private String schedule;
	public String identifier;
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	private int minute;
	private int day;
	private int month;
	private int year;
	private String destinationCities;
	private String differentAirlines;
	private String BoardingGates;
	private String date;
	
	
	
	public Flight(int numberOfFlights,String shedule, int hours, int minute, int day, int month, int year, String destinationCities,
			String differentAirlines, String boardingGates,String date ) {
		super();
		this.numberOfFlights = numberOfFlights;
		this.hours = hours;
		this.minute = minute;
		this.day = day;
		this.month = month;
		this.year = year;
		this.destinationCities = destinationCities;
		this.differentAirlines = differentAirlines;
		this.BoardingGates
		= boardingGates;
		this.schedule=schedule;
		this.date=date;
		
	}
	
    public String getSchedule() {
    	return schedule;
    }
    public void setSchedule( String schedule) {
    	this.schedule=schedule;
    }

	public int getNumberOfFlights() {
		return numberOfFlights;
	}
     public void setNumberOfFlights(int numberOfFlights) {
		this.numberOfFlights = numberOfFlights;
	}
    public int getHours() {
		return hours;
	}
    public void setHours(int hours) {
		this.hours = hours;
	}
    public int getMinute() {
		return minute;
	}
    public void setMinute(int minute) {
		this.minute = minute;
	}
    public int getDay() {
		return day;
	}
    public void setDay(int day) {
		this.day = day;
	}
    public int getMonth() {
		return month;
	}
    public void setMonth(int month) {
		this.month = month;
	}
    public int getYear() {
		return year;
	}
    public void setYear(int year) {
		this.year = year;
	}
    public String getDestinationCities() {
		return destinationCities;
	}
    public void setDestinationCities(String destinationCities) {
		this.destinationCities = destinationCities;
	}
    public String getDifferentAirlines() {
		return differentAirlines;
	}
    public void setDifferentAirlines(String differentAirlines) {
		this.differentAirlines = differentAirlines;
	}
    public String getGates() {
		return BoardingGates;
	}
    public void setGates(String boardingGates) {
		this.BoardingGates= boardingGates;
	}

	@Override
	public int compareTo(Flight o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
	

}
