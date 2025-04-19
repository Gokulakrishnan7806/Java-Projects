 public class AirLine
 {
    String FlightName;
    String FlightNumber;
    String Orgin;
    String Destination;
    String Time;
    int Seat;


    public AirLine(String Fname, String Flightnumber, String orgin, String destination, String time, int seat)
    {
        this.FlightName = Fname;
        this.FlightNumber = Flightnumber;
        this.Orgin = orgin;
        this.Destination = destination;
        this.Time = time;
        this.Seat = seat;

    }


    public  void displayfilghts() {
        System.out.printf("%-15s %-12s %-12s %-15s %-10s%n",
                FlightNumber, Orgin, Destination, Time, String.valueOf(Seat));

     }
}

class FlighBooking {

    String FlightNumber;
    String flightName;
    String PassangerName;


    public FlighBooking(String FlightNumber, String flightName, String PassangerName) {

        this.FlightNumber = FlightNumber;
        this.flightName = flightName;
        this.PassangerName = PassangerName;
    }


    public void Booking() {


        System.out.printf("%-10d %-15s %-10s %-10s %-12s %-5d\n", FlightNumber, flightName, PassangerName);
    }
}

class Ticket
{

    String Ticketid;
    String FlightNo;
    String passengername;

    boolean isCancelled;

    public Ticket(String Ticketid,String FlightNo, String passengername){

        this.Ticketid=Ticketid;
        this.FlightNo=FlightNo;
        this.passengername=passengername;
        isCancelled=false;
    }

    public void displayTicket()
    {

        String status=isCancelled ? "cancelled" : "Confirmed";
        System.out.printf("%-10s %-10s %-15s %-10s%n", Ticketid, FlightNo, passengername, status);
    }
}











