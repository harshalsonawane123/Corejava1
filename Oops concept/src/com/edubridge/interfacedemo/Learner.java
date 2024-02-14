package com.edubridge.interfacedemo;

public class Learner implements Deletable {
	
	//its provides run time info
	public boolean delete(Object o)
	{
		if(o instanceof Deletable)
			return true;
		return false;
	}

}
