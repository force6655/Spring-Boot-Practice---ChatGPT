package com.example.Spring.Boot.Practice.Entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
public class CalculationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String operation;
    private int numA;
    private int numB;
    private int result;
    private LocalDateTime createdAt;

    // 建議一定要有
    protected CalculationRecord() {}

    public CalculationRecord(
            String operation,
            int numA,
            int numB,
            int result,
            LocalDateTime createdAt) {
        this.operation = operation;
        this.numA = numA;
        this.numB = numB;
        this.result = result;
        this.createdAt = createdAt;
    }

    // getters / setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

