package ch.bbw.pr.savecalculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class SaveCalculatorTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }



    //Testfälle zu Addition
    @Test
    public void summeTrue() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }

    @Test
    public void summeFalse() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertFalse(testee.summe(value1, value2) == 40);
    }

    @Test (expected = ArithmeticException.class)
    public void summeMitMAXInt() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = 23;
        assertFalse(testee.summe(value1, value2) != 0);
    }

    //Testfälle zu Subtraktion

    @Test
    public void subtraktionTrue() { 
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.subtraktion(value1, value2) == -10);
    }

    @Test
    public void subtraktionFalse() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 30;
        assertFalse(testee.subtraktion(value1, value2) == -10);
    }

    //Testfälle zu Division

    @Test
    public void divisionTrue() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 5;
        assertTrue(testee.division(value1, value2) == 2);
    }

    @Test
    public void divisionFalse() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 3;
        assertFalse(testee.division(value1, value2) == 2);
    }
}
