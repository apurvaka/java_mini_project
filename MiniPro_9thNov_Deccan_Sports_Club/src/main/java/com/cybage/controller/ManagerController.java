package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.pojos.AllBatchInfo;
import com.cybage.pojos.Batch;
import com.cybage.pojos.Plans;
import com.cybage.service.ManagerServiceI;
import com.cybage.service.ManagerServiceImpl;

@ServletSecurity(
		value = @HttpConstraint(
				rolesAllowed = {"manager"}
				)
		)
public class ManagerController extends HttpServlet {
	
	ManagerServiceI manager=new ManagerServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		
		if(path.equals("/listbatch")) {			
			try {
				List<AllBatchInfo> listbatch=manager.getAllBatches();
				
				request.setAttribute("batches", listbatch);
				request.getRequestDispatcher("/manager/manager-batches.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(path.equals("/listplan")) {			
			try {
				List<Plans> listplan=manager.getAllPlans();
				
				request.setAttribute("plans", listplan);
				request.getRequestDispatcher("/manager/manager-plans.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(path.equals("/addbatch")) {			
			try {
				Batch batchinfo= new Batch();
				
				batchinfo.setStartDate(manager.getDate(request.getParameter("startDate")));
				batchinfo.setEndDate(manager.getDate(request.getParameter("endDate")));
			
				batchinfo.setBatchSize(Integer.parseInt(request.getParameter("batchSize")));
				batchinfo.setSportId(Integer.parseInt(request.getParameter("sportId")));
				
				manager.addBatch(batchinfo);
				response.sendRedirect("listbatch");								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		if(path.equals("/addplan")) {			
			try {
				Plans planinfo=new Plans();
				
				planinfo.setPlanName(request.getParameter("planName"));
				planinfo.setFees(Double.parseDouble(request.getParameter("fees")));
				planinfo.setDuration(Integer.parseInt(request.getParameter("duration")));
				
				manager.addPlan(planinfo);
				response.sendRedirect("listplan");								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(path.equals("/deletebatch")) {			
			try {
				manager.removeBatch(Integer.parseInt(request.getParameter("batchId")));
				
				request.setAttribute("deletemsg", "Batch deleted successfully");
				response.sendRedirect("listbatch");								
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		if(path.equals("/deleteplan")) {			
			try {
				manager.removePlan(Integer.parseInt(request.getParameter("planId")));
				
				request.setAttribute("deletemsg", "Plan deleted successfully");
				response.sendRedirect("listplan");								
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		if(path.equals("/editbatch")) {			
			try {
				Batch batch=manager.getBatch(Integer.parseInt(request.getParameter("batchId")));
				
				request.setAttribute("batches", batch);
				request.getRequestDispatcher("/manager/update-batch.jsp").forward(request, response);								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		if(path.equals("/editplan")) {			
			try {
				Plans plan=manager.getPlan(Integer.parseInt(request.getParameter("planId")));
				
				request.setAttribute("plans", plan);
				request.getRequestDispatcher("/manager/update-plan.jsp").forward(request, response);								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(path.equals("/updatebatch")) {			
			try {
				
				Batch batchinfo =new Batch();
				batchinfo.setBatchId(Integer.parseInt(request.getParameter("batchId")));
				batchinfo.setStartDate(manager.getDate(request.getParameter("startDate")));
				batchinfo.setEndDate(manager.getDate(request.getParameter("endDate")));
			
				batchinfo.setBatchSize(Integer.parseInt(request.getParameter("batchSize")));
				batchinfo.setSportId(Integer.parseInt(request.getParameter("sportId")));
				manager.updateBatch(batchinfo);
				
				
				response.sendRedirect("listbatch");										
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(path.equals("/updateplan")) {			
			try {
				
				Plans planinfo=new Plans();
				
				planinfo.setPlanId(Integer.parseInt(request.getParameter("planId")));
				planinfo.setPlanName(request.getParameter("planName"));
				planinfo.setFees(Double.parseDouble(request.getParameter("fees")));
				planinfo.setDuration(Integer.parseInt(request.getParameter("duration")));
				
				manager.updatePlan(planinfo);
				
				
				response.sendRedirect("listplan");										
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
 	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

				
		
		
		
		
}
	

	

