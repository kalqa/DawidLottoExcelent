package pl.lotto.numberreceiver;

import java.util.List;
import pl.lotto.drawdategenerator.DrawDateGeneratorFacade;
import pl.lotto.numberreceiver.dto.NumberReceiverResultDto;

public class NumberReceiverFacade {

    DrawDateGeneratorFacade drawDateGeneratorFacade;

    NumberReceiverFacade(DrawDateGeneratorFacade drawDateGeneratorFacade) {
        this.drawDateGeneratorFacade = drawDateGeneratorFacade;
    }

    public NumberReceiverResultDto inputNumbers(List<Integer> numbersFromUser) {
        return new NumberReceiverResultDto("all went good");
    }
}
