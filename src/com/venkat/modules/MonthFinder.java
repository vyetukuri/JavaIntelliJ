package com.venkat.modules;

import com.venkat.exceptions.NotAValidInput;

import java.util.HashMap;
import java.util.Map;

public class MonthFinder {

    int i = 1;  // Integer
    char ch ='V'; // Character
    boolean isValue = true; // Boolean
    // 8 data types
    // int, short, long, float, double, char, boolean, byte
    //  2     1     4    decimal numbs

    Map<Integer, String> monthMap = new HashMap<Integer, String>();
    // special method
    // it is used to the create and intialize the object
    // constructor
    public MonthFinder(){
        super();
        // initialize
//        wrapper
        monthMap.put(Integer.valueOf(1), "January");
        monthMap.put(Integer.valueOf(2), "Febraury");
        monthMap.put(Integer.valueOf(3), "March");

    }

    public String findMonth(Integer monthNumber) throws NotAValidInput{
        // input check
        if(monthNumber.intValue()<1 || monthNumber.intValue()>12){
            throw new NotAValidInput();
        }
        return monthMap.get(monthNumber);
    }
}
