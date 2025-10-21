package com.ngubs.repositories;

import com.ngubs.models.HouseholdExpenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHouseholdRepo extends JpaRepository<HouseholdExpenses, Integer> {
}
