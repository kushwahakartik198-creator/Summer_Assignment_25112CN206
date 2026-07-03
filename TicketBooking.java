class Ticket {
    int availableSeats = 5;

    void bookTicket(int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println(seats + " seat(s) booked.");
        } else {
            System.out.println("Not enough seats available.");
        }
    }

    void showSeats() {
        System.out.println("Available Seats: " + availableSeats);
    }
}

public class TicketBooking {
    public static void main(String[] args) {

        Ticket t = new Ticket();

        t.showSeats();
        t.bookTicket(2);
        t.showSeats();
    }
}