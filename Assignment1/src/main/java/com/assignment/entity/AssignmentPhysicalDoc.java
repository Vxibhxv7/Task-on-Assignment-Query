package com.assignment.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "assignment_physcial_doc")
public class AssignmentPhysicalDoc {
	@Id
	@NotNull
	private int assignmentPhysicalDocId;
	@ManyToOne
	@JoinColumn(name = "assignment_id")
	private Assignments assignment_id;
	private String vehicleOwnership1Photo;
	private String vehicleOwnership2Photo;
	private String vehicleOwnership3Photo;
	private String vehicleOwnership4Photo;
	private String vehicleOwnershipIdentityCardPhoto;
	private String additionalAssetRegistrationPhoto;
	private Long applicationId;
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
