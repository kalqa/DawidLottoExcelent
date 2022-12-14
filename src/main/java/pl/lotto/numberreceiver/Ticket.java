package pl.lotto.numberreceiver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Ticket {

    private final String token = UUID.randomUUID().toString();
    private List<Integer> numbers;
    private LocalDateTime drawDate;

    public Ticket(List<Integer> numbersFromUser) {
        this.numbers = numbersFromUser;
    }
}

