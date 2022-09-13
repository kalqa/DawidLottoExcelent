package pl.lotto.resultchecker;

import pl.lotto.numbergenerator.LottoNumberGeneratorFacade;
import pl.lotto.numberreceiver.NumberReceiverFacade;
import pl.lotto.numberreceiver.Ticket;

public class ResultCheckerFacade {
    NumberReceiverFacade numberReceiverFacade;
    LottoNumberGeneratorFacade numberGeneratorFacade;

    public ResultCheckerFacade(NumberReceiverFacade numberReceiverFacade, LottoNumberGeneratorFacade numberGeneratorFacade) {
        this.numberReceiverFacade = numberReceiverFacade;
        this.numberGeneratorFacade = numberGeneratorFacade;
    }

    TwoListComparer listComparer = new TwoListComparer();

    public int checkResult(String token){
        Ticket ticket = numberReceiverFacade.getTicket(token);
        return listComparer.howManyNumbersPlayerHit(
                ticket.getNumbers(),
                numberGeneratorFacade.getGeneratedNumbers(ticket.getDrawDate()));
    }

}
