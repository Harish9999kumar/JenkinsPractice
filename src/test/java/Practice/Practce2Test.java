package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practce2Test {
@Test
public void practice2() {
	String browser = System.getProperty("b");
	String url = System.getProperty("u");
	Reporter.log("browser is ====> "+browser,true);
	Reporter.log("URL is ====> "+url,true);
}
}
