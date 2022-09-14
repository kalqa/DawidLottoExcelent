package pl.lotto.numbergenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class WinningNumbers {

    private List<Integer> winningNumbers;
    private LocalDateTime drawTime;

    public WinningNumbers(List<Integer> winningNumbers) {
        this.winningNumbers = winningNumbers;
    }
}
