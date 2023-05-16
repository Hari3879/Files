package com.ojas.spring.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.spring.entity.PlansHistory;

@Repository
public interface HistoryRepo extends JpaRepository<PlansHistory, Integer> {

}
