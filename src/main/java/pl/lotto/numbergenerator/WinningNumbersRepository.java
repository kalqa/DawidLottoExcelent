package pl.lotto.numbergenerator;

import java.time.LocalDateTime;

public interface WinningNumbersRepository {
    WinningNumbers save(WinningNumbers winningNumbers);
    WinningNumbers findWinningNumbersByDrawDate(LocalDateTime drawDate);

}
