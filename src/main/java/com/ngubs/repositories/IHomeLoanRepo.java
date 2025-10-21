package com.ngubs.repositories;

import com.ngubs.models.HomeLoanExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHomeLoanRepo extends JpaRepository<HomeLoanExpense, Integer> {
}
