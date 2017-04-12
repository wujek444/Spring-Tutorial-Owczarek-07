package pl.wojcik.jakub.springtutorial;

import java.util.logging.Logger;

public class UsersCreator {
	Logger logger = Logger.getLogger(UsersCreator.class.getName());
	
	public User createUser(String userName){
		logger.info("Tworzenie użytkownika " + userName);
		User user = new User();
		user.setName(userName);
		return user;
	}
}
