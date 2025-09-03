package Assignment;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    public void bookTicket(int seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }
    }

    public void displayTicket() {
        if (isBooked) {
            System.out.println("🎬 Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}

public class p9 {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception");

        ticket1.displayTicket();
        ticket1.bookTicket(12, 250);
        ticket1.displayTicket();

        // Trying to re-book same ticket
        ticket1.bookTicket(15, 300);
    }
}
