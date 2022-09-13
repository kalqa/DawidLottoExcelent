package pl.lotto.drawdategenerator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class DrawDataGenerator {

    LocalDateTime generateNextDrawDate() {
        final LocalTime localTime = LocalTime.of(18, 0);
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(nowDateTime.getYear(), nowDateTime.getMonthValue(), nowDateTime.getDayOfMonth());

        long presentDayOfWeek = nowDateTime.getDayOfWeek().getValue();
        long plusDays = 6 - presentDayOfWeek;
        if (plusDays <= 0) plusDays += 7;
        return LocalDateTime.of(localDate, localTime).plusDays(plusDays);
    }

    public static void main(String[] args) {
        DrawDataGenerator generator = new DrawDataGenerator();
        System.out.println(generator.generateNextDrawDate());
    }
}
