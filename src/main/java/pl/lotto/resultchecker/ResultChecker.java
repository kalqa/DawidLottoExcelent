package pl.lotto.resultchecker;


import java.util.List;

class ResultChecker {

    long howManyNumbersPlayerHit(List<Integer> playerNumbers, List<Integer> generatedNumbers) {
        return playerNumbers.stream()
                .filter(generatedNumbers::contains)
                .count();
    }
}

