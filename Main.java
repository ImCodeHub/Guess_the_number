import java.io.IO;

class TicketCounter {
    private int availableTickets = 5;

    // synchronized: this keyword basically allow one thread to access this at one time.
    public synchronized void bookTicket(String passengerName, int numberOfTickets) throws InterruptedException {
        while(availableTickets<numberOfTickets){
            IO.println(passengerName + " No enough tickets are available please wait..");
            wait(); //it will allow a thread (passenger) to wait in the waiting list.
        }
        availableTickets = availableTickets - numberOfTickets;
        IO.println(passengerName + " you have booked " + numberOfTickets + " sit(s) successfully.");
        IO.println("Now available tickets are : " + availableTickets);
    }

    public synchronized void cancelTicket(int canceledTicket){
        availableTickets = availableTickets + canceledTicket;
        IO.println("Now number of Tickets has been increased so you can book the tickets");
        notifyAll(); // it will notify all the threads are in the waiting list.
//        notify(); //it will notify only one thread in waiting list
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
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main{
    void main(String[] args) throws InterruptedException {
        TicketCounter tc = new TicketCounter();

        //these are the threads
        Passenger p1 = new Passenger("uday",2, tc);
        Passenger p2 = new Passenger("divesh",2, tc);
        Passenger p3 = new Passenger("Arati",2, tc);
        Passenger p4 = new Passenger("Parth",2, tc);

        //start(): it will start executing (invoking) the all threads at the same time.
        p1.start();
        p2.start();
        p3.start();
        p4.start();


        Thread.sleep(10000);

        IO.println("Jaya has canceled some tickets");


        Thread.sleep(5000);

        tc.cancelTicket(5);





    }


}
