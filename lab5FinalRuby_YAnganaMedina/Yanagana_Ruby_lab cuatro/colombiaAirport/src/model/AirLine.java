package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class AirLine {
	
	
	private String name;
	private Flight []flights;
	
	    public AirLine(String name, Flight[] flights) {
		
		this.name = name;
		this.flights = flights;
	}
	    
	    public String getName() {
			return name;
		}
       public void setName(String name) {
			this.name = name;
		}

       public Flight[] getFlights() {
			return flights;
		}
       public void setFlights(Flight[] flights) {
			this.flights = flights;
		}


     




}
