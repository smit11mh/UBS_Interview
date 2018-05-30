package com.ubs.opsit.interviews;

public class Hours implements TimeConverter{
	
	  private static final String ALL_LIGHTS_OFF = "OOOO";
	    private static final String RED_LIGHT = "R";
	    private static final int MULTIPLE_OF_FIVE = 5;

	@Override
	public String convertTime(int aTime) {
		  return getLampsForHoursMultiplesOfFive(aTime) + "\n" + getLampsForSingleHours(aTime);
	}
	
	  public String getLampsForHoursMultiplesOfFive(int hours) {

	        StringBuilder lamps = new StringBuilder(ALL_LIGHTS_OFF);

	        for (int i = 0; i < (hours / MULTIPLE_OF_FIVE); i++) {
	            lamps.replace(i, i + 1, RED_LIGHT);
	        }
	        return lamps.toString();
	    }
	  
	   public String getLampsForSingleHours(int hours) {

	        StringBuilder lamps = new StringBuilder(ALL_LIGHTS_OFF);

	        for (int i = 0; i < (hours % MULTIPLE_OF_FIVE); i++) { 
	            lamps.replace(i, i + 1, RED_LIGHT);
	        }
	        return lamps.toString();

}

}