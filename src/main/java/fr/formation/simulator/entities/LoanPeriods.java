package fr.formation.simulator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class LoanPeriods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date period;
    private BigDecimal depreciatedCapital;
    private BigDecimal interest;
    private BigDecimal outstandingCapital;
    private BigDecimal periodRepayment;
    private BigDecimal insurance;
    private BigDecimal totalCost;

    public LoanPeriods() {
        //
    }

    public LoanPeriods(Date period, BigDecimal depreciatedCapital, BigDecimal interest, BigDecimal outstandingCapital, BigDecimal periodRepayment, BigDecimal insurance, BigDecimal totalCost) {
        this.period = period;
        this.depreciatedCapital = depreciatedCapital;
        this.interest = interest;
        this.outstandingCapital = outstandingCapital;
        this.periodRepayment = periodRepayment;
        this.insurance = insurance;
        this.totalCost = totalCost;
    }

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public BigDecimal getDepreciatedCapital() {
        return depreciatedCapital;
    }

    public void setDepreciatedCapital(BigDecimal depreciatedCapital) {
        this.depreciatedCapital = depreciatedCapital;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getOutstandingCapital() {
        return outstandingCapital;
    }

    public void setOutstandingCapital(BigDecimal outstandingCapital) {
        this.outstandingCapital = outstandingCapital;
    }

    public BigDecimal getPeriodRepayment() {
        return periodRepayment;
    }

    public void setPeriodRepayment(BigDecimal periodRepayment) {
        this.periodRepayment = periodRepayment;
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
}
