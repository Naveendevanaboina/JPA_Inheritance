package com.neoteric.japconnection.japconnection.emidemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public class TransactionService {

    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public Transaction saveTransaction(Transaction transaction) {
        entityManager.persist(transaction);
        entityManager.flush();
        return transaction;
    }


    public Transaction findTransactionById(String transactionId) {
        try {
            return entityManager.createQuery(
                            "SELECT t FROM Transaction t WHERE t.transactionId = :transactionId", Transaction.class)
                    .setParameter("transactionId", transactionId)
                    .getSingleResult();
        } catch (Exception e) {
            return null;  // Return null if the transaction isn't found
        }
    }

    // Save an EMI
    @Transactional
    public EMI saveEMI(EMI emi) {
        entityManager.persist(emi);
        entityManager.flush();
        return emi;
    }

    // Find an EMI by its associated Transaction
    public EMI findEMIByTransaction(Transaction transaction) {
        try {
            return entityManager.createQuery(
                            "SELECT e FROM EMI e WHERE e.transaction = :transaction", EMI.class)
                    .setParameter("transaction", transaction)
                    .getSingleResult();
        } catch (Exception e) {
            return null;  // Return null if the EMI is not found
        }
    }

    public void setEntityManager(EntityManager entityManager) {
    }
}

