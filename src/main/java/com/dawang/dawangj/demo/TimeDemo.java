package com.dawang.dawangj.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeDemo {
	
	
	
	public static void main(String[] args) {
		Instant start = Instant.now();
		LocalDate today = LocalDate.now();
		
		System.out.println(ZonedDateTime.of(1969, 7, 16, 9, 32, 0, 0,
				   ZoneId.of("America/New_York")));
		
		
	}

}
