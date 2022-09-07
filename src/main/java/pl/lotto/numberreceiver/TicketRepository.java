package pl.lotto.numberreceiver;

public interface TicketRepository  {

    Ticket save(Ticket ticket);
    Ticket findTicketByToken(String token);
}
