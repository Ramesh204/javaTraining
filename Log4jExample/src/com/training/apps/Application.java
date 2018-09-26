package com.training.apps;

import org.apache.log4j.*;


public class Application {

	public static void main(String[] args) {
		
//		BasicConfigurator.configure();
		Logger log = Logger.getLogger("example");
		
//		Logger log = Logger.getRootLogger();
		
//		Logger log = Logger.getLogger("second");
		
		String mark = "fiftyFive";
		
		try {
			double markScored = Double.parseDouble(mark);
			
			log.info(markScored);
		} catch (Exception e) {
			log.error("Invalid Number Format"+e.getMessage());
		}

	}

}
