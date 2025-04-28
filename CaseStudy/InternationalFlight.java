package CaseStudy;

public class InternationalFlight extends Flight {
    private String countryCode;

    public InternationalFlight(String flightId, String departureTime, String arrivalTime, int availableSeats, String origin, String destination, String countryCode) {
        super(flightId, departureTime, arrivalTime, availableSeats, origin, destination);
        this.countryCode = countryCode;
    }

    @Override
    public String getFlightInfo() {
        return super.getFlightInfo() + ", Country Code: " + countryCode;
    }
}
