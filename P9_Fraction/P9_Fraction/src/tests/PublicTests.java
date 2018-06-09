package tests;



import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import fraction.Fraction;

public class PublicTests {
	@Test
	public void test01Class() {
		Fraction f1 = new Fraction();	
	}
	
	@Test
	public void test02Class1() {
		Fraction f = new Fraction();
		Class<? extends Fraction> klass = f.getClass();
		String[] s = klass.toString().split("\\.");
		String className = s[s.length-1];
		assertEquals("Fraction", className);
	}
	
	@Test
	public void test03PrivateNumerator() {
		final Field fields[] =	Fraction.class.getDeclaredFields();
		boolean found = false;
		for (int i = 0; i < fields.length; ++i) {
			if(fields[i].getName().equals("numerator")){
				found = true;
				Object c1 = fields[i].getType();
				//
				//Object c2 = a.getClass();
				assertEquals(c1.toString(), "int");
				
				String[] t = fields[i].toString().split(" ");
				assertEquals(t[0],"private");
				break;
			}
		     
		}
		assertTrue(found);
	}
	
	
	@Test
	public void test04PrivateDenominator() {
		final Field fields[] =	Fraction.class.getDeclaredFields();
		boolean found = false;
		for (int i = 0; i < fields.length; ++i) {
			if(fields[i].getName().equals("denominator")){
				found = true;
				Object c1 = fields[i].getType();
				//
				//Object c2 = a.getClass();
				assertEquals(c1.toString(), "int");
				
				String[] t = fields[i].toString().split(" ");
				assertEquals(t[0],"private");
				break;
			}
		     
		}
		assertTrue(found);
	}
	
	@Test
	public void test05setNum() {
		Fraction f1 = new Fraction();
		f1.setNum(10);
	}

	
	@Test
	public void test06getNum() {
		Fraction f1 = new Fraction();
		f1.setNum(10);
		int t = f1.getNum();
		assertEquals(t,10);
	}
	
	
	@Test
	public void test07setNum() {
		Fraction f1 = new Fraction();
		f1.setDen(10);
	}

	
	@Test
	public void test08getNum() {
		Fraction f1 = new Fraction();
		f1.setDen(10);
		int t = f1.getDen();
		assertEquals(t,10);
	}
	
	
	@Test
	public void test09EmptyConstructor() {
		Fraction f1 = new Fraction();
		int t = f1.getNum();
		assertEquals(t,0);
		int t2 = f1.getDen();
		assertEquals(t2,1);
	}
	
	
	@Test
	public void test10NumConstructor() {
		Fraction f1 = new Fraction(10);
		int t = f1.getNum();
		assertEquals(t,10);
		int t2 = f1.getDen();
		assertEquals(t2,1);
	}
	
	
	@Test
	public void test11NumConstructor() {
		Fraction f1 = new Fraction(2,10);
		int t = f1.getNum();
		assertEquals(t,2);
		int t2 = f1.getDen();
		assertEquals(t2,10);
	}
	

	@Test
	public void test12toString0() {
		Fraction f1 = new Fraction();	
		String result = f1.toString();
		String expected = "0";
		assertEquals(expected, result);
	}
	

	@Test
	public void test13toString1() {
		Fraction f1 = new Fraction(10);	
		String result = f1.toString();
		String expected = "10";
		assertEquals(expected, result);
	}
	

	@Test
	public void test14toStringnNumDen() {
		Fraction f1 = new Fraction(3,4);	
		String result = f1.toString();
		String expected = "3/4";
		assertEquals(expected, result);
	}
	
}
