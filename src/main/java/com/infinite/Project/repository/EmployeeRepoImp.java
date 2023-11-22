package com.infinite.Project.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.Project.pojo.Employee;

@Repository
public abstract class EmployeeRepoImp implements IEmployeeRepo {

	@Autowired
	private SessionFactory sesfactory;

	public void setSesfactory(SessionFactory sesfactory) {
		this.sesfactory = sesfactory;
	}

	@Override
	public String findByEmail(String email) {
		System.out.print("came");
		Session session = this.sesfactory.getCurrentSession(); 
		Query q = session.createQuery("from Employee ");
		System.out.print(q.list());
		return "true";

	}

	@Override
	public String findByPassword(String password) {
		Session session = this.sesfactory.getCurrentSession(); 
		Query q = session.createQuery("from Employee ");
		System.out.print(q.list());
		return "true";
	}

	/*
	 * @Override public Employee findByUsernameAndPassword(int userid, String
	 * password) { //Session session = this.sesfactory.getCurrentSession(); //Query
	 * q = session.createQuery("from Employee "); //Query q =
	 * session.createQuery("from Employee where empid="+userid+" and password="
	 * +password+""); //List<Employee> ls = q.list(); //System.out.print(ls); return
	 * null; }
	 */

}
