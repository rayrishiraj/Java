package CaseStudy;

public class Flight {
    private String flightId;
    private String departureTime;
    private String arrivalTime;
    private int availableSeats;
    private String origin;
    private String destination;

    public Flight(String flightId, String departureTime, String arrivalTime, int availableSeats, String origin, String destination) {
        this.flightId = flightId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
        this.origin = origin;
        this.destination = destination;
    }

    public String getFlightId() { return flightId; }
    public String getDepartureTime() { return departureTime; }
    public String getArrivalTime() { return arrivalTime; }
    public int getAvailableSeats() { return availableSeats; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }

    public void setAvailableSeats(int availableSeats) { this.availableSeats = availableSeats; }

    public boolean bookSeats(int count) {
        if (availableSeats >= count) {
            availableSeats -= count;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        return availableSeats > 0;
    }

    public String getFlightInfo() {
        return "Flight ID: " + flightId + "\nFrom: " + origin + ", To: " + destination +
                "\nDeparture: " + departureTime + ", Arrival: " + arrivalTime + "\nSeats: " + availableSeats;
    }
}
