public class FlightTicket implements IFlightTicket{
    private String ticketDetails;

    public FlightTicket() {
        System.out.println("Loading flight ticket details from the system...");
        this.ticketDetails = "Flight Ticket Details: [Flight Number: 123, Departure: XYZ, Arrival: ABC]";
    }

    @Override
    public String getTicketDetails() {
        return this.ticketDetails;
    }
}
