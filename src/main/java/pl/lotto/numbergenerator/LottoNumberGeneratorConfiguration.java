package pl.lotto.numbergenerator;

public class LottoNumberGeneratorConfiguration {
    static final int LOWER_RANGE = 1;
    static final int UPPER_RANGE = 99;

    /**
     * NUMBER_POOL must be less than or equal to (UPPER_RANGE - LOWER_RANGE + 1)
     * because we need unique numbers and they cannot be duplicate
     */
    static final int NUMBER_POOL = 6;

    void generateNumbersForTest(WinningNumbersRepository repository){
        RandomNumbersGenerator generator = new RandomNumbersGenerator(repository);
        generator.generateRandomNumbers();
    }

}
