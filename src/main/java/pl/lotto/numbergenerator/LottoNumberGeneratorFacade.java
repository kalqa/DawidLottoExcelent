package pl.lotto.numbergenerator;

import java.util.List;
import java.util.Random;

import static pl.lotto.numbergenerator.LottoNumberGeneratorConfiguration.*;

public class LottoNumberGeneratorFacade {
    RandomNumbersGenerator generator = new RandomNumbersGenerator(new Random());

    public List<Integer> getGeneratedNumbers() {
        return generator.generateRandomNumbers(NUMBER_POOL, LOWER_RANGE, UPPER_RANGE);
    }
}
