package pl.lotto.resultchecker;

import pl.lotto.numbergenerator.LottoNumberGeneratorFacade;
import pl.lotto.numberreceiver.NumberReceiverFacade;

public class ResultCheckerFacade {
    NumberReceiverFacade numberReceiverFacade;
    LottoNumberGeneratorFacade numberGeneratorFacade;

    public ResultCheckerFacade(NumberReceiverFacade numberReceiverFacade, LottoNumberGeneratorFacade numberGeneratorFacade) {
        this.numberReceiverFacade = numberReceiverFacade;
        this.numberGeneratorFacade = numberGeneratorFacade;
    }

    public long checkResult(String token) {
        ResultChecker resultChecker = new ResultChecker();
        return resultChecker.howManyNumbersPlayerHit(
                numberReceiverFacade.getPlayerNumber(token),
                numberGeneratorFacade.getGeneratedNumbers());
    }
}
