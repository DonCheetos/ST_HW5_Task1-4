package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 1947);
	    String string0 = nextDate0.run(1, 31, 1947);
	    assertEquals("2/1/1947", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 1947);
	    String string0 = nextDate0.run(2, 1947, 1947);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 1965);
	    String string0 = nextDate0.run(9, 31, 1965);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 1929);
	    String string0 = nextDate0.run(5, 30, 1929);
	    assertEquals("5/31/1929", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 2001);
	    String string0 = nextDate0.run(11, 30, 2001);
	    assertEquals("12/1/2001", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 1929);
	    String string0 = nextDate0.run(4, 12, 1929);
	    assertEquals("4/13/1929", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 1947);
	    String string0 = nextDate0.run(2, 31, 1947);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1224), (-1224), (-1224));
	    String string0 = nextDate0.run((-1224), (-1224), (-1224));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(0, 5, 5);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 5);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 1967);
	    String string0 = nextDate0.run(6, 30, 1967);
	    assertEquals("7/1/1967", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 28, 28);
	    String string0 = nextDate0.run(28, 28, 28);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 1843);
	    assertEquals("10/11/1843", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 6109);
	    String string0 = nextDate0.run(12, 31, 6109);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 1956);
	    String string0 = nextDate0.run(7, 31, 1956);
	    assertEquals("7/31/1956", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 1947);
	    String string0 = nextDate0.run(12, 31, 1947);
	    assertEquals("12/32/1947", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 1980);
	    String string0 = nextDate0.run(2, 28, 1980);
	    assertEquals("3/1/1980", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1843);
	    assertEquals("2/3/1843", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 1979);
	    String string0 = nextDate0.run(2, 29, 1979);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 1947);
	    String string0 = nextDate0.run(8, 8, 1947);
	    assertEquals("8/9/1947", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 1915);
	    String string0 = nextDate0.run(3, 3, 1915);
	    assertEquals("3/4/1915", string0);
	}

}