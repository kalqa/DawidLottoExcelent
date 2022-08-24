package pl.lotto.numberreceiver;

import pl.lotto.drawdategenerator.DrawDateGeneratorFacade;

public class NumberReceiverConfiguration {

    NumberReceiverFacade createModuleForTests() {
        return new NumberReceiverFacade(new DrawDateGeneratorFacade());
    }
}
