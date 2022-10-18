package com.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserAuthentication {
	Log logger = LogFactory.getLog(UserAuthentication.class);

	public String loginUser(String username, String Password) {
		if (username.isBlank()) {
			logger.info("Username is blank");
			throw new RuntimeException("User invalid");
		}
		logger.info("successfully logged in");
		return "Successfully logged in";
	}
}