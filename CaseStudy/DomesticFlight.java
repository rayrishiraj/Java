package CaseStudy;

public class DomesticFlight extends Flight {
    private String stateCode;

    public DomesticFlight(String flightId, String departureTime, String arrivalTime, int availableSeats, String origin, String destination, String stateCode) {
        super(flightId, departureTime, arrivalTime, availableSeats, origin, destination);
        this.stateCode = stateCode;
    }

    @Override
    public String getFlightInfo() {
        return super.getFlightInfo() + ", State Code: " + stateCode;
    }
}
