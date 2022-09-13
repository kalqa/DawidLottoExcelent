package pl.lotto.drawdategenerator;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DrawDataGeneratorFacadeTest {

    @Test
    void should_pass_when_drawDataGenerator_return_saturday() {

        // given
        DayOfWeek expectedDayOfWeek = DayOfWeek.SATURDAY;
        DrawDataGeneratorFacade dataGeneratorFacade = new DrawDataGeneratorFacade();

        // when
        DayOfWeek dayOfWeek = dataGeneratorFacade.getNextDrawDate().getDayOfWeek();

        // then
        assertEquals(expectedDayOfWeek, dayOfWeek);
    }

    @Test
    void should_pass_when_drawDataGenerator_return_future_date() {

        // given
        DrawDataGeneratorFacade dataGeneratorFacade = new DrawDataGeneratorFacade();

        // when
        LocalDateTime dateTime = dataGeneratorFacade.getNextDrawDate();

        // then
        assertTrue(dateTime.isAfter(LocalDateTime.now()));
    }
}