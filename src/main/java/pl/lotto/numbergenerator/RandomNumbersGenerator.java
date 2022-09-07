package pl.lotto.numbergenerator;

import java.util.*;
import java.util.stream.Collectors;

class RandomNumbersGenerator {

    private final Random random;

    RandomNumbersGenerator(Random random) {
        this.random = random;
    }

    List<Integer> generateRandomNumbers(int howManyNumbers, int minNumber, int maxNumber) {
        Set<Integer> generatedNumbers = new HashSet<>();

        while (generatedNumbers.size() < howManyNumbers) {
            generatedNumbers.add(random.nextInt(maxNumber - minNumber + 1) + minNumber);
        }
        return new ArrayList<>(generatedNumbers);
    }
}
