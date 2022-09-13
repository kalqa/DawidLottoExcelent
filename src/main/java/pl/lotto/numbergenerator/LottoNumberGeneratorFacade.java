package pl.lotto.numbergenerator;


import java.time.LocalDateTime;
import java.util.List;

public class LottoNumberGeneratorFacade {

    WinningNumbersRepository repository;

    public LottoNumberGeneratorFacade(WinningNumbersRepository repository) {
        this.repository = repository;
    }

    public List<Integer> getGeneratedNumbers(LocalDateTime drawDate) {
        return repository.findWinningNumbersByDrawDate(drawDate);
    }
}
