public class Main {
    public static void main(String[] args) {
        IFlightTicket ticketProxy = new FlightTicketProxy();

        // First call, creates the real object
        System.out.println(ticketProxy.getTicketDetails());

        // Subsequent calls use the already created object
        System.out.println(ticketProxy.getTicketDetails());
    }
}