/*
package com.revature.service;

import java.util.List;

import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAO;
import com.revature.dao.RB_RequestDAO;
import com.revature.impl.EmployeeImpl;
import com.revature.impl.RB_RequestImpl;

public class EmployeeDelegate {

	private EmployeeDAO ed = new EmployeeImpl();
	private RB_RequestDAO rd = new RB_RequestImpl();
	private StatusDAO sd = new StatusDAOImpl();

		public List<Employee> getEmployee() {
			
			 List<Employee> employees = new ArrayList<>();
			employees = ed.getEmployee();
			return employees;
			
		}
		
		public Employee getEmployeeById(int id) {
			
			Employee e = ed.getEmployeeById(id);
			return e;
			
		}
		
		public Employee getEmployeeByUserAndPass(String username, String password) {
			
			Employee e = ed.getEmployeeByUserAndPass(username, password);
			return e;
			
		}
		
		public void addReimbursement(double amount, String desc, int id) {
			rd.addReimbursement(amount, desc, id);
			
		}
		public void updateReimbursement(Reimbursement r, int status, int employeeId) {
			rd.updateReimbursement(r, status, employeeId);
			
		}
		public void deleteReimbursementById(int id) {
			rd.deleteReimbursementById(id);
			
		}
		public List<Reimbursement> getAllReimbursements(){
			List<Reimbursement> reimbs = rd.getAllReimbursements();
			return reimbs;
			
		}
		public Reimbursement getReimbursementById(int id) {
			Reimbursement r = rd.getReimbursementById(id);
			return r;
			
		}
		public List<Reimbursement> getReimbursementsByEmpId(int id){
			
			List<Reimbursement> reimbs = rd.getReimbursementsByEmpId(id);
			return reimbs;
		}
		
		public String getStatusName(int id) {
			Status name = sd.getStatusById(id);
			String actualName = name.getName();
			return actualName;
		}

		
	

}
*/