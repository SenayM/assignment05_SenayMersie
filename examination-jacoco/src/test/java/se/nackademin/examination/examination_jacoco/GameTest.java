package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {
	Game game = new Game();
	
	@Test
	public void testrun() {
		
		ArrayList<String> values = new ArrayList<String>();
		game.collectInputData();
		values.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "10", "Ethiopian"));
		game.run(values);
	}

	@Test
	public void testMethod1() {
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
		int x = game.calculateOutPutBasedOnNames("Raf", "Silva");
		assertEquals("The result should be 1", x, 0);
		int y = game.calculateOutPutBasedOnNames("Rafae", "Silva");
		assertEquals("The result should be 1", y, 2);
	}
	@Test
	public void testCalculateGender() {
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 1", i, 0);
		int x = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", x, 1);
		int y = game.calculateOutPutBasedOnGender('N');
		assertEquals("The result should be 1", y, 2);
	}
	@Test
	public void testCalculateAge() {
		int i = game.calculateOutPutBasedOnAge(20);
		assertEquals("The result should be 1", i, 0);
		int y = game.calculateOutPutBasedOnAge(26);
		assertEquals("The result should be 1", y, 1);
	}
	@Test
	public void testCalculateBasedOnCity() {
		int a = game.calculateOutPutBasedOnHomeCity("a");
		assertEquals("The result should be 1", a, 0);
		int b = game.calculateOutPutBasedOnHomeCity("b");
		assertEquals("The result should be 1", b, 1);
		int c = game.calculateOutPutBasedOnHomeCity("c");
		assertEquals("The result should be 1", c, 2);
		int d = game.calculateOutPutBasedOnHomeCity("d");
		assertEquals("The result should be 1", d, 3);
		int e = game.calculateOutPutBasedOnHomeCity("e");
		assertEquals("The result should be 1", e, 4);
		int f = game.calculateOutPutBasedOnHomeCity("f");
		assertEquals("The result should be 1", f, 5);
		int g = game.calculateOutPutBasedOnHomeCity("g");
		assertEquals("The result should be 1", g, 6);
		int h = game.calculateOutPutBasedOnHomeCity("h");
		assertEquals("The result should be 1", h, 7);
		int i = game.calculateOutPutBasedOnHomeCity("i");
		assertEquals("The result should be 1", i, 8);
		int j = game.calculateOutPutBasedOnHomeCity("j");
		assertEquals("The result should be 1", j, 9);
		int k = game.calculateOutPutBasedOnHomeCity("k");
		assertEquals("The result should be 1", k, 10);
		
	}
	
	@Test
	public void testGeteGender() {
		/*ArrayList<String> arrayOfInput=new ArrayList<String>();
		arrayOfInput.add("Senay");
		char c=game.getGenderFromInputValues(arrayOfInput);
		System.out.println("The char is "+c);
		//assertEquals("The result should be 1", c, c);*/
		
	}
	

}
