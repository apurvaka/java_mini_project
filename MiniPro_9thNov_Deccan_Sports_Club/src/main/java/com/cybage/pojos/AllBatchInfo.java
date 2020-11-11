package com.cybage.pojos;

import java.sql.Date;

public class AllBatchInfo {
	
	private int batchId;
	private Date startDate;
	private Date endDate;
	private int batchSize;
	private String sportName;
	private int sportid;
	public AllBatchInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllBatchInfo(int batchId, Date startDate, Date endDate, int batchSize, String sportName, int sportid) {
		super();
		this.batchId = batchId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.batchSize = batchSize;
		this.sportName = sportName;
		this.sportid = sportid;
	}
	public AllBatchInfo(int batchId, Date startDate, Date endDate, int batchSize, int sportid) {
		super();
		this.batchId = batchId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.batchSize = batchSize;
	
		this.sportid = sportid;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public int getSportId() {
		return sportid;
	}
	public void setSportId(int sportid) {
		this.sportid = sportid;
	}
	

}
