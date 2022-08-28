package pl.lotto.resultchecker;


import java.util.Set;

class ResultChecker {

    int howManyNumbersPlayerHit(String numbersFromPlayer, Set<Integer> generatedNumbers) {
        NumbersTypeChanger changer = new NumbersTypeChanger();
        Set<Integer> playerNumbers = changer.changeStringToSet(numbersFromPlayer);

        int result = 0;
        for (Integer number : playerNumbers) {
            if (generatedNumbers.contains(number))
                result++;
        }
        return result;
    }
}

