package com.Kiwi.Dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kiwi.Dashboard.Entity.KpiSnapshot;

@Repository
public interface KpiRepository extends JpaRepository<KpiSnapshot, Long> {

}
