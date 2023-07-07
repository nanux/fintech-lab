package net.brokes.fintech.dto;

import net.brokes.fintech.model.TransactionType;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record TransactionDTO(TransactionType type, ZonedDateTime date, int accountNumber, String currency,
                             BigDecimal amount) {
}
