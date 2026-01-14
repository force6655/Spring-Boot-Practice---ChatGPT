package com.example.Spring.Boot.Practice.Service;


public interface CalculatorService {
    int add(int numA, int numB);

    int subtract(int numA, int numB);

    int multiply(int numA, int numB);

    int divide(int numA, int numB);  // 注意：除以 0 要丟例外
}


