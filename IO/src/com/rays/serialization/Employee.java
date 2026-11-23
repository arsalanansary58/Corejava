package com.rays.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
  
	private int salary;
    private int EmpId;

    public Employee() {
    }
    public Employee(int salary , int EmpId) {
    	this.salary = salary;
    	  this.EmpId = EmpId;        
    }
  
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(salary);
		out.writeInt(EmpId);
      
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		salary = in.readInt();
		EmpId = in.readInt();
	}
	
	public String toString() {
		return "salary:" + salary + " "  + "EmpId:" +  EmpId;
	}


}
