package pl.lotto.numberreceiver;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.lotto.drawdategenerator.DrawDataGeneratorFacade;
import pl.lotto.numberreceiver.dto.NumberReceiverResultDto;

import java.util.List;

import static pl.lotto.numberreceiver.NumberReceiverMessageProvider.CORRECT_INPUT_NUMBERS_MESSAGE;
import static pl.lotto.numberreceiver.NumberReceiverMessageProvider.INCORRECT_INPUT_NUMBERS_MESSAGE;

@AllArgsConstructor
@NoArgsConstructor
public class NumberReceiverFacade {

    NumbersValidator validator;
    TicketRepository ticketRepository;
    DrawDataGeneratorFacade dataGeneratorFacade;

    public NumberReceiverResultDto inputNumbers(List<Integer> numbersFromUser) {
        if (!validator.areCorrectNumbers(numbersFromUser)) {
            return new NumberReceiverResultDto(INCORRECT_INPUT_NUMBERS_MESSAGE,null);
        }
        Ticket ticket = new Ticket(numbersFromUser);
        ticketRepository.save(ticket);

        return new NumberReceiverResultDto(CORRECT_INPUT_NUMBERS_MESSAGE, dataGeneratorFacade.getNextDrawDate());
    }

    public List<Integer> getPlayerNumber(String token) {
        Ticket ticket = ticketRepository.findTicketByToken(token);
        return ticket.getNumbers();

//        return List.of(1,2,3,4,5,6);
    }
}
