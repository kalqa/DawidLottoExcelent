package pl.lotto.numbergenerator;

import java.security.SecureRandom;
import java.util.List;

import static pl.lotto.numbergenerator.LottoNumberGeneratorConfiguration.*;

public class LottoNumberGeneratorFacade {
    RandomNumbersGenerator generator = new RandomNumbersGenerator(new SecureRandom());

    public List<Integer> getGeneratedNumbers() {
        return generator.generateRandomNumbers(NUMBER_POOL, LOWER_RANGE, UPPER_RANGE);
    }
}
