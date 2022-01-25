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
    public void summe() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }

    @Test (expected = ArithmeticException.class)
    public void summeMitMAXInt() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = 23;
        testee.summe(value1, value2);
    }

    @Test
    public void summeMitMINint() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        assertTrue(testee.summe(value1, value2) == -2147483647);
    }

    @Test
    public void summeMitMINintMAXint() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.summe(value1, value2) == -1);
    }

    @Test
    public void summeMitNegativemInt() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = -10;
        int value2 = 3;
        assertTrue(testee.summe(value1, value2) == -7);
    }


    @Test
    public void summeMit0 () {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 0;
        int value2 = 10;
        assertTrue(testee.summe(value1, value2) == 10);
    }

    @Test
    public void summeMit00 () {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 0;
        int value2 = 0;
        assertTrue(testee.summe(value1, value2) == 0);
    }

    @Test
    public void summeMitNegativ2 () {
        SaveCalculator testee = new SaveCalculator();
        int value1 = -10;
        int value2 = -520;
        assertTrue(testee.summe(value1, value2) == -530);
    }


    //Testfälle zu Subtraktion
    @Test
    public void subtraktion() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.subtraktion(value1, value2) == -10);
    }

    @Test (expected = ArithmeticException.class)
    public void subtraktionMitMinInt() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = 23;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void subtraktionMitMAXint() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        assertTrue(testee.subtraktion(value1, value2) == 2147483646);
    }

    @Test
    public void subtraktionMitMINintMAXint() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.subtraktion(value1, value2) == 0);
    }

    @Test
    public void subtraktionMitNegativemInt() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = -10;
        int value2 = 3;
        assertTrue(testee.subtraktion(value1, value2) == -13);
    }


    @Test
    public void subtraktionMit0 () {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 0;
        int value2 = 10;
        assertTrue(testee.subtraktion(value1, value2) == -10);
    }

    @Test
    public void subtraktionMit00 () {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 0;
        int value2 = 0;
        assertTrue(testee.summe(value1, value2) == 0);
    }

    @Test
    public void subtraktionMitNegativ2 () {
        SaveCalculator testee = new SaveCalculator();
        int value1 = -10;
        int value2 = -10;
        assertTrue(testee.subtraktion(value1, value2) == 0);
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
