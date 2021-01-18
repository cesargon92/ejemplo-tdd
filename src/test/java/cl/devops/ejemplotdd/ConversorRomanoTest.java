package cl.devops.ejemplotdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cl.devops.ejemplotdd.service.ConversorRomano;
import org.junit.jupiter.api.Test;

public class ConversorRomanoTest {


	//0 - , 1 - I, 2 - II, 3 - III, 4 - IV, 5 - V, 6 - VI, 7 - VII, 8 - VIII, 9 - IX, 10 - X, 
	//11 - XI, 12 - XII, 13 - XIII, 14 - XIV, 15 - XV, 16 - XVI, 17 - XVII, 18 - XVIII, 19 - XIX, 20 - XX
	//30 - XXX, 40 - XL, 50 - L, 60 - LX, 70 - LXX, 80 - LXXX, 90 - XC,100 - C, 500 - D
	
	@Test
	void testIntToRoman() {
		
		assertEquals("", ConversorRomano.intToRoman(0));
		assertEquals("I", ConversorRomano.intToRoman(1));
		assertEquals("II", ConversorRomano.intToRoman(2));
		assertEquals("III", ConversorRomano.intToRoman(3));
		assertEquals("IV", ConversorRomano.intToRoman(4));
		assertEquals("V", ConversorRomano.intToRoman(5));
		assertEquals("VI", ConversorRomano.intToRoman(6));
		assertEquals("VII", ConversorRomano.intToRoman(7));
		assertEquals("VIII", ConversorRomano.intToRoman(8));
		assertEquals("IX", ConversorRomano.intToRoman(9));
		assertEquals("X", ConversorRomano.intToRoman(10));
		assertEquals("XI", ConversorRomano.intToRoman(11));
		assertEquals("XII", ConversorRomano.intToRoman(12));
		assertEquals("XIII", ConversorRomano.intToRoman(13));
		assertEquals("XIV", ConversorRomano.intToRoman(14));
		assertEquals("XV", ConversorRomano.intToRoman(15));
		assertEquals("XIX", ConversorRomano.intToRoman(19));
		assertEquals("XX", ConversorRomano.intToRoman(20));
		assertEquals("XXV", ConversorRomano.intToRoman(25));
		assertEquals("XXIX", ConversorRomano.intToRoman(29));
		assertEquals("XXX", ConversorRomano.intToRoman(30));
		assertEquals("XL", ConversorRomano.intToRoman(40));
		assertEquals("LXXXVII", ConversorRomano.intToRoman(87));
		assertEquals("XCIX", ConversorRomano.intToRoman(99));
		assertEquals("C", ConversorRomano.intToRoman(100));
		assertEquals("D", ConversorRomano.intToRoman(500));
		assertEquals("CMXCIX", ConversorRomano.intToRoman(999));
	}

}
