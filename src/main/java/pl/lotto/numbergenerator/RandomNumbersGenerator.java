package pl.lotto.numbergenerator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RandomNumbersGenerator {

    private final SecureRandom random;

    RandomNumbersGenerator(SecureRandom random) {
        this.random = random;
    }

    List<Integer> generateRandomNumbers(int howManyNumbers, int minNumber, int maxNumber) {
        Set<Integer> generatedNumbers = new HashSet<>();

        while (generatedNumbers.size() < howManyNumbers) {
            generatedNumbers.add(random.nextInt(maxNumber - minNumber + 1) + minNumber);
        }

//        Set<Integer> generatedNumbers = random.ints(howManyNumbers,minNumber,maxNumber)
//                .boxed()
//                .collect(toSet());

        return new ArrayList<>(generatedNumbers);
    }
}
