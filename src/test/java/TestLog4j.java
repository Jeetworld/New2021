import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {
	
	
	
	
	public static Logger log = Logger.getLogger(TestLog4j.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\log4j.properties");
		
		log.info("first message printed by Log4jj");
		
		log.info("second message printed by Log45ff");
		
		
	}

}
