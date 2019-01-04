package by.it.seroglazov.calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestParcer {

    @Test
    public void testScalarMultiAdd() throws CalcException {
        Parcer parcer = new Parcer();
        String res = parcer.calc("A=10.5+-4+1");
        assertEquals("7.5", res);
        res = parcer.calc("A=-3+0+6");
        assertEquals("3.0", res);
        res = parcer.calc("A=22.22+11.11+-1");
        assertEquals("32.33", res);
    }

    @Test
    public void testScalarMultiSub() throws CalcException {
        Parcer parcer = new Parcer();
        String res = parcer.calc("A=10.5-2.5-1");
        assertEquals("7.0", res);
    }

    @Test
    public void testScalarMultiMul() throws CalcException {
        Parcer parcer = new Parcer();
        String res = parcer.calc("A=20.45*3.4");
        assertEquals("69.53", res);
    }

    @Test
    public void testScalarMultiDiv() throws CalcException {
        Parcer parcer = new Parcer();
        String res = parcer.calc("A=38.25/15.3/2");
        assertEquals("1.25", res);
    }

    @Test(expected = CalcException.class)
    public void testScalarDivisionByZero() throws CalcException {
        Parcer parcer = new Parcer();
        String res = parcer.calc("A=16.1/0");
        fail();
    }

    @Test
    public void testMultiScalarArgument() throws CalcException {
        Parcer parcer = new Parcer();
        String res = parcer.calc("A=2+5.3");
        assertEquals("7.3", res);
        res = parcer.calc("B=A*3.5");
        assertEquals("25.55", res);
        res = parcer.calc("B1=B+0.11*-5");
        assertEquals("25.0", res);
        res = parcer.calc("B2=A/2-1");
        assertEquals("2.65", res);
    }
}