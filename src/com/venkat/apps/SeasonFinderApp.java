package com.venkat.apps;

import com.venkat.exceptions.NotAValidInput;
import com.venkat.examples.SeasonFinder;

public class SeasonFinderApp {

    public static void main(String[] args) {
        SeasonFinder aSeasonFinder = new SeasonFinder();
        try {
            System.out.println("Season Name: " + aSeasonFinder.findSeason(Integer.valueOf(1)));
        }catch (NotAValidInput exp){
            System.out.println("Please give a number between 1 and 12");
        }
        try{
            System.out.println("Season Name: "+ aSeasonFinder.findSeason(Integer.valueOf(3)));
        }catch (NotAValidInput exp){
            System.out.println("Please give a number between 1 and 12");
        }
        try{
            System.out.println("Season Name: "+ aSeasonFinder.findSeason(Integer.valueOf(30)));
        }catch (NotAValidInput exp){
            System.out.println("Please give a number between 1 and 12");
        }
        try{
            System.out.println("Season Name: "+ aSeasonFinder.findSeason(Integer.valueOf(-1)));
        }catch (NotAValidInput exp){
            System.out.println("Please give a number between 1 and 12");
        }
    }
}
