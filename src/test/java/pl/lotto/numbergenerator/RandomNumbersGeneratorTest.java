package pl.lotto.numbergenerator;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomNumbersGeneratorTest {

    @Test
    void should_return_true_when_numberGenerator_generated_expected_poolNumbers() {
        // given
        LottoNumberGeneratorFacade generatorFacade = new LottoNumberGeneratorFacade();
        int numberPool = 6;

        // when
        Set<Integer> generatedNumbers = generatorFacade.getGeneratedNumbers();

        // then
        assertEquals(generatedNumbers.size(), numberPool);
    }

    @Test
    void should_pass_when_generatedNumbers_are_from_expected_range() {
        // given
        LottoNumberGeneratorFacade generatorFacade = new LottoNumberGeneratorFacade();

        // when
        Set<Integer> generatedNumbers = generatorFacade.getGeneratedNumbers();

        // then
        for (Integer number : generatedNumbers) {
            assertTrue(number > 0 && number < 100);
        }
    }
}