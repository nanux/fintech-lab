package net.brokes.fintech.controller;

import net.brokes.fintech.model.Transaction;
import net.brokes.fintech.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping(path = "/transactions/{accountNumber}", produces = "application/json")
    public Iterable<Transaction> getTransactions(@PathVariable int accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
