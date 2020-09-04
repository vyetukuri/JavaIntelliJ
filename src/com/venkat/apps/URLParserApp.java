package com.venkat.apps;
import com.venkat.examples.URLParser;
import com.venkat.modules.MonthFinder;

import java.net.MalformedURLException;
import java.net.URL;
public class URLParserApp {

    public static void main(String[] args)
    {


        URLParser aURLparser = new URLParser();
        String url1 = "http://www.venkat.com/myPage";
        if (aURLparser.isUrlValid(url1)) {
            System.out.println( "Valid URL" );
            aURLparser.parseURL( url1 );
        }
        else
            System.out.println("Not a Valid URL");

        String url2 = "http://23.120.24.187:10080/autotools";
        if (aURLparser.isUrlValid(url2)) {
            System.out.println( "Valid URL" );
            aURLparser.parseURL( url2 );
        }
        else
            System.out.println("Not a Valid URL");
    }
}
