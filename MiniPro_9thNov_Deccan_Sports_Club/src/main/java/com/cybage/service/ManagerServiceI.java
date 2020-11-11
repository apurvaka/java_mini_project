package com.cybage.service;



import java.sql.Date;
import java.util.List;

import com.cybage.pojos.AllBatchInfo;
import com.cybage.pojos.Batch;
import com.cybage.pojos.Plans;
import com.cybage.pojos.Sports;

public interface ManagerServiceI {
	
	public int addSport(String sportName) throws Exception; 
	public int removeSport(String sportName) throws Exception; 
	public Batch getBatch(int batchId) throws Exception;
	public int addBatch(Batch batch) throws Exception;
	public Date getDate(String date);
	public int removeBatch(int batchId)throws Exception;
	public int updateBatch(Batch batch) throws Exception;
	public List<AllBatchInfo> getAllBatches()throws Exception;
	
	public List<Plans> getAllPlans()throws Exception;
	public Plans getPlan(int planId) throws Exception;
	public int addPlan(Plans plan)throws Exception;
	public int removePlan(int planId)throws Exception;
	public int updatePlan(Plans plan)throws Exception;
	
	/////UI testing methods//
	public void addSportUI();
	public void addBatchUI();	
	public void removeSportsUI();
	public void removeBatchUI();
	public void updateBatchUI();
	public void getAllBatchesUI()throws Exception;
	
	public void addPlanUI();
	public void removePlanUI();
	public void updatePlanUI();
	public void getAllPlansUI();
	public void getplanUI();

}



