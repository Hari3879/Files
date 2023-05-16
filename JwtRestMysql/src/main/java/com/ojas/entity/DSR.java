package com.ojas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "DSR")
@SQLDelete(sql = "UPDATE DSR SET visibility = true WHERE SNID=?")
@Where(clause = "visibility=false")
public class DSR {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SNID")
	private long id;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "PROJECT")
	private String project;
	
	@NotNull(message = "dsr date should not be null")
	@Pattern(regexp = "yyyy-mm-dd" ,message = "date formate should be yyyy/mm/dd")
	//@Temporal(TemporalType.DATE)
	//@DateTimeFormat(pattern = "yyyy-mm-dd")
	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DSR_DATE")
	private Date date;
	
	@Column(name = "HRS_WORKED")
	private String hrsWorked;
	
	@Column(name = "DSR_REPORT",columnDefinition = "MEDIUMTEXT")
	private String dSRReport;
	
	@Column(name = "SUBMIT_DATE")
	private Date submitDate;
	
	@Column(name = "VISIBILITY")
	private boolean visibility;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Date getdSRDate() {
		return date;
	}

	public void setdSRDate(Date dSRDate) {
		this.date = dSRDate;
	}

	public String getHrsWorked() {
		return hrsWorked;
	}

	public void setHrsWorked(String hrsWorked) {
		this.hrsWorked = hrsWorked;
	}

	public String getdSRReport() {
		return dSRReport;
	}

	public void setdSRReport(String dSRReport) {
		this.dSRReport = dSRReport;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	@Override
	public String toString() {
		return "DSR [id=" + id + ", empName=" + empName + ", project=" + project + ", dSRDate=" + date
				+ ", hrsWorked=" + hrsWorked + ", dSRReport=" + dSRReport + ", submitDate=" + submitDate
				+ ", visibility=" + visibility + "]";
	}

	public DSR(long id, String empName, String project, Date dSRDate, String hrsWorked, String dSRReport,
			Date submitDate, boolean visibility) {
		super();
		this.id = id;
		this.empName = empName;
		this.project = project;
		this.date = date;
		this.hrsWorked = hrsWorked;
		this.dSRReport = dSRReport;
		this.submitDate = submitDate;
		this.visibility = visibility;
	}

	public DSR() {
		super();
	}
	
	
	
}
