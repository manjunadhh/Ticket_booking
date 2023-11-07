package org.bookmyshow.service;

import org.bookmyshow.model.User;
import org.bookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	public UserRepository userRepository;

	public User addUser(User user) {

		return userRepository.saveAndFlush(user);

	}

	public int getId(int id) {
		System.out.println("Id::" + id);
		System.out.println(userRepository.findById(id));

		return userRepository.findById(id).getId();
	}

}
