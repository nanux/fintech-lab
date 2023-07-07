package net.brokes.fintech.service;

import net.brokes.fintech.model.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static net.brokes.fintech.model.TransactionType.DEBIT;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(int accountNumber) {
        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(DEBIT, ZonedDateTime.now(), 1111, "USD", BigDecimal.valueOf(100.00), "Starbucks", "https://www.starbucks.com/"));
        transactions.add(new Transaction(DEBIT, ZonedDateTime.now(), 1111, "USD", BigDecimal.valueOf(100.00), "Starbucks", "https://www.starbucks.com/"));
        transactions.add(new Transaction(DEBIT, ZonedDateTime.now(), 1111, "USD", BigDecimal.valueOf(100.00), "Starbucks", "https://www.starbucks.com/"));
        transactions.add(new Transaction(DEBIT, ZonedDateTime.now(), 1111, "USD", BigDecimal.valueOf(100.00), "Starbucks", "https://www.starbucks.com/"));
        return transactions;

    }
}
