package com.assignment.entity;

import java.sql.Timestamp;
import java.text.DecimalFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "assignment_loan_info")
public class AssignmentLoanInformation {
	@NotNull
	@Id
	private int AssignmentLoanInfoId;
	@ManyToOne
	@JoinColumn(name = "asssignment_id")
	private Assignments assignment_id;
	
	private DecimalFormat fundingAmount;
	private Long tenure;
	private DecimalFormat installmentAmount;
	@NotNull
	private Timestamp createdDate;
	@NotNull
	private Timestamp updatedDate;
	@NotNull
	private String createdUser;
	@NotNull
	private String UpdateUser;
	@NotNull
	private Boolean isActive;
	
}
