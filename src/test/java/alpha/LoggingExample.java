package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggingExample {

	
	@Test
	public void simpleTest()
	{
		Logger log = LogManager.getLogger(LoggingExample.class.getName());
		log.debug("I'm Debugging!");
		log.info("This is just for info");
		log.error("It's an error");
		log.fatal("This is fatal!");
	}
}
