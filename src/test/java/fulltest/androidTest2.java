package fulltest;

import java.io.IOException;

import org.jgap.InvalidConfigurationException;
import org.xml.sax.SAXException;

import util.Util;
import websee.WebSeeTool;

public class androidTest2 {


	public static void main(String[] args) throws IOException, SAXException, InvalidConfigurationException
	{
		long startTime = System.nanoTime();
		
		String basePath = "/Users/Z/git/websee/target/test-classes/testcases/android";
		// take oracle screenshot
		//Util.getScreenshot("oracle.html", basePath + "/oracle/dbi.perl.org", "oracle.png", null, true);
		
		String oracleImagePath = basePath + "/oracle.png";
		String testPagePath = basePath + "/test.png";
		String specialRegionPath = basePath + "/sepcial.png";
		System.out.println(testPagePath);
		// run tool
		WebSeeTool wst = new WebSeeTool(oracleImagePath, testPagePath);
		wst.runWebSeeTool();
		
		System.out.println("Done");		
		long endTime = System.nanoTime();
		System.out.println("Total time = " + Util.convertNanosecondsToSeconds(endTime - startTime));

	}

}
