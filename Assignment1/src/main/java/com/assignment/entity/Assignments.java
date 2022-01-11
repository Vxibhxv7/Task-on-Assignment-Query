package com.assignment.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;
@Entity
@Table(name = "assignment_id")
public class Assignments {
	@Id
	@NonNull
	@Column(name = "assignment_id")
	private Long AssignmentId;
	@OneToOne
	@JoinColumn(name = "application_id")
	private Applications application_id;
	@NonNull
	private Long surveyorId;
	@NonNull
	private String assignmentType;
	@NonNull
	private String assignmentStatus;
	@NotNull
	private Long provinceId;
	@NotNull
	private	Long cityId;
	@NotNull
	private	Long subdistrictId;
	@NotNull
	private	Long villageId;
	@NotNull
	private	Long zipcode;
	private double longitute;
	private double latitude;
	@NotNull
	private Long branchId;
	@NotNull
	private Long customerId;
	@NotNull
	private Timestamp createdDate;
	@NotNull
	private Timestamp updatedDate;
	@NotNull
	private String createdUser;
	@NotNull
	private String UpdateUser;
	@NotNull
	private boolean isActive;
	
	@OneToMany(mappedBy = "assignment_id")
	private List<AssignmentDocSign>assignment_doc_sign;
	@OneToMany(mappedBy = "assignment_id")
	private List<AssignmentLoanInformation>assignment_loan_info;
	@OneToMany(mappedBy = "assignment_id")
	private List<AssignmentPersonalData>assignment_personal_data;
	@OneToMany(mappedBy = "assignment_id")
	private List<AssignmentPhysicalDoc>assignment_physcial_doc;
	}

