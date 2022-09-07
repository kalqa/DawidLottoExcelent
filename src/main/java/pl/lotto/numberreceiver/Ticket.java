package pl.lotto.numberreceiver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
//@Table
//@Entity
public class Ticket {

    //    @Id
    private final String token = UUID.randomUUID().toString();
    private List<Integer> numbers;
}

