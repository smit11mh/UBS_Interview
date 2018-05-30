package com.ubs.opsit.interviews;

public class Minutes implements TimeConverter{
	

    private static final String RED_LIGHT = "R";
    private static final String YELLOW_LIGHT = "Y";
    private static final String ALL_FOUR_LIGHTS_OFF = "OOOO";
    private static final String ALL_ELEVEN_LIGHTS_OFF = "OOOOOOOOOOO";

	@Override
	public String convertTime(int aTime) {
		 int minutesDividedBy5 = aTime / 5;
	        int minutesModulus5 = aTime % 5;

	        return getLampsForMinutesMultiplesOfFive(minutesDividedBy5) + "\n" + getLampsForSingleMinutes(minutesModulus5);
	}
	
    String getLampsForMinutesMultiplesOfFive(int minutes) {

        StringBuilder lamps = new StringBuilder(ALL_ELEVEN_LIGHTS_OFF);

        for (int i = 0; i < minutes; i++) {
            if ((i + 1) % 3 == 0) {
                lamps.replace(i, i + 1, RED_LIGHT);
            } else {
                lamps.replace(i, i + 1, YELLOW_LIGHT);
            }
        }
        return lamps.toString();
    }
    
    String getLampsForSingleMinutes(int minutes) {

        StringBuilder lamps = new StringBuilder(ALL_FOUR_LIGHTS_OFF);

        for (int i = 0; i < minutes; i++) {
            lamps.replace(i, i + 1, YELLOW_LIGHT);
        }
        return lamps.toString();

}
}
