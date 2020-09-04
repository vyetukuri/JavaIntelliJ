package com.venkat.examples;

import com.venkat.exceptions.NotAValidInput;
import java.util.HashMap;
import java.util.Map;

public class SeasonFinder {
        Map<Integer, String> seasonMap = new HashMap<Integer, String>();

        public SeasonFinder(){
            super();

            seasonMap.put(Integer.valueOf(12), "WINTER");
            seasonMap.put(Integer.valueOf(1), "WINTER");
            seasonMap.put(Integer.valueOf(2), "WINTER");
            seasonMap.put(Integer.valueOf(3), "SPRING");
            seasonMap.put(Integer.valueOf(4), "SPRING");
            seasonMap.put(Integer.valueOf(5), "SPRING");
            seasonMap.put(Integer.valueOf(6), "SUMMER");
            seasonMap.put(Integer.valueOf(7), "SUMMER");
            seasonMap.put(Integer.valueOf(8), "SUMMER");
            seasonMap.put(Integer.valueOf(9), "FALL");
            seasonMap.put(Integer.valueOf(10), "FALL");
            seasonMap.put(Integer.valueOf(11), "FALL");

        }
        //Winter, Fall, Summer and Spring
        public String findSeason(Integer monthNumber) throws NotAValidInput {
            // input check
            if(monthNumber.intValue()<1 || monthNumber.intValue()>12){
                throw new NotAValidInput();
            }
            return seasonMap.get(monthNumber);
        }
    }
