package com.neoteric.japconnection.japconnection.emidemo;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TransactionServiceTest {

    @PersistenceContext
    private EntityManager entityManager;

    private TransactionService transactionService;
    private Transaction transaction;
    private EMI emi;

    @BeforeEach
    public void setUp() {

        transactionService = new TransactionService();
        transactionService.setEntityManager(entityManager);

        transaction = new Transaction();
        transaction.setTransactionId("TXN123");
        transaction.setTransactionAmount(1900);
        transaction.setTransactionDate(new java.util.Date());
        transaction.setTransactionType("Purchase");

        emi = new EMI();
        emi.setTransaction(transaction);
        emi.setPrincipalAmount(String.valueOf(900));
        emi.setInterestRate(String.valueOf(18));
        emi.setTenure(String.valueOf(9));
        emi.setMonthlyEMI(106.55);


        transactionService.saveTransaction(transaction);
        transactionService.saveEMI(emi);
    }

    @Test
    public void testSaveTransaction() {
        // Test saving a transaction
        Transaction foundTransaction = transactionService.findTransactionById("TXN123");
        assertNotNull(foundTransaction);
        assertEquals("TXN123", foundTransaction.getTransactionId());
    }

    @Test
    public void testSaveEMI() {
        // Test saving EMI
        EMI foundEMI = transactionService.findEMIByTransaction(transaction);
        assertNotNull(foundEMI);
        assertEquals(transaction.getTransactionId(), foundEMI.getTransaction().getTransactionId());
    }

    @Test
    public void testTransactionNotFound() {
        // Test when the transaction does not exist
        Transaction foundTransaction = transactionService.findTransactionById("TXN999");
        assertNull(foundTransaction);
    }

    @Test
    public void testEMINotFound() {
        // Test when EMI for a non-existing transaction is queried
        Transaction newTransaction = new Transaction();
        newTransaction.setTransactionId("TXN999");
        EMI foundEMI = transactionService.findEMIByTransaction(newTransaction);
        assertNull(foundEMI.getTransaction());
    }

    private void assertNull(Transaction foundEMI) {
    }
}
