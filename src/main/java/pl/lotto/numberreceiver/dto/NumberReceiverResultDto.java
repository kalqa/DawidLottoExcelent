package pl.lotto.numberreceiver.dto;

import java.time.LocalDateTime;

public record NumberReceiverResultDto(
        String resultMessage,
        LocalDateTime drawDate
) {
}
