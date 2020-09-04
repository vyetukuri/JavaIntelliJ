package com.venkat.apps;

import com.venkat.exceptions.NotAValidInput;
import com.venkat.modules.MonthFinder;

import java.sql.SQLOutput;

public class MonthFinderApp {

    public static void main(String[] args) {
        MonthFinder aMonthFinder = new MonthFinder();
        try {
            System.out.println("Month Name: " + aMonthFinder.findMonth(Integer.valueOf(1)));
        }catch (NotAValidInput exp){
            System.out.println("Please give a number between 1 and 12");
        }
        try{
        System.out.println("Month Name: "+aMonthFinder.findMonth(Integer.valueOf(3)));
        }catch (NotAValidInput exp){
            System.out.println("Please give a number between 1 and 12");
        }
        try{
        System.out.println("Month Name: "+aMonthFinder.findMonth(Integer.valueOf(30)));
        }catch (NotAValidInput exp){
            System.out.println("Please give a number between 1 and 12");
        }
        try{
        System.out.println("Month Name: "+aMonthFinder.findMonth(Integer.valueOf(-1)));
        }catch (NotAValidInput exp){
            System.out.println("Please give a number between 1 and 12");
        }
    }
}
