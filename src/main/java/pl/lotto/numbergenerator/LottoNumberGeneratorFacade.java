package pl.lotto.numbergenerator;


import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class LottoNumberGeneratorFacade {

    WinningNumbersRepository repository;

    public WinningNumbers getGeneratedNumbers(LocalDateTime drawDate) {
        return repository.findWinningNumbersByDrawDate(drawDate);
    }
}
