package com.assignment.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "assignmentCollateralInfo")
public class AssignmentCollateralInformation {
	@Id
	@NotNull
	private int AssignmentCollateralInfoId;
	private Long applicationId;
	private Long assetBrandId;
	private Long assetTypeId;
	private Long assetModelId;
	private Long AssetAge;
	private String LicencePlate;
	private String VehicalRegistrationPhoto;
	private String VehicalTaxNoticePhoto;
	private String VehicalLeftSidePhoto;
	private String VehicalRightSideNoticePhoto;
	private String VehicalFrontSideNoticePhoto;
	private String VehicalBackSideNoticePhoto;
	private String VehicalDashboardSidePhoto;
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
