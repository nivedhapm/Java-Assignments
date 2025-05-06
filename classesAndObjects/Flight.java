package classesAndObjects;

public class Flight {
	private String flightNumber;
	private String airline;
	public static final String source = "Bangalore";
	public static final String destination = "Singapore";
	private String departureTime;
	private String arrivalTime;
	private String duration;
	
	public Flight(String flightNumber, String airline, String departureTime, String arrivalTime, String duration) {
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "FLIGHT DETAILS: \n\nFlight Number: " + flightNumber + "\nAirline: " + airline + "\nSource: "
				+ source + "\nDestination: "+ destination+ "\nDeparture Time: " + departureTime
				+ "\nArrival Time: " + arrivalTime + "\nDuration: " + duration;
	}
	
}

