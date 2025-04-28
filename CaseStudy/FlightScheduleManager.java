package CaseStudy;

import java.util.ArrayList;
import java.util.List;

public class FlightScheduleManager {
    private List<Flight> flights;

    public FlightScheduleManager() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public boolean bookFlight(String id, int count) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(id)) {
                return flight.bookSeats(count);
            }
        }
        return false;
    }

    public List<Flight> getFilteredFlights(String type, String departure, String origin, String destination) {
        List<Flight> available = new ArrayList<>();
        for (Flight flight : flights) {
            boolean isCorrectType = (type.equals("D") && flight instanceof DomesticFlight)
                    || (type.equals("I") && flight instanceof InternationalFlight);
            if (isCorrectType
                    && flight.getDepartureTime().equals(departure)
                    && flight.getOrigin().equalsIgnoreCase(origin)
                    && flight.getDestination().equalsIgnoreCase(destination)
                    && flight.isAvailable()) {
                available.add(flight);
            }
        }
        return available;
    }


    public List<Flight> getAllFlights() {
        return flights;
    }
}
