package com.solvathon.lti.AntonCrud.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payment_schedules")
public class PaymentSchedules {
	
	@Id
	@Column(name="payment_due_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentDueId;
	
	@Column(name="payment_due_date")
	private Date paymentDueDate;
	
	@Column(name="payment_due_amount")
	private double paymentDueAmount;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="receiptno")
	private PolicyPayments policyPayments;

	public PaymentSchedules(int paymentDueId, Date paymentDueDate, double paymentDueAmount,
			PolicyPayments policyPayments) {
		super();
		this.paymentDueId = paymentDueId;
		this.paymentDueDate = paymentDueDate;
		this.paymentDueAmount = paymentDueAmount;
		this.policyPayments = policyPayments;
	}

	public PaymentSchedules() {
		super();
	}

	public int getPaymentDueId() {
		return paymentDueId;
	}

	public void setPaymentDueId(int paymentDueId) {
		this.paymentDueId = paymentDueId;
	}

	public Date getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public double getPaymentDueAmount() {
		return paymentDueAmount;
	}

	public void setPaymentDueAmount(double paymentDueAmount) {
		this.paymentDueAmount = paymentDueAmount;
	}

	public PolicyPayments getPolicyPayments() {
		return policyPayments;
	}

	public void setPolicyPayments(PolicyPayments policyPayments) {
		this.policyPayments = policyPayments;
	}

	@Override
	public String toString() {
		return "PaymentSchedules [paymentDueId=" + paymentDueId + ", paymentDueDate=" + paymentDueDate
				+ ", paymentDueAmount=" + paymentDueAmount + ", policyPayments=" + policyPayments + "]";
	}
	
	
}
