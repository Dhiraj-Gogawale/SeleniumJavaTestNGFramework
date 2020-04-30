package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.apache.logging.log4j.Logger;

public class log4jdemo {

	public static Logger logger = LogManager.getLogger(log4jdemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n  Hello World..!  \n ");
		
		logger.trace(" This is trace message ");
		logger.info(" This is information message ");
		logger.error(" This is a error message ");
		logger.warn(" This is worning message ");
		logger.fatal(" This is a fatal message ");
		
		System.out.println("\n Completed ");
		

	}

}
