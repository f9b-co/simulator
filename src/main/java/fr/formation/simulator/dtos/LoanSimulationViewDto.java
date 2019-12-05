package fr.formation.simulator.dtos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public interface LoanSimulationViewDto {

    BigDecimal getAmount();
    String getLoanType();
    LocalDate getStartDate();
    BigInteger getDuration();
    BigDecimal getLoanRate();
    BigDecimal getInsuranceRate();

}
