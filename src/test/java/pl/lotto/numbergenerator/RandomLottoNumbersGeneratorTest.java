package pl.lotto.numbergenerator;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomLottoNumbersGeneratorTest {

    WinningNumbersRepository repository = new WinningNumbersRepositoryTestImpl();
    @Test
    void should_return_true_when_numberGenerator_generated_expected_poolNumbers() {
        // given

        LocalDateTime dateTime = LocalDateTime.of(2022, 9, 10, 18, 0);
        LottoNumberGeneratorFacade generatorFacade = new LottoNumberGeneratorConfiguration().createModuleForTests(repository);

        int numberPool = 6;

        // when
        List<Integer> generatedNumbers = generatorFacade.getGeneratedNumbers(dateTime);

        // then
        assertEquals(numberPool, generatedNumbers.size());
    }

    @Test
    void should_pass_when_generatedNumbers_are_from_expected_range() {
        // given
        LocalDateTime dateTime = LocalDateTime.of(2022, 9, 10, 18, 0);
        LottoNumberGeneratorFacade generatorFacade = new LottoNumberGeneratorConfiguration().createModuleForTests(repository);

        // when
        List<Integer> generatedNumbers = generatorFacade.getGeneratedNumbers(dateTime);

        // then
        for (Integer number : generatedNumbers) {
            assertTrue(number > 0 && number < 100);
        }
    }
}