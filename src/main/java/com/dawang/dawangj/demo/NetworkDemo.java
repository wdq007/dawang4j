package com.dawang.dawangj.demo;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class NetworkDemo {
	
	
	public static void dummyRun() {
	try {
	URL address = new URL("http://yeah.net");
	//InputStream inStream = address.openStream();
	URLConnection connection = address.openConnection();
	connection.connect();
	InputStream inStream = connection.getInputStream();
	StringBuffer buf = new StringBuffer();
	BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
	String str = null;
	while((str = br.readLine()) != null) {
		buf.append(str);
	}
	System.out.print(buf);
	//URLConnection connection = address.openConnection();
	//connection.connect();
	/*connection.setDoOutput(true);
	Map<String, List<String>> headers = connection.getHeaderFields();
	         for (Map.Entry<String, List<String>> entry : headers.entrySet())
        {
	             String key = entry.getKey();
	             for (String value : entry.getValue())
                System.out.println(key + ": " + value);
	         }*/

	//Scanner in = new Scanner(inStream, StandardCharsets.UTF_8);
	
	
	}catch(Exception e ) {
		e.printStackTrace();
	}
	
	
	}
	
	public static void main(String[] args) {
		NetworkDemo.dummyRun();
	}

}
