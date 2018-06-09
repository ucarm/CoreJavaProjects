package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import stringpractice.MyStringUtils;

public class MyStringUtilsTest {

	MyStringUtils stu ; 
	
	@BeforeEach
	public void init() {
		stu = new MyStringUtils();
	}
	
	@DisplayName("Test Reverse method")
	@CsvFileSource(resources = "/reverseWord.csv")
	@ParameterizedTest(name = "Reversing word <{0}> and Expecting <{1}> ")
	public void testReverse(String word,String expected) {

		assertEquals(expected, stu.reverseWord(word));
	}
	
	@DisplayName("check if the word is palindrome")
	@ValueSource(strings = {"hannah","ana","bob","otto","Wow","Redder"})
	@ParameterizedTest(name = "Is word <{0} > Palindrome ?")
	public void testIsPalindrome(String word) {
		
		assertAll("Multiple Check",
				() -> assertEquals(word.toLowerCase()
							,stu.reverseWord(word).toLowerCase()
							,word+" is not equal to original word"),
				() -> assertTrue( stu.isPalidrome(word)," not a palidrome word" )
				);
		
	}

	@DisplayName("Test Count the occurrance of the letter")
	@CsvFileSource(resources = "/frequencyCounter.csv")
	@ParameterizedTest(name = "There should be {2} letter <{1}> in sentence <{0}>")
	public void testCountTheLetterFrequency(String sentence,char c,int expected) {
		
		assertEquals(expected, stu.countTheLetterFrequency(sentence, c) );
				
	}

	@DisplayName("Test Swith First LastName")
	@CsvFileSource(resources = "/switchFirst2Words.csv")
	@ParameterizedTest(name = "Reverse first 2 words of <{0}> should be <{1}>")
	public void testSwitchFirst2Words(String sentence,String expected) {
		
		assertEquals(expected,stu.switchFirst2WordsAndReturn(sentence)) ;
				
	}	
	


	
	
}
