import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirlineReservationSystem {

    private static final Scanner input = new Scanner(System.in);
    private static final List<AirLine> airline = new ArrayList<>();
    private static final List<Ticket> tickets = new ArrayList<>();
    private static int ticketCounter = 1000;

    public static void main(String[] args) {
        flightdetails();

        while (true) {

            System.out.println("=====================================");
            System.out.println("     AIRLINE RESERVATION SYSTEM    ");
            System.out.println("=====================================");

            System.out.println("1. View Flights");
            System.out.println("2. Search Flights");
            System.out.println("3. Book Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. View My Bookings");
            System.out.println("6. Exits");
            System.out.println("--------------------------------------");


            System.out.println("Enter Your Choice:_");
            int choice = input.nextInt();
            input.nextLine();


            switch (choice) {

                case 1 -> {
                    viewFlights();
                    break;
                }

                case 2 -> {
                    searchFlights();
                    break;
                }

                case 3 -> {
                    BookTicket();
                    break;
                }

                case 4 -> {
                    cancellBooking();
                    break;
                }

                case 5 -> {
                    viewBookings();
                    break;
                }

                case 6 -> {
                    System.out.println("--------------------------------------------------------");
                    System.out.println(" Thank You For Using Airline Reservation System");
                    System.out.println(" Enjoy Your Journey !!");
                }

                default -> System.out.println("Invalid Choice.Pleace Try to Again");
            }
        }
    }

    private static void flightdetails() {


        airline.add(new AirLine("AirIndiaExpress", "13547", "Chennai", "Delhi", "10.45 AM", 15));
        airline.add(new AirLine("indigo", "12447", "Hyderabad", "Pune", "7.45 AM", 23));
        airline.add(new AirLine("SaudiArabianAirline", "15347", "Bangalore", "Saudi", "6.43 AM", 43));
        airline.add(new AirLine("SriLankan Airlines", "24347", "Mumbai", "SriLanka", "1.54 AM", 12));
        airline.add(new AirLine("AirAsiaAirlines", "43547", "Chennai", "NewZealand", "2.45 PM", 18));
        airline.add(new AirLine("KuwaitAirways", "21547", "Dubai", "Chennai", "8.21 AM", 6));
        airline.add(new AirLine("CanadaAirlines", "13587", "chennai", "Canada", "7.00 AM", 12));
        airline.add(new AirLine("GulfAirlines", "167547", "Cochin", "German", "9.56 PM", 31));
        airline.add(new AirLine("AirIndia", "135760", "chennai", "Singapore", "3.21 PM", 3));
        airline.add(new AirLine("indigo", "13657", "chennai", "Malaysia", "11.34 AM", 5));
    }


    private static void viewFlights() {

        System.out.println("\n==========================================");
        System.out.println("Available Flights:");
        System.out.println("------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-15s %-10s %-10s%n", "Flight No", "Origin", "Destination", "Departure", "Seats", "Price");
        System.out.println("---------------------------------------------------------------------");
        for (AirLine airLine : airline) {

            airLine.displayfilghts();
        }

    }

    private static void searchFlights() {

        System.out.print("Enter Origin: ");
        String origin = input.nextLine();
        System.out.print("Enter Destination: ");
        String destination = input.nextLine();

        System.out.println("\n==========================================");
        System.out.println("Search Results:");
        System.out.println("------------------------------------------");
        boolean found = false;

        for (AirLine airLine : airline) {

            if (airLine.Orgin.equalsIgnoreCase(origin) && airLine.Destination.equalsIgnoreCase(destination)) {

                System.out.printf("Flight No: %s | Departure: %s | Flight Name: %s ", airLine.FlightNumber, airLine.Time, airLine.FlightName);
                found = true;
            }
        }
        if (!found) {
            System.out.println(" No flights Available for the given route");
        }
    }

    private static void BookTicket() {

        System.out.println("Enter the Flight Number");
        String FlightNo = input.nextLine();
        AirLine selectedFlight = null;

        for (AirLine flights : airline) {
            if (flights.FlightNumber.equalsIgnoreCase(FlightNo)) {
                selectedFlight = flights;
                break;
            }
        }


        if (selectedFlight == null) {

            System.out.println(" Invalid Flight NUmber. Pleace try again");
            return;
        }

        if (selectedFlight.Seat == 0) {
            System.out.println(" Sorry,No Seats availbale on this Flight.");
            return;
        }
        System.out.println("Enter Passager Name");
        String passengerName = input.nextLine();
        String ticketId = "TKT" + (++ticketCounter);

        tickets.add((new Ticket(ticketId, FlightNo, passengerName)));
        selectedFlight.Seat--;

        System.out.println("\nBooking Confirmed!");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Flight No: " + FlightNo);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Departure: " + selectedFlight.Time);
        System.out.println("------------------------------------------");
    }

    private static void cancellBooking() {
        System.out.println(" Enter Ticket ID: ");
        String ticketId = input.nextLine();

        for (Ticket ticket : tickets)
        {

            if (ticket.equals(ticketId) && !ticket.isCancelled)
            {
                ticket.isCancelled = true;
                for (AirLine flight : airline)
                {
                    if (flight.FlightNumber.equals(ticket.FlightNo))
                    {
                        flight.Seat++;
                        break;
                    }
                }
                System.out.println("Ticket Cancelled Successfully.");
                return;
            }

        }
        System.out.println("Invalid or Already Cancelled Ticket");
    }


    private static void viewBookings() {
        System.out.println("\n==========================================");
        System.out.println("Your Bookings:");
        System.out.println("------------------------------------------");
        if (tickets.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        System.out.printf("%-10s %-10s %-15s %-10s%n", "Ticket ID", "Flight No", "Passenger", "Status");
        System.out.println("------------------------------------------------------");
        for (Ticket ticket : tickets) {
            ticket.displayTicket();
        }
    }
}








