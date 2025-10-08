import java.io.IO;

class TicketCounter{
    private int availableTickets = 5;

    //synchronized keyword will allow only one thread (passenger) at a time to access this method.
    public synchronized void bookTicket(String passengerName, int numberOfTicker) throws InterruptedException {
//        waiting list
        while(numberOfTicker>availableTickets){
            IO.println(passengerName + " No enough tickets are available so kindly wait...");
            wait(); //it will keep the thread(passenger) in the waiting list
        }
        availableTickets = availableTickets - numberOfTicker;
        IO.println(passengerName + " you have booked "+numberOfTicker+" sit(s) successfully.");
        IO.println("Now available sits: "+ availableTickets);
    }

    public synchronized void cancelTicket(int cancelledTickets){
        availableTickets = availableTickets + cancelledTickets;

        IO.println("now sit count has increased so you can book the tickets");

//        notify(); //it will notify only one thread (passenger)
        notifyAll(); // it will notify all waiting thread (passengers)
    }

}
class Passenger extends Thread{
    private String name;
    private int tickets;
    private TicketCounter tc;

    public Passenger(String name, int tickets, TicketCounter tc){
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

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TicketCounter tc = new TicketCounter();

        Passenger p1 = new Passenger("Yash",2, tc);
        Passenger p2 = new Passenger("karishma",2, tc);
        Passenger p3 = new Passenger("janakiram",2, tc);
        Passenger p4 = new Passenger("spider-man",2, tc);

        p1.start(); // this start method will envoke the every thread(passenger) at the same time.
        p2.start();
        p3.start();
        p4.start();


        Thread.sleep(10000);

        IO.println("Ankit has canceled Tickets");

        Thread.sleep(10000);

        tc.cancelTicket(5);



    }

}
