package com.Kiwi.Dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kiwi.Dashboard.Entity.Merchant;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {

}
