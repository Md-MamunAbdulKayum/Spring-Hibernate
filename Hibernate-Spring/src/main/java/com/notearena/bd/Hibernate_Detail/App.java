package com.notearena.bd.Hibernate_Detail;

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
	
    public static void main( String[] args ){
     
    	context = new AnnotationConfigApplicationContext(AppConfigurations.class);
        App p = context.getBean(App.class);
        p.callMeth();
    	
    }
    

    public void callMeth() {
    	 //userService.getAllUser(); 
    	User user = new User("test1", "TestLName", 29, "112@ddd.com", "tests", "pass", 1);
    	userService.addUser(user);
    }
}
