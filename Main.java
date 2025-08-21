class TicketCounter {
    public int availableTickets = 5;

    public synchronized void bookTicket(String passengerName, int numberOfTicket) throws InterruptedException {
        while (availableTickets < numberOfTicket) {
            System.out.println("Not enough tickets are available for " + passengerName + " so kindly wait...");
            wait();
        }

        System.out.println(passengerName + " your ticket has booked, you booked " + numberOfTicket + " tickets");
        availableTickets = availableTickets - numberOfTicket;
        System.out.println("Total available tickets are: " + availableTickets);
    }

    public synchronized void addTicket(int tickets){
        availableTickets = availableTickets+tickets;
        notifyAll();
    }

}

class Passenger extends Thread {
    private String name;
    private int tickets;
    private TicketCounter tc;

    public Passenger(String name, int tickets, TicketCounter tc) {
        this.name = name;
        this.tickets = tickets;
        this.tc = tc;
    }


    @Override
    public void run() {
        try {
            tc.bookTicket(name, tickets);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TicketCounter tcounter = new TicketCounter();

        Passenger p1 = new Passenger("Prachi", 2, tcounter);
        Passenger p2 = new Passenger("Aqsa", 3, tcounter);
        Passenger p3 = new Passenger("Sujay", 2, tcounter);
        Passenger p4 = new Passenger("Yuvraj", 3, tcounter);

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        Thread.sleep(10000);

        tcounter.addTicket(5);
    }

}
