package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggingExample2 {

	
	@Test
	public void simpleTest2()
	{
		Logger log = LogManager.getLogger(LoggingExample2.class.getName());
		log.debug("I'm Debugging!");
		log.info("This is just for info");
		log.error("It's an error");
		log.fatal("This is fatal!");
	}
}
