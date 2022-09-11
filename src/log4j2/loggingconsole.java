package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class loggingconsole {
	private static final Logger log = LogManager.getLogger(loggingconsole.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Debug Message Logged");
		log.error("Error Message Logged");
		log.fatal("Fatal Message Logged");
		log.trace("trace Message Logged");
		log.info("info Message Logged");
	}

}
