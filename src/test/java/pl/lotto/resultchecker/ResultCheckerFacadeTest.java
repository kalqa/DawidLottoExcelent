package pl.lotto.resultchecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.lotto.numbergenerator.LottoNumberGeneratorFacade;
import pl.lotto.numberreceiver.NumberReceiverFacade;
import pl.lotto.numberreceiver.Ticket;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ResultCheckerFacadeTest {
    private static final NumberReceiverFacade mockReceiverFacade =
            mock(NumberReceiverFacade.class);
    private static final LottoNumberGeneratorFacade mockGeneratorFacade =
            mock(LottoNumberGeneratorFacade.class);


    @ParameterizedTest
    @MethodSource("numbersProvider")
    void should_pass_when_resultChecker_return_correct_value(long expectedResult,
                                                             List<Integer> playerGivenNumbers,
                                                             List<Integer> randomNumbers) {
        // given
        mockUserInputAndWinNumbers(playerGivenNumbers, randomNumbers);
        ResultCheckerFacade checkerFacade =
                new ResultCheckerFacade(mockReceiverFacade, mockGeneratorFacade);

        // when
        int result = checkerFacade.checkResult("token");

        // then
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> numbersProvider() {
        final Arguments arg1 = Arguments.of(6,
                List.of(1, 2, 3, 4, 5, 6),
                List.of(1, 2, 3, 4, 5, 6));

        final Arguments arg2 = Arguments.of(4,
                List.of(1, 2, 3, 4, 5, 6),
                List.of(6, 9, 5, 2, 11, 1));

        final Arguments arg3 = Arguments.of(0,
                List.of(1, 2, 3, 4, 5, 6),
                List.of(7, 8, 9, 10, 11, 12));

        final Arguments arg4 = Arguments.of(1,
                List.of(1, 2, 3, 4, 5, 6),
                List.of(6, 8, 9, 10, 11, 12));

        return Stream.of(arg1, arg2, arg3, arg4);
    }
    private void mockTicket(Ticket ticket){
        when(mockReceiverFacade.getTicket("token")).thenReturn(ticket);
    }

    private void mockUserInputAndWinNumbers(List<Integer> userNumbers, List<Integer> generatedNumbers) {
        Ticket ticket = new Ticket(userNumbers);
        mockTicket(ticket);
        when(mockReceiverFacade.getTicket("token").getNumbers()).thenReturn(userNumbers);
        when(mockGeneratorFacade.getGeneratedNumbers(mockReceiverFacade
                        .getTicket("token")
                        .getDrawDate())
                .getWinningNumbers())
                .thenReturn(generatedNumbers);
    }
}

