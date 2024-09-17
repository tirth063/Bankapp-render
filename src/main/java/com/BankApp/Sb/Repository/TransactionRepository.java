package com.BankApp.Sb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankApp.Sb.model.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountId(Long accountId);
}
