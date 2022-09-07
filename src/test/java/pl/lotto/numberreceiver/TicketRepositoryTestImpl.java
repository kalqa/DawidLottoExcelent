package pl.lotto.numberreceiver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketRepositoryTestImpl implements TicketRepository {

    Map<String, Ticket> database = new ConcurrentHashMap<>();

    @Override
    public Ticket save(Ticket ticket) {
        return database.put(ticket.getToken(), ticket);
    }

    @Override
    public Ticket findTicketByToken(String token) {
        return database.get(token);
    }
}
