package pl.lotto.numberreceiver;

import java.util.List;

public interface SampleNumbersFromUser {

    default List<Integer> sampleSixCorrectNumbersFromUser() {
        return List.of(1, 2, 3, 4, 5, 6);
    }
}
