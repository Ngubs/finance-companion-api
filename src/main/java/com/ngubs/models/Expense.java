package com.ngubs.models;

import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


public abstract class Expense {
     protected abstract Double calculate();
}
