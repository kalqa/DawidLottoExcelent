package pl.lotto.resultchecker;


import java.util.*;

class TwoListComparer {

    int howManyNumbersPlayerHit(List<Integer> playerNumbers, List<Integer> generatedNumbers) {
        return (int) playerNumbers.stream()
                .filter(generatedNumbers::contains)
                .count();
    }

}

