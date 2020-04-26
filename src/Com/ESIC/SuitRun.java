package Com.ESIC;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class SuitRun {
	
	
	@Test
	public void run() throws InterruptedException
	{
	for(int i=0;i<10;i++)
    {
        //Thread.sleep(10000);
		
		List<String> suites = new ArrayList<String>();
        suites.add("E:\\Automation\\HISDailyReg\\suite.xml"); //path of .xml file to be run-provide complete path

        TestNG tng = new TestNG();
        tng.setTestSuites(suites);

        tng.run(); //run test suite
    }

}
}
