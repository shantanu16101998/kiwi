package com.Kiwi.Dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kiwi.Dashboard.Entity.Refund;

@Repository
public interface RefundRepository extends JpaRepository<Refund, Long> {

}
