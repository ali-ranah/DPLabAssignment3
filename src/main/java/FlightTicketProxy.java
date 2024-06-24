public class FlightTicketProxy implements IFlightTicket {
    private FlightTicket realTicket;

    public FlightTicketProxy() {
        this.realTicket = null;
    }

    @Override
    public String getTicketDetails() {
        if (this.realTicket == null) {
            System.out.println("Creating real flight ticket object...");
            this.realTicket = new FlightTicket();
        }
        return this.realTicket.getTicketDetails();
    }
}