
package Multithreading;

import java.util.Scanner;

class TicketBooking {

    private int availableSeats;

    public TicketBooking(int seats) {

        if (seats < 0) {
            throw new IllegalArgumentException(
                "Seats cannot be negative"
            );
        }

        this.availableSeats = seats;
    }

    public synchronized boolean bookTickets(
            String customerName, int seatsToBook) {

        if (seatsToBook <= 0) {
            System.out.println(
                customerName + " tried to book invalid seats."
            );
            return false;
        }

        System.out.println(
            customerName + " is trying to book "
            + seatsToBook + " seat(s)..."
        );

        // Check available seats
        if (seatsToBook > availableSeats) {

            System.out.println(
                "Sorry " + customerName
                + ", only " + availableSeats + " seats left."
            );

            return false;
        }

        // Simulate processing delay
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            System.out.println(
                customerName + "'s booking was interrupted."
            );

            return false;
        }

        // Deduct booked seats
        availableSeats -= seatsToBook;

        System.out.println(
            "Booking successful for " + customerName
            + "! Seats booked: " + seatsToBook
        );

        System.out.println(
            "Seats remaining: " + availableSeats
        );

        return true;
    }
}

class CustomerThread extends Thread {

    private final TicketBooking bookingSystem;
    private final String customerName;
    private final int seatsToBook;

    public CustomerThread(
            TicketBooking bookingSystem,
            String customerName,
            int seatsToBook) {

        this.bookingSystem = bookingSystem;
        this.customerName = customerName;
        this.seatsToBook = seatsToBook;
    }

    @Override
    public void run() {

        bookingSystem.bookTickets(
            customerName, seatsToBook
        );
    }
}

public class BookMyShow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total available seats: ");

        int totalSeats = sc.nextInt();

        TicketBooking bookingSystem =
            new TicketBooking(totalSeats);

        CustomerThread c1 =
            new CustomerThread(bookingSystem, "Alice", 2);

        CustomerThread c2 =
            new CustomerThread(bookingSystem, "Bob", 4);

        CustomerThread c3 =
            new CustomerThread(bookingSystem, "Charlie", 3);

        c1.start();
        c2.start();
        c3.start();

        sc.close();
    }
}
