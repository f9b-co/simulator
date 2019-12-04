package fr.formation.simulator.dtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;


public class LoanSimulationDto {
    @NotNull
    @Positive
    private BigDecimal amount;
    @NotBlank
    private String loanType;
    @NotNull
    @FutureOrPresent
    private LocalDate startSate;
    @NotNull
    @Positive
    private BigInteger duration;
    @NotNull
    @PositiveOrZero
    private BigDecimal loanRate;
    @NotNull
    @PositiveOrZero
    private BigDecimal insuranceRate;

    public LoanSimulationDto() {
        //
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public LocalDate getStartSate() {
        return startSate;
    }

    public void setStartSate(LocalDate startSate) {
        this.startSate = startSate;
    }

    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        this.duration = duration;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public BigDecimal getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(BigDecimal insuranceRate) {
        this.insuranceRate = insuranceRate;
    }
}
