
package com.Kiwi.Dashboard.Service;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Kiwi.Dashboard.Repository.TransactionRepository;

@Service
public class KpiService {

    @Autowired
    private TransactionRepository transactionRepository;

    public int getAllTransactions() {
        return transactionRepository.findAll().size();
    }
}
