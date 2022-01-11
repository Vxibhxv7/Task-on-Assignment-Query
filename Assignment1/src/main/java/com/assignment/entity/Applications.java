package com.assignment.entity;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "application")
public class Applications {
	@Id
	@Column(name = "application_id")
	@NotNull
	private Long applicationId;
	@NotNull
	private Long lead_id;
	@NotNull
	private String applicationStatus;
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
	
	