package com.notearena.bd.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.notearena.bd.config.AppConfigurations;
import com.notearena.bd.entity.User;
import com.notearena.bd.service.UserService;

/**
 * Hello world!
 *
 */
@Component
public class App {
	@Autowired
	private UserService userService;
	private static ApplicationContext context;
	User user;

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(AppConfigurations.class);
		App p = context.getBean(App.class);

		// p.createUser();
		// p.updateUser();

		List<User> allUser = p.getAllUsers();
		allUser.forEach(item -> System.out.println(item));

		// User user = p.getUserById();
		// System.out.println( user);

		// p.deleteUser(4);

	}

	private void createUser() {
		user = new User("test1", "TestLName", 29, "112@ddd.com", "tests", "pass", 1);
		userService.addUser(user);
	}

	private void updateUser() {
		user = new User(1, "test1", "TestLName", 29, "112@ddd.com", "tests", "pass", 0);
		userService.updateUser(user);
	}

	private List<User> getAllUsers() {
		return userService.getAllUser();
	}

	private User getUserById() {
		return userService.getUser(1);
	}

	private void deleteUser(int uid) {
		userService.deleteUser(uid);
	}
}
