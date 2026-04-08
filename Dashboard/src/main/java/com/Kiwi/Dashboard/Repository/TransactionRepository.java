package com.Kiwi.Dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kiwi.Dashboard.Entity.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    
}
