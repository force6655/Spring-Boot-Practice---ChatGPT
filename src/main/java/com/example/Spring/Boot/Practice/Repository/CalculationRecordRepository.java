package com.example.Spring.Boot.Practice.Repository;

import com.example.Spring.Boot.Practice.Entity.CalculationRecord;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CalculationRecordRepository  extends JpaRepository<CalculationRecord, Long> {
}

