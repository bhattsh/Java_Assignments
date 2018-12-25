package com.organisation.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.organisation.EmployeeInformation;
import com.organisation.MMASavingAccount;

public class TestOrganisation 
{
	private EmployeeInformation capgEmployeeOne = new EmployeeInformation(501,"Tejas","associate developer",20000,"Capgemini");
	private MMASavingAccount capgAccountOne = new MMASavingAccount(1001,"Tejas",1000,true);
	
	private EmployeeInformation capgEmployeeTwo = new EmployeeInformation(5091,"Pranjal","associate developer",20000,"Capgemini");
	private MMASavingAccount capgAccountTwo = new MMASavingAccount(1005,"Pranjal",2000,true);
	
	private EmployeeInformation HCLEmployeeOne = new EmployeeInformation(501,"Tejas","associate developer",20000,"HCL");
	private MMASavingAccount HCLAccountOne = new MMASavingAccount(1002,"Rohan",1000,true);
	
	private EmployeeInformation TCSEmployeeOne = new EmployeeInformation(501,"Tejas","associate developer",20000,"TCS");
	private MMASavingAccount TCSAccountOne = new MMASavingAccount(1003,"Tushar",1000,true);
	
	
	
	
	@Test
	public void test()
	{
		Map <MMASavingAccount,EmployeeInformation> capgMap = new HashMap();
		capgMap.put(capgAccountOne,capgEmployeeOne);
		capgMap.put(capgAccountTwo,capgEmployeeTwo);
		
		Map <MMASavingAccount,EmployeeInformation> HCLMap = new HashMap();
		HCLMap.put(HCLAccountOne,HCLEmployeeOne);
		
		Map <MMASavingAccount,EmployeeInformation> TCSMap = new HashMap();
		TCSMap.put(TCSAccountOne,TCSEmployeeOne);
		
		Map <String,Map> communityMap = new HashMap();
		communityMap.put("Capgemini",capgMap);
		communityMap.put("HCL",capgMap);
		communityMap.put("TCS",capgMap);
		System.out.println((communityMap.get("Capgemini")).toString());
		assertEquals("{MMASavingAccount [accountId=1001, accountHolderName=Tejas, accountBalance=1000.0, isSalary=true]=EmployeeInformation [employeeId=501, employeeName=Tejas, employeeDesignation=associate developer, employeeSalary=20000.0, employeeCommunity=Capgemini], MMASavingAccount [accountId=1005, accountHolderName=Pranjal, accountBalance=2000.0, isSalary=true]=EmployeeInformation [employeeId=5091, employeeName=Pranjal, employeeDesignation=associate developer, employeeSalary=20000.0, employeeCommunity=Capgemini]}",(communityMap.get("Capgemini")));
	}

}
