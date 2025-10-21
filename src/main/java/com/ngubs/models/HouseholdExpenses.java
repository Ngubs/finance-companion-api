package com.ngubs.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class HouseholdExpenses extends Expense{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double groceries;
    private Double utilities;
    private Double rent;

    @Override
    protected Double calculate(){
        return (groceries + utilities + rent);
    }


}
