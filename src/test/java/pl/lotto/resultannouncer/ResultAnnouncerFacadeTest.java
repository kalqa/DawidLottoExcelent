package pl.lotto.resultannouncer;

import org.junit.jupiter.api.Test;
import pl.lotto.resultchecker.ResultCheckerFacade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ResultAnnouncerFacadeTest {

    private static final ResultCheckerFacade mockCheckerFacade =
            mock(ResultCheckerFacade.class);

    @Test
    void should_pass_when_getPlayerResult_return_expected_message() {
        // given
        long hitsNumbers = 0;
        mockNumbers(hitsNumbers);
        ResultAnnouncerFacade announcerFacade = new ResultAnnouncerFacade(mockCheckerFacade);

        // when
        String message = announcerFacade.getPlayerResult("1234");

        // then
        assertEquals("Player with token: 1234 hit 0 numbers", message);
    }

    private void mockNumbers(long hitsNumber) {
        when(mockCheckerFacade.checkResult("token")).thenReturn(hitsNumber);
    }

}