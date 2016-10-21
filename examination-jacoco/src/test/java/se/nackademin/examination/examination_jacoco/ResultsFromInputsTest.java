package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	@Test
	public void testNameLengthGettersAndSettersMethods() {
		
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
	}
	@Test
	public void testGenderGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForGender('M');
		assertEquals("The result should be M", resultsFromInputs.getResultForGender(), 'M');
	}
	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForAge(25); 
		assertEquals("The result should be 25", resultsFromInputs.getResultForAge() ,25);
	}
	@Test
	public void testHomeCityGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForHomeCity(2); 
		assertEquals("The result should be 2", resultsFromInputs.getResultForHomeCity() ,2);
	}

}
