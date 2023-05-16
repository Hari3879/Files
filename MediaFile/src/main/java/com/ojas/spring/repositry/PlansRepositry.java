package com.ojas.spring.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.spring.entity.Plans;
@Repository
public interface PlansRepositry extends JpaRepository<Plans, Integer> {

}
