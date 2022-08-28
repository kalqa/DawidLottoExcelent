package pl.lotto.numbergenerator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class RandomNumbersGenerator {

    private final Random random;

    RandomNumbersGenerator(Random random) {
        this.random = random;
    }

    Set<Integer> generateRandomNumbers(int howManyNumbers, int minNumber, int maxNumber) {
        Set<Integer> generatedNumbers = new HashSet<>();

        while (generatedNumbers.size() < howManyNumbers) {
            generatedNumbers.add(random.nextInt(maxNumber - minNumber + 1) + minNumber);
        }
        return generatedNumbers;
    }
}
