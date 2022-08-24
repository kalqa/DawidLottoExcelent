package pl.lotto.numberreceiver;

import org.junit.jupiter.api.Test;
import pl.lotto.drawdategenerator.DrawDateGeneratorFacade;
import pl.lotto.numberreceiver.dto.NumberReceiverResultDto;
import static org.assertj.core.api.Assertions.assertThat;

class NumberReceiverFacadeTest implements SampleNumbersFromUser {


    @Test
    public void should_return_correct_message_when_validation_passed_with_six_numbers() {
        // given
        DrawDateGeneratorFacade drawDateGeneratorFacade = mock();
        NumberReceiverFacade numberReceiverFacade = new NumberReceiverConfiguration().createModuleForTests(

        );
//        List<Integer> numbersFromUser = List.of(1, 2, 3, 4, 5, 6);

        // when
        NumberReceiverResultDto result = numberReceiverFacade.inputNumbers(sampleSixCorrectNumbersFromUser());

        // then
        NumberReceiverResultDto expectedResult = new NumberReceiverResultDto("all went good");
        assertThat(result).isEqualTo(expectedResult);
    }

}
