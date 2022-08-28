package pl.lotto.resultannouncer;

import pl.lotto.resultchecker.ResultCheckerFacade;

public class ResultAnnouncerFacade {
    ResultCheckerFacade resultCheckerFacade;

    public ResultAnnouncerFacade(ResultCheckerFacade resultCheckerFacade) {
        this.resultCheckerFacade = resultCheckerFacade;
    }

    public String getPlayerResult(String token) {
        int result = resultCheckerFacade.checkResult(token);
        String message = "Player with token: " + token + " hit " + result + " numbers";

        return message;
    }
}
