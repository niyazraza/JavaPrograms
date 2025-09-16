package com.niyaz.record;

import com.blc.factory_method_4August.EmployeeRecord;

public class RecordELC {
	
	public static void main(String[] args) {
		
		EmployeeRecord e=new EmployeeRecord(111,"Niyaz");
		EmployeeRecord e1=new EmployeeRecord(111,"Niyaz");
		System.out.println(e1);
		System.out.println(e);
		System.out.println(e.equals(e1));
		System.out.println(e.hashCode()+"  : "+e1.hashCode());
		
	}

}
