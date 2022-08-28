package pl.lotto.resultchecker;

import java.util.HashSet;
import java.util.Set;

class NumbersTypeChanger {
    Set<Integer> changeStringToSet(String stringNumbers) throws NumberFormatException {
        Set<Integer> numbers = new HashSet<>();
        String[] splittedStringTable;

        splittedStringTable = stringNumbers.replaceAll(" ", "").split(",");

        for (String number : splittedStringTable) {
            numbers.add(Integer.parseInt(number));
        }

        return numbers;
    }
}
