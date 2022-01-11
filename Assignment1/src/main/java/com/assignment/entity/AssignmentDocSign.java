package com.assignment.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "assignment_doc_sign")
public class AssignmentDocSign {
	@Id
	private int assignmentDocId;

	@ManyToOne
	@JoinColumn(name = "assignment_id")
	private Assignments assignment_id;
	@NotNull
	private Boolean blankReceiptByCustomer;
	@NotNull
	private Boolean blancReceiptByOwner;
	@NotNull
	private Boolean customerApplicationRequest;
	@NotNull
	private Boolean loanContractAgreementTransferTitle;
	@NotNull
	private Boolean loanContractAgreementFunding;
	@NotNull
	private Boolean fiduciary;
	private String customerSignDocumentPhoto;
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
