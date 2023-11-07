package org.bookmyshow.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshow.model.User;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Loginuser {
	@Before("execution(* org.bookmyshow.service.UserService.addUser(org.bookmyshow.model.User)) && args(user)")
	public void beforeAddUser(User user) {
		System.out.println("UserName:" + user.getName());

		System.out.println("Password:" + user.getPassword());

	}

}
