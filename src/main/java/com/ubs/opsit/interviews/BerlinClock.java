package com.ubs.opsit.interviews;

import java.util.ArrayList;
import java.util.List;

public class BerlinClock {

    private static List<TimeConverter> timeUnits = new ArrayList<TimeConverter>();

    public static void main(String[] args) {

        timeUnits.add(new Second());
        timeUnits.add(new Hours());
        timeUnits.add(new Minutes());

        System.out.println(getTime("23:59:00"));
    }

    public static String getTime(String time) {

        StringBuilder timeSB = new StringBuilder();
        String[] timeElements = time.split(":");

        int i=0;
        int j=2;

        for(TimeConverter timeUnit : timeUnits){

            for(String timeElement : timeElements){
            	if (j == 2){
                timeSB.append(timeUnits.get(i).convertTime(Integer.parseInt(timeElements[j]))).append("\n");
                i++;
                j--;
                break;
            	}
            	if (j == 1)
            	{
            		 j = 0;
            		 timeSB.append(timeUnits.get(i).convertTime(Integer.parseInt(timeElements[j]))).append("\n");
                     i++;
                     j++;
                     break;
            	}
            }
        }

        return timeSB.toString();
    }
}
