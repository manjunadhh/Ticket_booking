package org.bookmyshow.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshow.model.Theater;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TheaterAspect {
	@Before("execution(* org.bookmyshow.service.TheaterService.addTheater(org.bookmyshow.model.Theater)) && args(theater)")
	public void beforeAddTheater(Theater theater) {
		System.out.println("Theater Name:" + theater.getName());
		System.out.println("Available Seats:" + theater.getAvailableseats());
		System.out.println("ShowTime:" + theater.getShowTime());
		System.out.println("Localdate:" + theater.getLocaldate());
		System.out.println("Contact Number:" + theater.getContactNumber());
		System.out.println("Address:" + theater.getAddress());
	}

}
