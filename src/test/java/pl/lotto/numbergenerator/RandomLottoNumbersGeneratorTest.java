package pl.lotto.numbergenerator;

import org.junit.jupiter.api.Test;
import pl.lotto.drawdategenerator.DrawDataGeneratorFacade;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomLottoNumbersGeneratorTest {

    WinningNumbersRepository repositoryInTest = new WinningNumbersRepositoryTestImpl();
    @Test
    void should_return_true_when_numberGenerator_generated_expected_poolNumbers() {
        // given
        LocalDateTime dateTime = new DrawDataGeneratorFacade().getNextDrawDate();
        LottoNumberGeneratorFacade generatorFacade  = new LottoNumberGeneratorFacade(repositoryInTest);
        new LottoNumberGeneratorConfiguration().generateNumbersForTest(repositoryInTest);

        int numberPool = 6;

        // when
        WinningNumbers winningNumbers = generatorFacade.getGeneratedNumbers(dateTime);

        // then
        assertEquals(numberPool, winningNumbers.getWinningNumbers().size());
    }

    @Test
    void should_pass_when_generatedNumbers_are_from_expected_range() {
        // given
        LocalDateTime dateTime = new DrawDataGeneratorFacade().getNextDrawDate();
        LottoNumberGeneratorFacade generatorFacade  = new LottoNumberGeneratorFacade(repositoryInTest);
        new LottoNumberGeneratorConfiguration().generateNumbersForTest(repositoryInTest);

        // when
        WinningNumbers winningNumbers = generatorFacade.getGeneratedNumbers(dateTime);

        // then
        for (Integer number : winningNumbers.getWinningNumbers()) {
            assertTrue(number > 0 && number < 100);
        }
    }

}