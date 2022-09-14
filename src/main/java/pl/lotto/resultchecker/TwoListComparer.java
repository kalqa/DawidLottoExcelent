package pl.lotto.resultchecker;


import pl.lotto.numbergenerator.WinningNumbers;

import java.util.*;

class TwoListComparer {

    int howManyNumbersPlayerHit(List<Integer> playerNumbers, WinningNumbers generatedNumbers) {
        return (int) playerNumbers.stream()
                .filter(generatedNumbers.getWinningNumbers()::contains)
                .count();
    }
}

