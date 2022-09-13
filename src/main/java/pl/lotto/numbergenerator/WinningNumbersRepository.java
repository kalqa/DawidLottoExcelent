package pl.lotto.numbergenerator;

import java.time.LocalDateTime;
import java.util.List;

public interface WinningNumbersRepository {
    WinningNumbers save(WinningNumbers winningNumbers);
    List<Integer> findWinningNumbersByDrawDate(LocalDateTime drawDate);

}
