package pl.lotto.drawdategenerator;

import java.time.LocalDateTime;

public class DrawDataGeneratorFacade {

    DrawDataGenerator drawDataGenerator = new DrawDataGenerator();

    public LocalDateTime getNextDrawDate() {
        return drawDataGenerator.generateNextDrawDate();
    }
}
