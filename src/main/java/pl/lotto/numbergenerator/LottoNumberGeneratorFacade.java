package pl.lotto.numbergenerator;

import java.util.Random;
import java.util.Set;

import static pl.lotto.numbergenerator.LottoNumberGeneratorConfiguration.*;

public class LottoNumberGeneratorFacade {
    RandomNumbersGenerator generator = new RandomNumbersGenerator(new Random());

    public Set<Integer> getGeneratedNumbers() {
        return generator.generateRandomNumbers(NUMBER_POOL, LOWER_RANGE, UPPER_RANGE);
    }
}
