package com.BankApp.Sb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankApp.Sb.model.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
