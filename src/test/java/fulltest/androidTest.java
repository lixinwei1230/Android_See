package fulltest;

import java.io.IOException;

import org.jgap.InvalidConfigurationException;
import org.xml.sax.SAXException;

import util.Util;
import websee.WebSeeTool;

public class androidTest {

	public static void main(String[] args) throws IOException, SAXException, InvalidConfigurationException {
		// TODO Auto-generated method stub
long startTime = System.nanoTime();
		
		String basePath = "/home/parallels/websee-master/target/test-classes/testcases/AndroidSee";
		String oracle = "/oracle1.png";
		String test = "/test1.png";
		String xmlFile = "oracle1.uix";
		String specialReg = "/special_regions.xml";
		String pythonPath = "/home/parallels/websee-master/target/test-classes/testcases/AndroidSee/parse.py";

		String oracleImagePath = basePath + oracle;
		String testPagePath = basePath + test;
		String specialRegionPath = basePath + specialReg;
		System.out.println(testPagePath);
		//run WebSeeTool to output all these faulty pixels in each cluster
		WebSeeTool wst = new WebSeeTool(oracleImagePath, testPagePath, specialRegionPath);
		wst.runWebSeeTool();
		
		System.out.println("Localization started:");
		System.out.println("python " + pythonPath + " " + xmlFile);
		//Runtime.getRuntime().exec("python " + pythonPath + " " + xmlFile);
		System.out.println("Error elements saved to errorElements.txt");
		System.out.println("Done");		
		long endTime = System.nanoTime();
		System.out.println("Total time = " + Util.convertNanosecondsToSeconds(endTime - startTime));


	}

}
