package pl.lotto.numbergenerator;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RandomNumbersGenerator {

    private final SecureRandom random = new SecureRandom();
    WinningNumbersRepository repository;

    public RandomNumbersGenerator(WinningNumbersRepository repository) {
        this.repository = repository;
    }

    void generateRandomNumbers() {
        Set<Integer> generatedNumbers = new HashSet<>();

        while (generatedNumbers.size() < LottoNumberGeneratorConfiguration.NUMBER_POOL) {
            generatedNumbers.add(random.nextInt(LottoNumberGeneratorConfiguration.UPPER_RANGE -
                                                            LottoNumberGeneratorConfiguration.LOWER_RANGE + 1) +
                                                LottoNumberGeneratorConfiguration.LOWER_RANGE);
        }
        List<Integer> sixGeneratedNumbers = new ArrayList<>(generatedNumbers);
        WinningNumbers winningNumbers = new WinningNumbers(sixGeneratedNumbers, LocalDateTime.now());
        repository.save(winningNumbers);
    }

}
