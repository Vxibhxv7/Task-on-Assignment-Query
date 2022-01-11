package com.assignment.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "assignment_personal_data")
public class AssignmentPersonalData {
	@Id
	@NotNull
	private int assignment_personal_data_id;
	
	@ManyToOne
	@JoinColumn(name = "assignment_id")
	private Assignments assignment_id;
	
	private String customerName;
	
	private String customerAddress;
	
	private Long customerPhoneNumber;
	
	private String customerSelfiePhoto;
	
	private String customerIdentityCardPhoto;
	
	private String customerFamilyCardPhoto;
	@NotNull
	private boolean customerIsMarried;
	
	private String customerSpouseIdentityCardPhoto;
	
	private String customerHousePhoto;
	
	private String customerHouse2Photo;
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
