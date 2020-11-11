package com.cybage.service;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.cybage.dao.ManagerDaoI;
import com.cybage.dao.ManagerDaoImpl;
import com.cybage.pojos.AllBatchInfo;
import com.cybage.pojos.Batch;
import com.cybage.pojos.Plans;
import com.cybage.pojos.Sports;

public class ManagerServiceImpl implements ManagerServiceI{

	ManagerDaoI manager=new ManagerDaoImpl();
	/////////////All the UI testing methods////////////////////////////////
	//test addBatch 
	public void addBatchUI()
	{
		Batch batch=new Batch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Date :");

		String startDate = sc.nextLine();
		//java.sql.Date date1=manager.getDate(date);
		
		System.out.println("Enter the End Date : ");
		 String endDate=sc.nextLine();
		
		 System.out.println("Enter the batchsize :");
		 int batchSize=sc.nextInt();
		 System.out.println("Enter the sportId:");
		 int sportId=sc.nextInt();
		 
		batch.setBatchSize(batchSize);
		
		batch.setStartDate(getDate(startDate));
		
		 batch.setEndDate(getDate(endDate));
		 batch.setSportId(sportId);
		try {
			System.out.println("row affected is "+ manager.addBatch(batch));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//addsportUI method
		
	public void addSportUI()
	{
		//Add sport into a table
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of sport");
				String sportName=sc.next().toUpperCase();
				
				try {
					System.out.println(addSport(sportName)+"rows added successfully");
				} 
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	
	//remove SPorts
	public void removeSportsUI()
	{
		//Add sport into a table
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of sport");
				String sportName=sc.next().toUpperCase();
				
				try {
					System.out.println(removeSport(sportName)+"rows added successfully");
				} 
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	//removeBatch 
		public void removeBatchUI()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the ID of batch to be removed:");
			int batchId=sc.nextInt();
			try {
				System.out.println(removeBatch(batchId)+" rows affected");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public void updateBatchUI()
		{
			Scanner sc=new Scanner(System.in);
			Batch batch=new Batch();
			
			
			System.out.println("update startDate:");
			Date startDate=getDate(sc.nextLine());
			System.out.println("update enddate: ");
			Date endDate=getDate(sc.nextLine());
			System.out.println("update batch size : ");
			int batchSize=sc.nextInt();
			System.out.println("Enter sports Id: ");
			int sportId=sc.nextInt();
			System.out.println("Enter the id of batch to be updated: ");
			int batchId=sc.nextInt();
		
			batch.setStartDate(startDate);
			batch.setEndDate(endDate);
			batch.setBatchSize(batchSize);
			batch.setSportId(sportId);
				try {
				System.out.println(manager.updateBatch(batch)+" rows affected");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		public void getAllBatchesUI()throws Exception
		{
			try {
				System.out.println(manager.getAllBatches());;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

///////////////////////////////////////////////////////////////////////////////////////////	
	
	//code for date manipulation
	public java.sql.Date getDate(String date) {
		
	
		return Date.valueOf(date);  
	}
///////////////Service for Sports Table CRUD
	//Adding sports into SportsTable
	public int addSport(String sportName) throws Exception {
		
		return manager.addSports(sportName);
	}
	

	
	public int removeSport(String sportName) throws Exception {
		return manager.removeSports(sportName);
	}
	
	
	/////////////////////////////////////////////
	
	//adding record into Batch table
	public int addBatch(Batch batch) throws Exception {
		
		return manager.addBatch(batch);
	}

	//removing record from Batch table
	public int removeBatch(int batchId) throws Exception {
		return manager.removeBatch(batchId);
	}
	
	public Batch getBatch(int batchId) throws Exception{
		return manager.getBatch(batchId);
	}

	//updating record from Batch table
	public int updateBatch(Batch batch) throws Exception {
		
		return manager.updateBatch(batch);
	}


	public List<AllBatchInfo> getAllBatches() throws Exception {
		return manager.getAllBatches();
	
	}
	
	//////////////////Service methods for Plans CRUD
	public int addPlan(Plans plan) throws Exception {
		
		return manager.addPlan(plan);
	}
	
	public int removePlan(int planId) throws Exception {
		
		return manager.removePlan(planId);
	}
	
	public int updatePlan(Plans plan) throws Exception {
		
		return manager.updatePlan(plan);
	}
	
	public List<Plans> getAllPlans() throws Exception {
		
		return manager.getAllPlans();
	}
	
	@Override
	public Plans getPlan(int planId) throws Exception {
		
		return manager.getPlan(planId);
	}
	
	/////UI TESTING FOR PLANS 
	
	public void addPlanUI() {
		
		Plans plan =new Plans();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the planname :");

		String planname = sc.nextLine();
		//java.sql.Date date1=manager.getDate(date);
		
		System.out.println("Enter the fees : ");
		 double fees=sc.nextDouble();
		
		 System.out.println("Enter the duration :");
		 int duration=sc.nextInt();
		 
		 plan.setPlanName(planname);
		 plan.setFees(fees);
		 plan.setDuration(duration);
		 
		
		try {
			System.out.println("row affected is "+ manager.addPlan(plan));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void removePlanUI() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID of plan to be removed:");
		int planId=sc.nextInt();
		try {
			System.out.println(removePlan(planId)+" rows affected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updatePlanUI() {
		
		Scanner sc=new Scanner(System.in);
		Plans plan=new Plans();
		
		
		System.out.println("update planname:");
		String planname=sc.nextLine();
		System.out.println("update fees: ");
		double fees=sc.nextDouble();
		System.out.println("update duration : ");
		int duration=sc.nextInt();
		System.out.println("Enter the id of plan to be updated: ");
		int planid=sc.nextInt();
		System.out.println(planid);
		plan.setPlanName(planname);
		plan.setFees(fees);
		plan.setDuration(duration);
		plan.setPlanId(planid);
			try {
			System.out.println(manager.updatePlan(plan)+" rows affected");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void getAllPlansUI() {
		
		try {
			List<Plans> list=manager.getAllPlans();
			for(int i=0;i<list.size();i++){
			    System.out.println(list.get(i));
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void getplanUI() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID of plan to be retrieved:");
		int planId=sc.nextInt();
		try {
			System.out.println(getPlan(planId)+" rows affected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ManagerServiceImpl m=new ManagerServiceImpl();
		//m.addPlanUI();
		//m.addPlanUI();
		//m.removePlanUI();
		//m.updatePlanUI();
		//m.getAllPlansUI();
		//m.getplanUI();
		
	}
	

}
