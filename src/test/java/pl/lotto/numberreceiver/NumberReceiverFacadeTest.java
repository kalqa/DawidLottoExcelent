package pl.lotto.numberreceiver;

import org.junit.jupiter.api.Test;
import pl.lotto.numberreceiver.dto.NumberReceiverResultDto;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NumberReceiverFacadeTest {

    @Test
    public void should_return_correct_message_when_validation_passed_with_six_numbers() {
        // given
        NumberReceiverFacade numberReceiverFacade = new NumberReceiverConfiguration().createModuleForTests();
        List<Integer> numbersFromUser = List.of(1, 23, 3, 4, 58, 6);

        // when
        NumberReceiverResultDto result = numberReceiverFacade.inputNumbers(numbersFromUser);

        // then
        NumberReceiverResultDto expectedResult =
                new NumberReceiverResultDto(NumberReceiverMessageProvider.CORRECT_INPUT_NUMBERS_MESSAGE);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_incorrect_message_when_validation_failed() {
        // given
        NumberReceiverFacade numberReceiverFacade = new NumberReceiverConfiguration().createModuleForTests();
        List<Integer> numbersFromUser = List.of(1, 2, 3, 5, 8, 92, 6);

        // when
        NumberReceiverResultDto result = numberReceiverFacade.inputNumbers(numbersFromUser);

        // then
        NumberReceiverResultDto expectedResult =
                new NumberReceiverResultDto(NumberReceiverMessageProvider.INCORRECT_INPUT_NUMBERS_MESSAGE);
        assertThat(result).isEqualTo(expectedResult);
    }
}
