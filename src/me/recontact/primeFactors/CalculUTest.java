package me.recontact.primeFactors;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculUTest {

	@Test
	public void showPrimeFactorsShouldDisplayCorrectResult() {
		assertEquals(Calcul.showPrimeFactors(0),"0");		
		assertEquals(Calcul.showPrimeFactors(1),"1");
		assertEquals(Calcul.showPrimeFactors(2),"2");
		assertEquals(Calcul.showPrimeFactors(3),"3");
		assertEquals(Calcul.showPrimeFactors(4),"2x2");
		assertEquals(Calcul.showPrimeFactors(5),"5");
		assertEquals(Calcul.showPrimeFactors(6),"2x3");
		assertEquals(Calcul.showPrimeFactors(8),"2x2x2");
		assertEquals(Calcul.showPrimeFactors(9),"3x3");
		assertEquals(Calcul.showPrimeFactors(12),"2x2x3");
		assertEquals(Calcul.showPrimeFactors(25),"5x5");
		assertEquals(Calcul.showPrimeFactors(49),"7x7");
		assertEquals(Calcul.showPrimeFactors(121),"11x11");
		assertEquals(Calcul.showPrimeFactors(361),"19x19");
		assertEquals(Calcul.showPrimeFactors(360),"2x2x2x3x3x5");
	}

}
