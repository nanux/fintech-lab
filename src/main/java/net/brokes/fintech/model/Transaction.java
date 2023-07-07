package net.brokes.fintech.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record Transaction(TransactionType type, ZonedDateTime date, int accountNumber, String currency, BigDecimal amount,
                          String merchantName, String merchantLogo) {
}
