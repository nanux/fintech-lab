package net.brokes.fintech;

import net.brokes.fintech.service.TransactionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    @Test
    void testFindAllByAccountNumber() {
        TransactionService transactionService = new TransactionService();
        assertEquals(4, transactionService.findAllByAccountNumber(1111).size());
    }

}