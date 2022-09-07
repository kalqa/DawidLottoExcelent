package pl.lotto.numberreceiver;


import pl.lotto.drawdategenerator.DrawDataGeneratorFacade;

public class NumberReceiverConfiguration {

    NumberReceiverFacade createModuleForTests(TicketRepository ticketRepositoryTestImpl) {

        NumbersValidator numbersValidator = new NumbersValidator();
        DrawDataGeneratorFacade dataGeneratorFacade = new DrawDataGeneratorFacade();

        return new NumberReceiverFacade(numbersValidator,ticketRepositoryTestImpl,dataGeneratorFacade);
    }
}
