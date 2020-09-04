package com.venkat.examples;

import com.venkat.exceptions.NotAValidInput;
import com.venkat.exceptions.NotAValidInput;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
public class URLParser {

    public URLParser(){
        super();

    }

    public void parseURL(String str)
    {
        try {
            URL url = new URL(str);

            System.out.println("URL is " + url.toString());
            System.out.println("protocol is " + url.getProtocol());
            System.out.println("authority is " + url.getAuthority());
            System.out.println("file name is " + url.getFile());
            System.out.println("host is " + url.getHost());
            System.out.println("path is " + url.getPath());
            System.out.println("port is " + url.getPort());
            System.out.println("default port is " + url.getDefaultPort());
            System.out.println("query is " + url.getQuery());
            System.out.println("ref is " + url.getRef());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
    public static boolean isUrlValid(String url) {
        /* Try creating a valid URL */
        try {
            new URL(url).toURI();
            return true;
        }

        // If there was an Exception
        // while creating URL object
        catch (Exception e) {
            return false;
        }
    }
}
