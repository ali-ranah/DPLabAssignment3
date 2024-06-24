public class Main {
    public static void main(String[] args) {
        IFlightTicket ticketProxy = new FlightTicketProxy();

        System.out.println(ticketProxy.getTicketDetails());

        System.out.println(ticketProxy.getTicketDetails());
    }
}