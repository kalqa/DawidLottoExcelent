package pl.lotto.numbergenerator;


import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WinningNumbersRepositoryTestImpl implements WinningNumbersRepository{

    Map<LocalDateTime, WinningNumbers> database = new ConcurrentHashMap<>();
    @Override
    public WinningNumbers save(WinningNumbers winningNumbers) {
        return database.put(LocalDateTime.now(),winningNumbers);
    }

    @Override
    public WinningNumbers findWinningNumbersByDrawDate(LocalDateTime drawDate) {
        return database.get(drawDate);
    }

}
