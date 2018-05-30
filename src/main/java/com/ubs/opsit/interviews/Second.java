package com.ubs.opsit.interviews;

public class Second implements TimeConverter{

	@Override
	public String convertTime(int aTime) {
		if (aTime%2 == 0)
		{
			return "Y";
		}
		
		return "N";
		
	}

}
