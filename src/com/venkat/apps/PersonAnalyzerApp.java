package com.venkat.apps;

import com.venkat.examples.PersonAnalyzer;
import com.venkat.modules.FileHelper;

import java.util.List;

public class PersonAnalyzerApp {

    public static void main(String args[])
    {
        /*

venkat,cary,nc,usa
Siva,toronto,ON, canada
Sai, hyderabad,telengana,India
suresh,,somethign
         */
//        ArrayList<ArrayList<String> > x = new ArrayList<ArrayList<String> >();
//        x.add(new ArrayList<String>(Arrays.asList("venkat","cary","nc","usa")));
//        x.add(new ArrayList<String>(Arrays.asList("Siva","toronto","ON","canada")));
//        x.add(new ArrayList<String>(Arrays.asList("Sai","hyderabad","telengana","India")));
//        x.add(new ArrayList<String>(Arrays.asList("suresh","","","somethign")));
//
//        System.out.println(x);
//
//        //create array of employee object
//        GetPeopleByCity.Person[] obj = new GetPeopleByCity.Person[4] ;
//        obj[0] = new GetPeopleByCity.Person("Ven1","ABC","","");
//        System.out.println( obj[0].firstName);
/*
        //create & initialize actual employee objects using constructor
        obj[0] = new GetPeopleByCity.Person("Ven1","ABC","","");
        obj[1] = new GetPeopleByCity.Person("Ven2","ABC1","","");

        //display the Person object data
        System.out.println("Employee Object 1:");
        System.out.println( obj[0]);
*/
        FileHelper helper = new FileHelper();
        List<String> lines =
                helper.readFile( "C:\\Users\\vyetukuri\\Selenium\\JavaIntellij\\inputData\\personData" );
        PersonAnalyzer analyzer = new PersonAnalyzer(lines);
        analyzer.printCityReport();
    }
}
