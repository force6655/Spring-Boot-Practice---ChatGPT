package com.example.Spring.Boot.Practice.Service;

import com.example.Spring.Boot.Practice.Entity.CalculationRecord;
import com.example.Spring.Boot.Practice.Exception.BadRequestException;
import com.example.Spring.Boot.Practice.Repository.CalculationRecordRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    //JPA practice
    private final CalculationRecordRepository recordRepository;

    public CalculatorServiceImpl(CalculationRecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }


    @Override
    public int add(int a, int b) {

        int result = a + b;
        CalculationRecord record = new CalculationRecord("add", a, b, result, LocalDateTime.now());
        recordRepository.save(record);
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        int result = a - b;
        CalculationRecord record = new CalculationRecord("subtract", a, b, result, LocalDateTime.now());
        recordRepository.save(record);
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        int result = a * b;
        CalculationRecord record = new CalculationRecord("multiply", a, b, result, LocalDateTime.now());
        recordRepository.save(record);
        return result;
    }

    @Override
    public int divide(int a, int b) {

        if (b == 0) {
            throw new BadRequestException("Cannot divide by zero");
        }


        int result = a / b;
        CalculationRecord record = new CalculationRecord("add", a, b, result, LocalDateTime.now());
        recordRepository.save(record);
        return result;
    }

}