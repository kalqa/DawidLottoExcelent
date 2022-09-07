package pl.lotto.numberreceiver;


public class NumberReceiverConfiguration {

    NumberReceiverFacade createModuleForTests() {
        return new NumberReceiverFacade(new NumbersValidator());
    }
}
