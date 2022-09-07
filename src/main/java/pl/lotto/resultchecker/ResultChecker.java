package pl.lotto.resultchecker;


import java.util.List;

class ResultChecker {

    int howManyNumbersPlayerHit(List<Integer> playerNumbers, List<Integer> generatedNumbers) {

        int result = 0;
        for (Integer number : playerNumbers) {
            if (generatedNumbers.contains(number))
                result++;
        }
        return result;
    }
}

