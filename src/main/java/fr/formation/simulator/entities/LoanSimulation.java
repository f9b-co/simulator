package fr.formation.simulator.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
public class LoanSimulation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private BigDecimal amount;
    @Column(length = 32, nullable = false)
    private String loanType;
    @Column(nullable = false)
    private LocalDate startSate;
    @Column(precision = 2, nullable = false)
    private BigInteger duration;
    @Column(nullable = false, scale = 2)
    private BigDecimal loanRate;
    @Column(nullable = false, scale = 2)
    private BigDecimal insuranceRate;

    public LoanSimulation () {
        //
    }

    public Long getId() {
        return id;
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
