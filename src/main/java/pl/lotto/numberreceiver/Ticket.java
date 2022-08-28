package pl.lotto.numberreceiver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    private String numbers;
}

