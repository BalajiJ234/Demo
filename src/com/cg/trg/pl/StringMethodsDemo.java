package com.cg.trg.pl;

import com.cg.trg.service.Employee;

/*
 * charAt(),indexOf(),split(),equals(),matches(),substring(),replace()
 * contains(),length()
 */
public class StringMethodsDemo {

	public static void main(String[] args) {
		
		String details="Steve JobsID110022DT10JBManagerS12";
		
		String ename= details.split("ID")[0];		
		System.out.println(ename);
		String empid= details.split("ID")[1].split("DT")[0];
		Integer eid = Integer.parseInt(empid);
		System.out.println(eid);
		String deptno= details.split("ID")[1].split("DT")[1].split("JB")[0];
		Integer dno= Integer.parseInt(deptno);
		System.out.println(dno);
		String job= details.split("ID")[1]
				.split("DT")[1]
						.split("JB")[1].split("S")[0];
		System.out.println(job);
		
		String sal= details.split("ID")[1]
				.split("DT")[1]
						.split("JB")[1].split("S")[1];
		
		double salary = Double.parseDouble(sal)*100000;
		System.out.println(salary);
		String regex= "^[a-zA-Z\\s.]+$";
		System.out.println(ename.matches(regex));
		System.out.println(eid.toString().matches("^[0-9]+$"));
		if(ename.matches(regex) && eid.toString().matches("^[0-9]+$")) {
			Employee employee = new Employee(eid,ename,job,salary,dno);
			System.out.println(employee);
		}
		
		
		String [] emails= {"asr@gmail.com","rahul@capgemini.com",
							"vinod@gmail.com","virat@capgemini.com",
							"srini@yahoo.com","vinay@ibm.com"};
		
		String [] cgEmails= new String[4];
		int j=0;
		for(String s: emails) {
			if(s.contains("capgemini")) {
				cgEmails[j]=s;
				j++;
			}
		}
				
		System.out.println("Emails of Capgemini employees..");
		for(String s: cgEmails){
			if(s != null) {
				System.out.println(s);
			}
		}
		
		//Stream API, functional programming
		
		//list all domain names
	}

}
