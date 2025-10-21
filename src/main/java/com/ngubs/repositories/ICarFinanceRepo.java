package com.ngubs.repositories;

import com.ngubs.models.CarFinanceExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarFinanceRepo extends JpaRepository<CarFinanceExpense, Integer> {
}
