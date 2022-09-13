package pl.lotto.numberreceiver;

import java.util.List;

public interface TicketRepository  {

    Ticket save(Ticket ticket);
    Ticket findTicketByToken(String token);

}
