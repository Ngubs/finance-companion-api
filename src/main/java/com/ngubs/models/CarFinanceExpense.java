package com.ngubs.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class CarFinanceExpense extends Expense {
    @Id
    private Integer id;
    private Integer termMonnths;
    private Double interest;
    private Double principalAmount;
    private Integer numberOfCompounds;
    private Double monthlyPayment;
    private Double totalAmount;

    @Override
    protected Double calculate(){
        totalAmount =  Math.pow((principalAmount *
                        (1 + ((interest / 100) / numberOfCompounds))),
                (numberOfCompounds * (double)(termMonnths / 12)));

        monthlyPayment = totalAmount /termMonnths;
        return totalAmount;
    }
}
