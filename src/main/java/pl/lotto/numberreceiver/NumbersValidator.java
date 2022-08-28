package pl.lotto.numberreceiver;

import java.util.Set;

class NumbersValidator {
    NumbersTypeChanger typeChanger;

    NumbersValidator(NumbersTypeChanger typeChanger) {
        this.typeChanger = typeChanger;
    }

    boolean areCorrectNumbers(String userNumbers) {
        try {
            Set<Integer> numbers = typeChanger.changeStringToSet(userNumbers);

            if (numbers.size() != 6) {
                return false;
            }

            for (Integer number : numbers) {
                if (isNotNumberFromRange(number, 1, 99)) {
                    return false;
                }
            }
        } catch (NumberFormatException e) {
            return false;
        }


        return true;
    }

    private boolean isNotNumberFromRange(int number, int min, int max) {
        return number < min || number > max;
    }
}
