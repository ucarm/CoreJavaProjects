/**
 * This is the testing program for the Sort3Numbers. 
 * DO NOT CHANGE.
 * 
 * @author anwar mamat
 */
package tests;


import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;

import org.junit.Test;

import calendar.Calendar;

public class PublicTests {
	@Test
	public void test1() throws Exception, Throwable{
		runProgramWithInputFindLargest("test1.txt");
	}
	
	@Test
	public void test2() throws Exception, Throwable{
		runProgramWithInputFindLargest("test2.txt");
	}
	
	
	@Test
	public void test3() throws Exception, Throwable{
		runProgramWithInputFindLargest("test3.txt");
	}
	
	
	@Test
	public void test4() throws Exception, Throwable{
		runProgramWithInputFindLargest("test4.txt");
	}
	private void runProgramWithInputFindLargest(String inputFilename) throws Exception, Throwable {
		
		/* Retrieving the name of the results file */
		
		
		String filename="";
		int i = inputFilename.lastIndexOf('.');
		if (i > 0) {
		    filename = inputFilename.substring(0,i);
		}
		
		String resultsFilename = filename + "_out.txt";
		String officialResultsFilename = filename + "_expected.txt";
		
		/* Deleting results file (in case it exists) */
		File file = new File(resultsFilename);
		file.delete();

		/* Actual execution of the test by using input redirection and calling 
		/* OrdersProcessor.main(null) */
		TestingSupport.redirectStandardInputTo(inputFilename);
		ByteArrayOutputStream b = TestingSupport.redirectStandardOutputToByteArrayStream();
		
	
		Calendar.main(null);
		
		String output = b.toString();
		int ind = output.indexOf("Month Calendar");
	    if(ind >= 0) {
	    		output = output.substring(ind);
	    }
		
		
		TestingSupport.writeToFile(resultsFilename, output);
		
		/* Checking if we got the right results */
		assertTrue(TestingSupport.sameContents(resultsFilename, officialResultsFilename));
	}
	
	

}
