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

    TwoListComparer listComparer = new TwoListComparer();

    public int checkResult(String token) {
        numberReceiverFacade.getTicket(token);
        return listComparer.howManyNumbersPlayerHit(
                numberReceiverFacade.getTicket(token).getNumbers(),
                numberGeneratorFacade.getGeneratedNumbers(numberReceiverFacade.getTicket(token).getDrawDate()));
    }

}
