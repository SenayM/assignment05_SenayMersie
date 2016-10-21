package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	
	
	
	@Test
	public void test1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Ethiopia"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	@Test
	public void testResultingString() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values3 = new ArrayList<String>();
		values3.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "10", "Ethiopia"));
		dataAnalysis.getResultStringNamesAndAge(values3) ;
	}
	@Test
	public void testResultingString2() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values2 = new ArrayList<String>();
		values2.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "30", "Ethiopia"));
		dataAnalysis.getResultStringNamesAndAge(values2) ;
	}
	@Test
	public void testResultingString21() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values21 = new ArrayList<String>();
		values21.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Ethiopia"));
		dataAnalysis.getResultStringNamesAndAge(values21) ;
	}
	
	
	@Test
	public void testResultingStringCityAge() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values3 = new ArrayList<String>();
		values3.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "29", "Et"));
		dataAnalysis.getResulStringHomecityAndAge(values3)  ;
	}
	@Test
	public void testResultingStringCityAge4() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values4 = new ArrayList<String>();
		values4.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "30", "Et"));
		dataAnalysis.getResulStringHomecityAndAge(values4)  ;
	}
	@Test
	public void testResultingStringCityAge5() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values5 = new ArrayList<String>();
		values5.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "10", "Ethiopian"));
		dataAnalysis.getResulStringHomecityAndAge(values5)  ;
	}

}
