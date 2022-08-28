package pl.lotto.drawdategenerator;

import java.time.LocalDateTime;

class DrawDataGenerator {

    LocalDateTime generateNextDrawDate() {
        return LocalDateTime.now().plusDays(7);
    }
}
