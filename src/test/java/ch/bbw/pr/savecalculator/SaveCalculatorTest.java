package ch.bbw.pr.savecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class SaveCalculatorTest {

    private SaveCalculator testee;

    @Before
    public void setUp() {
        testee = new SaveCalculator();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }


    //Testfälle zu Addition
    @Test
    public void summe() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }

    @Test(expected = ArithmeticException.class)
    public void summeMitMAXInt() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 23;
        testee.summe(value1, value2);
    }

    @Test
    public void summeMitMINint() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        assertTrue(testee.summe(value1, value2) == -2147483647);
    }

    @Test
    public void summeMitMINintMAXint() {
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.summe(value1, value2) == -1);
    }

    @Test
    public void summeMitNegativemInt() {
        int value1 = -10;
        int value2 = 3;
        assertTrue(testee.summe(value1, value2) == -7);
    }


    @Test
    public void summeMit0() {
        int value1 = 0;
        int value2 = 10;
        assertTrue(testee.summe(value1, value2) == 10);
    }

    @Test
    public void summeMit00() {
        int value1 = 0;
        int value2 = 0;
        assertTrue(testee.summe(value1, value2) == 0);
    }

    @Test
    public void summeMitNegativ2() {
        int value1 = -10;
        int value2 = -520;
        assertTrue(testee.summe(value1, value2) == -530);
    }


    //Testfälle zu Subtraktion
    @Test
    public void subtraktion() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.subtraktion(value1, value2) == -10);
    }

    @Test(expected = ArithmeticException.class)
    public void subtraktionMitMinInt() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 23;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void subtraktionMitMAXint() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        assertTrue(testee.subtraktion(value1, value2) == 2147483646);
    }

    @Test
    public void subtraktionMitMINintMAXint() {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.subtraktion(value1, value2) == 0);
    }

    @Test
    public void subtraktionMitNegativemInt() {
        int value1 = -10;
        int value2 = 3;
        assertTrue(testee.subtraktion(value1, value2) == -13);
    }


    @Test
    public void subtraktionMit0() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 0;
        int value2 = 10;
        assertTrue(testee.subtraktion(value1, value2) == -10);
    }

    @Test
    public void subtraktionMit00() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 0;
        int value2 = 0;
        assertTrue(testee.summe(value1, value2) == 0);
    }

    @Test
    public void subtraktionMitNegativ2() {
        int value1 = -10;
        int value2 = -10;
        assertTrue(testee.subtraktion(value1, value2) == 0);
    }

    //Testfälle zu Division

    @Test
    public void division() {
        int value1 = 20;
        int value2 = 10;
        assertTrue(testee.division(value1, value2) == 2);
    }

    @Test
    public void divisionMitMin() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 23;
        assertTrue(testee.division(value1, value2) == -93368854);
    }

    @Test
    public void divisionMitMAXint() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 2;
        assertTrue(testee.division(value1, value2) == 1073741823);
    }

    @Test
    public void divisionMitMINintMAXint() {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.division(value1, value2) == 1);
    }

    @Test
    public void divisionMitNegativemInt() {
        int value1 = -10;
        int value2 = 3;
        assertTrue(testee.division(value1, value2) == -3);
    }


    @Test
    public void divisionMit0() {
        int value1 = 0;
        int value2 = 10;
        assertTrue(testee.division(value1, value2) == 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionMit00() {
        int value1 = 0;
        int value2 = 0;
        assertTrue(testee.division(value1, value2) == 0);
    }

    @Test
    public void divisionMitNegativ2() {
        int value1 = -10;
        int value2 = -10;
        assertTrue(testee.division(value1, value2) == 1);
    }

    //sichtbarkeitstests
    // Geht nicht weil private
    //@Test
    //public void sichtbarkeitSumme() {
    //    SaveCalculator testee = new SaveCalculator();
    //    int value1 = 20;
    //    int value2 = 10;
    //    assertTrue(testee.summeprivate(value1, value2) == 30);
    //}

    @Test
    public void summeProtected() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summeprotected(value1, value2) == 30);
    }

    @Test
    public void summePkgProtected() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summepkgprotected(value1, value2) == 30);
    }

}
