package pl.lotto.drawdategenerator;

import java.time.LocalDateTime;

class DrawDataGenerator {

    LocalDateTime generateNextDrawDate() {
        return LocalDateTime.of(2022,9,10,18,0);
    }
}
